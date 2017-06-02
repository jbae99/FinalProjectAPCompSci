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
import javafx.event.EventHandler;
//import java.util.Random;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;



public class Controller extends Board {
    public void Controller() {


        ObservableList<Node> btns = super.getBtns().getChildren();

        for (Node btn : btns) {
            btn.setOnMouseClicked(me -> {
                if (btn.isVisible()) {
                    btn.setVisible(false);
                    btn.toFront();
                } else
                    btn.setVisible(true);

            });
        }
        int cntr = 0;

        ObservableList<Node> pics = super.getPics().getChildren();
        for (Node pic : pics) {
            pic.setOnMouseClicked(me -> {
                pic.setDisable(true);
                //btns.getChildren().get(cntr++).setDisable(false);
            });
        }
     /* @Override
    public Button[][] getBtnList(Button[][] btnList) {
        return super.getBtnList(btnList);
    }

    public setOnAction(event -> MouseEvent)
    {

        Button[][][][] btnList;
        int i;
        int j;
        if (getBtnList(btnList[i][j]).isSelected()) {
            btnList[i][j].setDisable(true);
        }

        else
        {
            Button.setDisable(true);
        }
    }
    */
    }
}
