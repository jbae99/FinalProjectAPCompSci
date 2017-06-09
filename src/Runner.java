import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.beans.property.SimpleStringProperty;

import java.util.Timer;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Runner extends Application {
    long startTime;
    long endTime;
    Timer t;
    long timeElapsed;
    private String[] split;
    private SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
    public SimpleStringProperty min, sec, sspTime;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Board.board(primaryStage);
        startTime = System.currentTimeMillis();

<<<<<<< HEAD

        Controller cntrl = new Controller(4);

=======
>>>>>>> origin/master
        primaryStage.show();
    }

    public Runner()
    {
        Timer t = new Timer();
        timeElapsed = 0;
        min = new SimpleStringProperty("00");
        sec = new SimpleStringProperty("00");
        sspTime = new SimpleStringProperty("00:00");
    }

    public void run() {
        setTimeElapsed(getTimeElapsed() + 1);
    }

    public void setTimeElapsed(long timeElapsed)
    {
        this.timeElapsed = timeElapsed;
        split = sdf.format(new Date(timeElapsed)).split(":");
        min.set(split[0]);
        sec.set(split[1]);
        sspTime.set(min.get() + ":" + sec.get());
    }

    public long getTimeElapsed(){
        return timeElapsed;
    }

    public long duration()
    {
        t.cancel();
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }

}