package mista1984gmail;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class HelloView implements View {
    @Override
    public Pane getPane() {
        Pane pane =new HBox();
        final Label label=new Label();
        final TextField field=new TextField();
        Button button=new Button("Show");
        button.setOnAction(e ->label.setText(field.getText()));
        pane.getChildren().setAll(label,field,button);
        return pane;
    }
}
