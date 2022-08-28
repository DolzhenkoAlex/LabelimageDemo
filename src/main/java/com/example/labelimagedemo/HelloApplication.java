package com.example.labelimagedemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {

        launch();
}

    @Override
    public void start(Stage myStage) throws IOException {
        myStage.setTitle("Use an Image in а Label");

        // Использовать панель поточной компоновки
        // типа FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();
        // выполнить выравнивание по центру
        rootNode.setAlignment(Pos.CENTER);
        // создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);
        // установить сцену на подмостках
        myStage.setScene(myScene);
        // создать представление указанного изображения
        ImageView hourglassIV = new ImageView("file:images/hourglass.png");
        // создать метку, содержащую изображение и текст
        Label hourglassLabel = new Label("Hourglass", hourglassIV);

        hourglassLabel.setContentDisplay(ContentDisplay.TOP);

        // ввести метку в граф сцены
        rootNode.getChildren() .add(hourglassLabel);
        // показать подмостки и сцену на них
        myStage. show ();
    }


}