import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class Board {

    public static void board(Stage primaryStage) {
        primaryStage.setTitle("Tile Match");



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(1);
        grid.setVgap(1);
        grid.setPadding(new Insets(1,1,1,1));



        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setScene(scene);


        HBox[][] hbList = new HBox[6][6];
        Button[][] btnList = new Button[6][6];

        for (int i = 0; i <6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                btnList[i][j] = new Button("Click Me!");
                btnList[i][j].setMinHeight(100);
                btnList[i][j].setMinWidth(100);

                grid.add(btnList[i][j], i, j);
            }
        }
;
    }

}
