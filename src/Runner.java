import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Timer;


public class Runner extends Application{

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        Board.board(primaryStage);
        long startTime = System.currentTimeMillis();

        primaryStage.show();
    }

    public String timer()
    {
        Timer t = new Timer();


    }



}