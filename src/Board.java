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

import java.util.Random;


public class Board {

    public static void board(Stage primaryStage) {
        primaryStage.setTitle("Tile Match");

        StackPane rootPane = new StackPane();


        Image img1 = new Image("bbtitle.jpg");
        Image img2 = new Image("beetle.jpg");
        Image img3 = new Image("csusm.jpg");
        Image img4 = new Image("dog.jpg");
        Image img5 = new Image("halo.jpg");
        Image img6 = new Image("javacup.jpg");
        Image img7 = new Image("johnny.jpg");
        Image img8 = new Image("luigi.jpg");
        Image img9 = new Image("mario.jpg");
        Image img10 = new Image("mushroom.jpg");
        Image img11 = new Image("origamiman.jpg");
        Image img12 = new Image("panda.jpg");
        Image img13 = new Image("Penguin.jpg");
        Image img14 = new Image("shrimp.jpg");
        Image img15 = new Image("skull.jpg");
        Image img16 = new Image("walter.jpg");
        Image img17 = new Image("weirdman.jpg");
        Image img18 = new Image("weirdmovie.jpg");




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
        Image[][] imgList = new Image[6][6];

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


        Random r = new Random();


        for (int i = 0; i<3; i++)
        {
            for(int j = 0;j<6;j++)
            {
                imgList[i][j] =
                pics.add(imgList[i][j], i, j);
            }
        }

        for(int i = 0; 2 < i < 6;i++)
        {
            for(int j = 0;j<6;j++)
            {
                imgList[i][j] =
                pics.add(imgList[i][j], i, j);
            }
        }




    }

}
