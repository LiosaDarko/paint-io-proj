package com.example.paintioproj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorController {
    @FXML
    private AnchorPane gameScene;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Rectangle playerColor;

    public void changeColor(ActionEvent event) {
        Color myColor = colorPicker.getValue();
        playerColor.setFill(myColor);
    }
}
