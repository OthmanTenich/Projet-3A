/**
 * Created by maxime on 08/12/2016.
 */

import controller.Edt;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private Stage primaryStage;
    private BorderPane root;
    private Edt edt;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("EDT-Prolog");
        initRoot();
        showFileOverview();
    }

    public void initRoot() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/root.fxml"));
        try {
            this.root = loader.load();
            Scene scene = new Scene((this.root));
            this.primaryStage.setScene(scene);
            this.primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showFileOverview(){

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/fileOverview.fxml"));
            AnchorPane fileOverview = loader.load();
            this.root.setCenter(fileOverview);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}