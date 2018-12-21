/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author mego
 */
public class TermsproJect extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox();
        vbox.setPrefWidth(110);

        GridPane root = new GridPane();

        root.setPadding(new Insets(10, 10, 10, 10));

        root.setVgap(10);
        root.setHgap(10);

        vbox.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        

        Label lab = new Label(" #Terms Of Donation:");

        lab.setPrefSize(350, 40);
        lab.setFont(Font.font(35));

        Label lab1 = new Label("1- The donor is healthy and does not suffer any contagious diseases.");

        lab1.setPrefSize(800, 40);
        root.add(lab1, 0, 2);
        lab1.setFont(Font.font(20));

        Label lab2 = new Label("2- The donor must be 18-65 years of age.");

        lab1.setPrefSize(800, 40);
        root.add(lab2, 0, 3);
        lab2.setFont(Font.font(20));

        Label lab3 = new Label("3- Donor weight should not be less than 50 kg.");

        lab3.setPrefSize(800, 40);
        root.add(lab3, 0, 4);
        lab3.setFont(Font.font(20));

        Label lab4 = new Label("4- Hemoglobin levels for men are 14 to 17 g and for females from 12-14g.");

        lab4.setPrefSize(800, 40);
        root.add(lab4, 0, 5);
        lab4.setFont(Font.font(20));

        Label lab5 = new Label("5- Be a pulse between 50-100 per minute.");

        lab5.setPrefSize(800, 40);
        root.add(lab5, 0, 6);
        lab5.setFont(Font.font(20));

        Label lab6 = new Label("6- The temperature should not exceed 37آ؛C.");

        lab6.setPrefSize(800, 40);
        root.add(lab6, 0, 7);
        lab6.setFont(Font.font(20));

        vbox.getChildren().addAll(lab, root);

        Scene scene = new Scene(vbox, 1000, 450);

        primaryStage.setTitle("Donation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
