import javafx.application.Application;
import javafx.stage.Stage;

public class Runner extends Application{

    public void start(Stage primaryStage) {

    Board.board(primaryStage);

    long startTime = System.currentTimeMillis();


    primaryStage.show();
    }


}