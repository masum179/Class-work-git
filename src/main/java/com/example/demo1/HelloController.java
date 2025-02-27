package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Mozammal Hossain Masum");
    }

    @FXML
    public void idButtonOnAction(ActionEvent actionEvent) {
        welcomeText.setText("2211403");
    }
}