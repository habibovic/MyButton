package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public MyButton green;
    @FXML
    public MyButton red;
    @FXML
    public MyButton blue;
    @FXML
    public MyButton yellow;
    @FXML
    public Label result;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        green.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               result.setText(green.getText());
               green.setStyle("-fx-background-color: GREEN;");

            }
        });
        red.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                result.setText(red.getText());
                red.setStyle("-fx-background-color: RED;");

            }
        });
        blue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                result.setText(blue.getText());
                blue.setStyle("-fx-background-color: BLUE;");

            }
        });
        yellow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                result.setText(yellow.getText());
                yellow.setStyle("-fx-background-color: YELLOW;");

            }
        });
    }

    private void setText(Label text) {

    }


}
