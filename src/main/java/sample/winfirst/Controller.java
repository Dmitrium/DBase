package sample.winfirst;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.winsecond.Window1;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private ImageView exit;
    @FXML
    private ImageView minimize;
    @FXML
    private TextField txtfield;
    @FXML
    private PasswordField txtfield1;
    @FXML
    private ImageView connn;
    @FXML
    private TextField txtfield11;
    public DBconnection dc;
    public static Connection conn;

    @FXML
    void minimize(MouseEvent event) {
        ((Stage)(txtfield1.getScene().getWindow())).setIconified(true);
    }
    @FXML
    void zoomedUP(MouseEvent event) {
        exit.setFitHeight(23);
        exit.setFitWidth(23);
    }
    @FXML
    void zoomedDOWN(MouseEvent event) {
        exit.setFitHeight(20);
        exit.setFitWidth(20);
    }
    @FXML
    void zoomedUPm(MouseEvent event) {
        minimize.setFitHeight(23);
        minimize.setFitWidth(23);
    }
    @FXML
    void zoomedDOWNm(MouseEvent event) {
        minimize.setFitHeight(20);
        minimize.setFitWidth(20);
    }
    @FXML
    void zoomedUPc(MouseEvent event) {
        connn.setFitHeight(37);
        connn.setFitWidth(37);
    }
    @FXML
    void zoomedDOWNc(MouseEvent event) {
        connn.setFitHeight(32);
        connn.setFitWidth(32);
    }
    @FXML
    void exit(MouseEvent event) {
System.exit(0);
    }

    @FXML
    void connect(MouseEvent event) throws Exception {
        boolean isConnect = false;
        try {
            dc = new DBconnection(txtfield11.getText(),txtfield1.getText());
            conn = dc.Connect();
            isConnect=true;
        } catch (Exception e){
            System.out.println(e);}
            if (isConnect){
                ((Stage) txtfield1.getScene().getWindow()).close();
                new Window1();
            }



    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
