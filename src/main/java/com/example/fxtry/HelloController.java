package com.example.fxtry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    public Label numLabel;
    public Button mainButton;
    public Button resetButton;
    int a = 0;

    public void StartAction(ActionEvent actionEvent) {
        a++;
        numLabel.setText(String.valueOf(a));
        if (a == 50){
            mainButton.setDisable(true);
            numLabel.setText("you win");

        }

    }

    public void ResetAction(ActionEvent actionEvent) {
        a=0;
        numLabel.setText(String.valueOf(0));
        mainButton.setDisable(false);
    }
}