import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

import java.util.Timer;
import java.util.TimerTask;

<<<<<<< HEAD

public class Runner extends Application {
    long startTime;
    public int timecounter;
    private Label timerLabel = new Label();
    private Timeline timeline;
    Timer t;
    Duration secondsElapsed;

    public static void main(String[] args) {
=======
public class Runner extends Application{
    long startTime;
    public int timecounter;
    Timer t;
    TimerTask task;
    Duration secondsElapsed;

    public static void main(String[] args){
>>>>>>> origin/master
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Board.board(primaryStage);
        startTime = System.currentTimeMillis();
        timerLabel.setText(secondsElapsed.toString());

        Button button = new Button();
        button.setText("Start Timer");


        Controller cntrl = new Controller();

        primaryStage.show();


    }

<<<<<<< HEAD
    public void timer(Timer t){
=======

    public void timer()
    {
        Timer t = new Timer();
>>>>>>> origin/master
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
