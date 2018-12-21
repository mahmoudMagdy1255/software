/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author sara
 */
public class DetailsOfproJect extends Application {

    Text info;

    @Override
    public void start(Stage primaryStage) {

        Font font = new Font("Tahoma", 14);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 0, 10));
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(70, 10, 10, 10));
        grid1.setAlignment(Pos.TOP_LEFT);
        grid1.setHgap(10);
        grid1.setVgap(10);

        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(130, 10, 10, 10));
        grid2.setAlignment(Pos.TOP_LEFT);
        grid2.setHgap(10);
        grid2.setVgap(10);

        GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(160, 10, 10, 10));
        grid3.setAlignment(Pos.TOP_LEFT);
        grid3.setHgap(10);
        grid3.setVgap(10);

        GridPane grid4 = new GridPane();
        grid4.setPadding(new Insets(190, 10, 10, 10));
        grid4.setAlignment(Pos.TOP_LEFT);
        grid4.setHgap(10);
        grid4.setVgap(10);

        GridPane grid5 = new GridPane();
        grid5.setPadding(new Insets(350, 10, 10, 10));
        grid5.setAlignment(Pos.TOP_LEFT);
        grid5.setHgap(10);
        grid5.setVgap(10);

        GridPane grid6 = new GridPane();
        grid6.setPadding(new Insets(425, 10, 10, 10));
        grid6.setAlignment(Pos.TOP_LEFT);
        grid6.setHgap(10);
        grid6.setVgap(10);

        GridPane grid7 = new GridPane();
        grid7.setPadding(new Insets(520, 10, 10, 10));
        grid7.setAlignment(Pos.TOP_LEFT);
        grid7.setHgap(10);
        grid.setVgap(10);

        info = new Text("Type Of Bloods");
        info.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 30));
        grid.add(info, 0, 0);

        info = new Text("Categorizing blood according to type helps prevent reactions when someone gets a blood transfusion.Red blood cells have markers on their\n"
                + "surface that characterize the cell type. These markers (also called antigens) are proteins and sugars that our bodies use to identify the blood\n"
                + "cells as belonging in us.\n"
                + "\n");
        info.setFont(font);
        grid1.add(info, 5, 3);

        info = new Text("The two main blood groups are ABO and Rh.\n"
                + "\n");

        info.setFont(Font.font("Forte", FontPosture.ITALIC, 20));
        grid2.add(info, 5, 3);
        info = new Text("    (1) The ABO blood system has four main types:-\n"
                + "\n");
        info.setFont(Font.font("Brush Script MT", FontWeight.EXTRA_BOLD, 20));
        grid3.add(info, 5, 3);

        info = new Text("         - Type A:\n"
                + "                 This blood type has a marker known as A.\n"
                + "         - Type B:\n"
                + "                 This blood type has a marker known as B.\n"
                + "         - Type AB:\n"
                + "                 This blood type has both A and B markers.\n"
                + "         - Type O:\n"
                + "                 This blood type has neither A or B markers.\n"
                + "\n");
        info.setFont(font);
        grid4.add(info, 5, 3);

        info = new Text("    (2) There are four major blood groups determined by the presence or absence of two antigens – A and B – on the surface of red blood cells.\n"
                + "        In addition to the A and B antigens,there is a protein called the Rh factor, which can be either present (+) or absent (–),creating the\n"
                + "        8 most common blood types (A+, A-, B+, B-, O+, O-, AB+, AB-)\n"
                + "\n");
        info.setFont(Font.font("Brush Script MT", FontWeight.EXTRA_BOLD, 20));
        grid5.add(info, 5, 3);

        info = new Text("       So, there are eight possible blood types:-\n"
                + "\n");
        info.setFont(Font.font("Brush Script MT", FontWeight.EXTRA_BOLD, 20));
        grid6.add(info, 5, 3);

        info = new Text("          - O negative:\n"
                + "                  This blood type doesn't have A or B markers, and it doesn't have Rh factor.\n"
                + "          - O positive:\n"
                + "                  This blood type doesn't have A or B markers, but it does have Rh factor. O positive blood is one of the two most common blood\n"
                + "                  types (the other being A positive).\n"
                + "          - A negative:\n"
                + "                  This blood type has A marker only.\n"
                + "          - A positive:\n"
                + "                  This blood type has A marker and Rh factor, but not B marker. Along with O positive, it's one of the two most common blood types.\n"
                + "          - B negative:\n"
                + "                  This blood type has B marker only.\n"
                + "          - B positive:\n"
                + "                  This blood type has B marker and Rh factor, but not A marker.\n"
                + "          - AB negative:\n"
                + "                  This blood type has A and B markers, but not Rh factor.\n"
                + "          - AB positive:\n"
                + "                  This blood type has all three types of markers — A, B, and Rh factor.\n"
                + "\n"
                + "\n"
                + "");
        info.setFont(font);
        grid7.add(info, 5, 3);

        StackPane root = new StackPane();

        Image i = new Image("project/800px_COLOURBOX4168554.jpg");
        ImageView imageView = new ImageView(i);
        imageView.setFitHeight(800);
        imageView.setFitWidth(1000);

        GridPane grid8 = new GridPane();
        grid8.setPadding(new Insets(130, 50, 10, 10));
        grid8.setAlignment(Pos.TOP_RIGHT);
        grid8.setHgap(10);
        grid8.setVgap(10);

        Image ic = new Image("project/أنواع_فصائل_الدم_ومميزاتها.jpg");
        ImageView imageView2 = new ImageView(ic);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(350);
        grid8.add(imageView2, 5, 3);

        GridPane grid9 = new GridPane();
        grid9.setPadding(new Insets(0, 10, 10, 0));
        grid9.setAlignment(Pos.TOP_LEFT);
        grid9.setHgap(10);
        grid9.setVgap(10);

        Image logo = new Image("project/BKLogo-V2.1.png");
        ImageView imageView3 = new ImageView(logo);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(150);
        grid9.add(imageView3, 0, 0);

        root.getChildren().addAll(imageView, grid, grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9);
        Scene scene = new Scene(root, 1000, 800);

        primaryStage.setTitle("Type of blood");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
