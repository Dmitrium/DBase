package sample.winfirst;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.winsecond.Window1;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    private TextField txtfield;
    @FXML
    private PasswordField txtfield1;
    @FXML
    private TextField txtfield11;
    public DBconnection dc;
    public static Connection conn;

    @FXML
    void minimize(MouseEvent event) {
        ((Stage)(txtfield1.getScene().getWindow())).iconifiedProperty();
    }

    @FXML
    void exit(MouseEvent event) {
System.exit(0);
    }

    @FXML
    void connect(MouseEvent event) throws Exception {
        try {
            dc = new DBconnection(txtfield1.getText(),txtfield11.getText());
            conn = dc.Connect();
            ((Stage) txtfield1.getScene().getWindow()).close();
            new Window1();
        } catch (Exception e){
            System.out.println("trubles");
        }


    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
