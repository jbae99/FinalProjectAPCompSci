import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Timer;


public class Runner extends Application{
    long startTime;
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        Board.board(primaryStage);
        startTime = System.currentTimeMillis();

        primaryStage.show();
    }

    public String timer()
    {
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                runOnUiThread(new Runnable())
                {
                    public void run()
                    {
                        coundown.setText(""+count);
                        count++;
                    }
                }
            }
        }
                t.cancel();
        long endTime = System.currentTimeMillis();
        long deltaTime = endTime - startTime;
        double secondsElapsed = deltaTime/1000.0;
    }


}

