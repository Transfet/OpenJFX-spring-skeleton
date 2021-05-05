package hu.transfet.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXStarter extends Application {

    @Override
    @SuppressWarnings("ConstantConditions")
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("OpenJFX + Spring + Java 11");
        primaryStage.show();

    }
}
