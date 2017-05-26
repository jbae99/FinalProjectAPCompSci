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

import java.util.ArrayList;
import java.util.Random;


public class Board {

    public static void board(Stage primaryStage) {
        primaryStage.setTitle("Tile Match");

        StackPane rootPane = new StackPane();
        ArrayList<Image> imgs = new ArrayList<>();

        imgs.add(new Image("bbtitle.jpg"));
        imgs.add(new Image("beetle.jpg"));
        imgs.add(new Image("csusm.jpg"));
        imgs.add(new Image("dog.jpg"));
        imgs.add(new Image("halo.jpg"));
        imgs.add(new Image("javacup.jpg"));
        imgs.add(new Image("johnny.jpg"));
        imgs.add(new Image("luigi.jpg"));
        imgs.add(new Image("mario.jpg"));
        imgs.add(new Image("mushroom.jpg"));
        imgs.add(new Image("origamiman.jpg"));
        imgs.add(new Image("panda.jpg"));
        imgs.add(new Image("Penguin.jpg"));
        imgs.add(new Image("shrimp.jpg"));
        imgs.add(new Image("skull.jpg"));
        imgs.add(new Image("walter.jpg"));
        imgs.add(new Image("weirdman.jpg"));
        imgs.add(new Image("weirdmovie.jpg"));




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
