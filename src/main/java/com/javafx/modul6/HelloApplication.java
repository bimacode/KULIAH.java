package com.javafx.modul6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Scanner;

import java.io.IOException;

public class HelloApplication extends Application {
    Scanner sc = new Scanner(System.in);

    @Override
    public void start(Stage primarystage) throws IOException {
        primarystage.setTitle("Form Login");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene(grid,300 , 275);
        primarystage.setScene(scene);

        Text scenetext = new Text("Welcome");
        scenetext.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        grid.add(scenetext,0,0,2,1);

        Label username = new Label ("Username");
        grid.add(username,0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);

        Label pw = new Label("Password");
        grid.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
        primarystage.show();

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.BLACK);
                actiontarget.setText("sign in button pressed");
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}