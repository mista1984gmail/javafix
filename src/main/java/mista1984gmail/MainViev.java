package mista1984gmail;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class MainViev implements View {
    public Pane getPane() {
        Pane pane =new VBox();
        final Label label=new Label();
        final TextField field=new TextField();
        Button button=new Button("Show");
        button.setOnAction(e ->label.setText(field.getText()));
        pane.getChildren().setAll(label,field,button);
        return pane;
    }
}
