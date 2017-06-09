import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class Runner extends Application{
    long startTime;
    public int timecounter;
    Timer t;
    TimerTask task;
    Duration secondsElapsed;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        Board.board(primaryStage);
        startTime = System.currentTimeMillis();


        Controller cntrl = new Controller(4);

        primaryStage.show();


    }


    public void timer()
    {
        Timer t = new Timer();
        timecounter = 0;
    }

    public void run() {
        setTimeCounter(getTimeCounter() + 1);
    }

    public int getTimeCounter() {
        return timecounter;
    }

    public void setTimeCounter(int timecounter) {
        this.timecounter = timecounter;

    }

    public double duration()
    {
        t.cancel();
        long endTime = System.currentTimeMillis();
        long deltaTime = endTime - startTime;
        double secondsElapsed = deltaTime / 1000.0;
        return secondsElapsed;
    }


}

