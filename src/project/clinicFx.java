
package Task;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class clinicFx extends Application{

    @Override
    public void start(Stage primaryStage) {
    	
    	BorderPane bp = new BorderPane();
    	bp.setPadding(new Insets(10,50,50,50));
        
        
    	GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets (20,20,20,20));
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        
        Text login = new Text("Login");        
        login.setId("login");
        login.setFont(Font.font("tahoma", FontWeight.BOLD, 28));
        login.setEffect(dropShadow);
        
        
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,20,20,30));
        
        bp.setId("bp");
        hb.getChildren().add(login);
        
        
        Label L1 = new Label ("User Id");
        Label L2 = new Label ("Password");
        Label L3 = new Label ("Type");
        
        L1.setFont(Font.font("tahoma", FontWeight.NORMAL, 15));
        L2.setFont(Font.font("tahoma", FontWeight.NORMAL, 15));
        L3.setFont(Font.font("tahoma", FontWeight.NORMAL, 15));
        
        L1.setTextFill(Color.WHITE);
        L2.setTextFill(Color.WHITE);
        L3.setTextFill(Color.WHITE);
        
        
        
        TextField T1 = new TextField();
         TextField T2 = new TextField();
         
         ComboBox comboBox = new ComboBox();
         
         ObservableList CountrycomboList = FXCollections.observableArrayList(
        		 							("Reception States"),
        		 							("Reception") );    
         
         comboBox.setMaxWidth(200);
         comboBox.setItems(CountrycomboList); 

         
        grid.add(L1,0,1);
        grid.add(T1,1,1);
        grid.add(L2,0,2);
        grid.add(T2,1,2);
        grid.add(L3,0,3);
        grid.add(comboBox,1,3);
        
        Button btn1 = new Button("log in");
        Button btn2 = new Button("Exit");
        
        btn1.setId("btnLogin");
        btn2.setId("btnExit");
        
        HBox hbtn1 = new HBox(70);
         
         
        hbtn1.getChildren().add(btn1);
        hbtn1.getChildren().add(btn2);
         
        grid.add(hbtn1,1,7);
        
        bp.setTop(hb);
        bp.setCenter(grid); 
        
        Scene scene = new Scene (bp , 400 , 300);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("login.css").toExternalForm());
        primaryStage.setTitle("Log in ;)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }
}
