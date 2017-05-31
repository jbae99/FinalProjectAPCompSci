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

    private static Button[][] btnList = new Button[6][6];
    private static ImageView[][] imgList = new ImageView[6][6];
    private static GridPane btns = new GridPane();
    private static GridPane pics = new GridPane();

    public static void board(Stage primaryStage) {
        primaryStage.setTitle("Tile Match");

        StackPane rootPane = new StackPane();
        ArrayList<ImageView> imgs = new ArrayList<>();

        imgs.add(new ImageView("bbtitle.jpg"));
        imgs.add(new ImageView("beetle.jpg"));
        imgs.add(new ImageView("csusm.jpg"));
        imgs.add(new ImageView("dog.jpg"));
        imgs.add(new ImageView("halo.jpg"));
        imgs.add(new ImageView("javacup.jpg"));
        imgs.add(new ImageView("johnny.jpg"));
        imgs.add(new ImageView("luigi.jpg"));
        imgs.add(new ImageView("mario.jpg"));
        imgs.add(new ImageView("mushroom.jpg"));
        imgs.add(new ImageView("origamiman.jpg"));
        imgs.add(new ImageView("panda.jpg"));
        imgs.add(new ImageView("Penguin.jpg"));
        imgs.add(new ImageView("shrimp.jpg"));
        imgs.add(new ImageView("skull.jpg"));
        imgs.add(new ImageView("walter.jpg"));
        imgs.add(new ImageView("weirdman.jpg"));
        imgs.add(new ImageView("weirdmovie.jpg"));
        imgs.add(new ImageView("bbtitle.jpg"));
        imgs.add(new ImageView("beetle.jpg"));
        imgs.add(new ImageView("csusm.jpg"));
        imgs.add(new ImageView("dog.jpg"));
        imgs.add(new ImageView("halo.jpg"));
        imgs.add(new ImageView("javacup.jpg"));
        imgs.add(new ImageView("johnny.jpg"));
        imgs.add(new ImageView("luigi.jpg"));
        imgs.add(new ImageView("mario.jpg"));
        imgs.add(new ImageView("mushroom.jpg"));
        imgs.add(new ImageView("origamiman.jpg"));
        imgs.add(new ImageView("panda.jpg"));
        imgs.add(new ImageView("Penguin.jpg"));
        imgs.add(new ImageView("shrimp.jpg"));
        imgs.add(new ImageView("skull.jpg"));
        imgs.add(new ImageView("walter.jpg"));
        imgs.add(new ImageView("weirdman.jpg"));
        imgs.add(new ImageView("weirdmovie.jpg"));


        btns.setAlignment(Pos.CENTER);
        btns.setHgap(1);
        btns.setVgap(1);
        btns.setPadding(new Insets(1,1,1,1));


        pics.setAlignment(Pos.CENTER);
        pics.setHgap(1);
        pics.setVgap(1);
        pics.setPadding(new Insets(1,1,1,1));

        rootPane.getChildren().addAll(pics, btns);

        Scene scene = new Scene(rootPane, 900, 900);
        primaryStage.setScene(scene);


        for (int i = 0; i <6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                btnList[i][j] = new Button("Click Me!");
                btnList[i][j].setPrefWidth(150);
                btnList[i][j].setPrefHeight(150);
                btns.add(btnList[i][j], i, j);

                int r = (int) (Math.random()*imgs.size());
                imgList[i][j] = retrieve(imgs, r);
                imgList[i][j].setFitHeight(150);
                imgList[i][j].setFitWidth(150);
                imgList[i][j].setPreserveRatio(true);
                remove(imgs, r);
                pics.add(imgList[i][j], i, j);
            }
        }

    }

    public static ImageView retrieve(ArrayList<ImageView> imgs, int i)
    {
        return imgs.get(i);
    }
    public static void remove(ArrayList imgs, int i)
    {
        imgs.remove(i);
    }

    public Button[][] getBtnList()
    {
        return btnList;
    }
    public ImageView[][] getImgList()
    {
        return imgList;
    }
    public GridPane getBtns()
    {
        return btns;
    }
    public GridPane getPics()
    {
        return pics;
    }

}
