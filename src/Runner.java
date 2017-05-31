import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;


public class Runner extends Application{
    long startTime;
    private int timecounter;
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
       timecounter = 0;
        TimerTask one = new TimerTask();
        t.scheduleAtFixedRate(new TimerTask() {
            public void run() {
             setTimeCounter(getTimeCounter()+1);
            }
        }
    public int getTimeCounter(){
        return timecounter;
    }

    public void setTimeCounter(int timecounter){
        this.timecounter = timecounter;
    }
                t.cancel();
        long endTime = System.currentTimeMillis();
        long deltaTime = endTime - startTime;
        double secondsElapsed = deltaTime/1000.0;
        return deltaTime;
    }


}

