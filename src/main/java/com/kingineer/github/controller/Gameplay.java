package com.kingineer.github.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Gameplay {

    @FXML
    private Canvas game;

    @FXML
    private Label gameState;

    @FXML
    private ProgressBar p1BoostMeter;

    @FXML
    private Label p1Identity;

    @FXML
    private ProgressBar p1PowerMeter;

    @FXML
    private ProgressBar p2BoostMeter;

    @FXML
    private Label p2Identity;

    @FXML
    private ProgressBar p2PowerMeter;

    @FXML
    private Button pauseBtn;

    @FXML
    private VBox playArea;

    @FXML
    void initialize() {

    }

    @FXML
    void onActionPauseGame(ActionEvent event) {

    }

    @FXML
    void onActionShowMenu(ActionEvent event) {

    }

    @FXML
    void onKeyPressed(KeyEvent event) {

    }

    @FXML
    void onKeyReleased(KeyEvent event) {

    }

}
