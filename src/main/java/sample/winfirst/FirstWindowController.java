package sample.winfirst;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import sample.winsecond.SecondWindow;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;


// контроллер для окна авторизации


public class FirstWindowController implements Initializable{

    @FXML
    private ImageView exit;
    @FXML
    private ImageView minimize;
    @FXML
    private PasswordField txtfield1;
    @FXML
    private ImageView connn;
    @FXML
    private TextField txtfield11;
    public DBconnection dc;
    public static Connection conn;

    @FXML
    void minimize(MouseEvent event) {         //свернуть окно
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
    void exit(MouseEvent event) {            //закрыть окно
System.exit(0);
    }
    @FXML
    void connect(MouseEvent event) {             //кнопка подключения к БД
        try {
            dc = new DBconnection(txtfield11.getText(),txtfield1.getText());
            conn = dc.Connect();
                ((Stage) txtfield1.getScene().getWindow()).close();
                    new SecondWindow();
                } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Content here", ButtonType.OK);
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.show();
                }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
