package sample.test123;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage mainstage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Home Page");
        stage.setScene(scene);
        mainstage = stage;
        stage.show();
    }



    public static void  gotoscreen(String locatie) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(sample.test123.HelloApplication.class.getResource(locatie + ".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            mainstage.setTitle("List Page");
            mainstage.setScene(scene);
            mainstage.show();
        }





    public static void main(String[] args) {
        launch();
    }
}