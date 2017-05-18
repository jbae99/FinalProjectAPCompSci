import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class Board {

    public static void board(Stage primaryStage) {
        primaryStage.setTitle("Tile Match");

        StackPane rootPane = new StackPane();


        GridPane btns = new GridPane();
        btns.setAlignment(Pos.CENTER);
        btns.setHgap(1);
        btns.setVgap(1);
        btns.setPadding(new Insets(1,1,1,1));
        GridPane pics = new GridPane();
        pics.setAlignment(Pos.CENTER);
        pics.setHgap(1);
        pics.setVgap(1);
        pics.setPadding(new Insets(1,1,1,1));

        rootPane.getChildren().addAll(pics, btns);

        Scene scene = new Scene(rootPane, 900, 900);
        primaryStage.setScene(scene);


        Button[][] btnList = new Button[6][6];
        ImageView[][] imgList = new ImageView[6][6];

        for (int i = 0; i <6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                btnList[i][j] = new Button("Click Me!");
                btnList[i][j].setPrefWidth(150);
                btnList[i][j].setPrefHeight(150);
                btns.add(btnList[i][j], i, j);

            }
        }




    }

}
