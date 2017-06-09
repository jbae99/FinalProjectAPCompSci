import javafx.collections.ObservableList;

import javafx.application.Application;
import javafx.collections.ObservableListBase;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
//import javafx.scene.control.Control;
//import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
//import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javafx.event.EventHandler;
//import java.util.Random;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;



public class Controller extends Board {

    public Controller(){

    }
    public Controller(int i){
        ObservableList<Node> btns = super.getBtns().getChildren();
        Controller cntrl = new Controller();

        for(Node btn : btns)
        {
            btn.setOnMouseClicked(me ->
                    cntrl.click());
        }

    }



    public void click() {

        Button[][] btnList = super.getBtnList();
        ImageView[][] imgList = super.getImgList();
        Timer timer = new Timer();


        for (int k = 0; k < 6; k++) {
            for (int l = 0; l < 6; l++) {
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (btnList[k][l].isVisible() && btnList[i][j].isVisible()) {
                                btnList[k][l].setVisible(false);
                                btnList[k][l].toFront();
                            }
                            else if (btnList[k][l].isVisible() && !btnList[i][j].isVisible())
                            {
                                if (imgList[i][j] == imgList[k][l])
                                {
                                    btnList[k][l].setVisible(false);
                                    btnList[i][j].setVisible(false);
                                }
                                else
                                {

                                    btnList[k][l].setVisible(true);
                                    btnList[i][j].setVisible(true);
                                }
                            }
                            else
                            {
                                btnList[k][l].setVisible(true);
                            }
                        }
                    }
                }
            }
        }
    }

       /* int cntr = 0;

        ObservableList<Node> pics = super.getPics().getChildren();
        for (Node pic : pics) {
            pic.setOnMouseClicked(me -> {
                pic.setDisable(true);
                //btns.getChildren().get(cntr++).setDisable(false);
            });
        }
        */


