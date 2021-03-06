package mista1984gmail;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Panel implements View {

    private List<Pane>panes;
    private Pane parent;
    public Panel(Pane parent,Pane...panes){
        this.panes= Arrays.asList(panes);
        this.parent=parent;
    };


    @Override
    public Pane getPane() {
        Pane pane =new VBox();
        Pane hbox= new HBox();
        int i=0;

        for(Pane p:panes){
            Button button=new Button();
            button.setText(String.valueOf(i++));
            button.setOnAction(e ->{
                parent.getChildren().clear();
                parent.getChildren().add(p);

            });

            hbox.getChildren().add(button);
        }



        return null;
    }
}
