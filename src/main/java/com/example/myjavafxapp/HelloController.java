package com.example.myjavafxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    public Button btn_close;
    public Button btn_Cam;
    public ImageView currentFrame;
    boolean CameraOn = false;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void close(){
        javafx.application.Platform.exit();
    }
    @FXML
    protected void startCamera(){
        btn_Cam.setText("stop recording");
        if (!CameraOn){
            btn_Cam.setText("stop recording");
        } else {
            btn_Cam.setText("start recording");
        }
    }
}