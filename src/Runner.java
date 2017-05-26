import javafx.application.Application;
import javafx.stage.Stage;

public class Runner extends Application{

    public void start(Stage primaryStage) {

    Board.board(primaryStage);

    long startTime = System.currentTimeMillis();


    primaryStage.show();
    }

    public String getRemainingTime() {
        int hours = (int) ((this.remainingTime / 3600000) % 60);
        int minutes = (int) ((this.remainingTime / 60000) % 60);
        int seconds = (int) ((this.remainingTime / 1000) % 60);

        return (format.format(hours) + ":" + format.format(minutes) + ":" + format.format(seconds));
    }
}

