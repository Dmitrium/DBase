package sample.winsecond;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class SecondWindow {             //класс второго окна

    public SecondWindow() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/secondWindow.fxml"));
        Parent load = loader.load();
        Stage primaryStage = new Stage();
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(load, 1450, 800);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
