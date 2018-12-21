/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Eng Maruoma Mohamed
 */
public class ProJect extends Application {
    Stage primaStage;
    
    @Override
    public void start(Stage primaryStage) {
        
        this.primaStage = primaryStage;
        
        GridPane gridFooter = new GridPane();
        gridFooter.setAlignment(Pos.BOTTOM_RIGHT);
        gridFooter.setPadding(new Insets(5, 10, 10, 10));

        Button Next = new Button("Next ->");
        
        
        
        Next.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Next.setTextFill(Color.WHITE);
        gridFooter.add(Next, 0, 12);
        Next.setDisable(false);
        Next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                HomeproJect home = new HomeproJect();
                }catch(Exception e){
                    System.out.println("exception" + e.getMessage());
                }
        
            }
        });
        
        StackPane root = new StackPane();

        Image i = new Image("02.jpg");
        ImageView imageView = new ImageView(i);
        root.getChildren().addAll(imageView, gridFooter);
        imageView.setFitHeight(800);
        imageView.setFitWidth(1000);

        Scene scene = new Scene(root, 1000, 800);

        primaryStage.setTitle("First Page ^_^");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    public Scene getScene(){
        try{
            System.out.println(primaStage.getScene().getClass());
        
            
        }catch(Exception e){
           e.printStackTrace();
        }finally{
            return primaStage.getScene();
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
