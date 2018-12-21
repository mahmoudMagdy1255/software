/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import static javafx.application.Application.launch;


import java.sql.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mego
 */
public class HomeproJect extends Application{

    Text info;
    
    Stage primaStage;
    
    
    public void project(Stage primaryStage) {
        
        this.primaStage = primaryStage;

        Font font = new Font("Tahoma", 14);
        Font Font = new Font("Bahnschrift Condensed", 40);
        Font font1 = new Font("Forte", 20);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setPadding(new Insets(5, 10, 10, 10));

        GridPane gridHome = new GridPane();
        gridHome.setAlignment(Pos.TOP_CENTER);
        gridHome.setPadding(new Insets(110, 10, 10, 10));

        GridPane gridHome1 = new GridPane();
        gridHome1.setAlignment(Pos.TOP_LEFT);
        gridHome1.setPadding(new Insets(80, 10, 10, 10));


        GridPane gridHome3 = new GridPane();
        gridHome3.setAlignment(Pos.TOP_CENTER);
        gridHome3.setPadding(new Insets(560, 10, 10, 10));

        GridPane gridHome4 = new GridPane();
        gridHome4.setAlignment(Pos.TOP_LEFT);
        gridHome4.setPadding(new Insets(610, 10, 10, 37));

        GridPane gridHome5 = new GridPane();
        gridHome5.setAlignment(Pos.TOP_LEFT);
        gridHome5.setPadding(new Insets(650, 10, 10, 10));

        GridPane gridFooter = new GridPane();
        gridFooter.setAlignment(Pos.BOTTOM_CENTER);
        gridFooter.setPadding(new Insets(20, 20, 20, 20));
        

        Label l = new Label("Blood Bank");
        l.setFont(Font);
        l.setTextFill(Color.RED);
        gridHome.add(l, 20, 20);

        Label l1 = new Label("Description :-");
        l1.setFont(font1);
        gridHome.add(l1, 20, 20);

        info = new Text("Blood bank: :A place where blood is collected from donors, typed, separated into components, stored,and prepared for transfusion \n"
                + "to recipients. A blood bank may be a separate free-standing facility or part of a larger laboratory in a hospital.\n"
                + "\n"
                + "Separation of blood: Typically, each donated unit of blood (whole blood) is separated into multiple components,such as red blood cells,\n"
                + "plasma and platelets. Each component is generally transfused to a different individual,each with different needs.\n"
                + "\n"
                + "An increasingly common blood bank procedure is apheresis, or the process of removing a specific component of the blood,such as platelets,\n"
                + "and returning the remaining components, such as red blood cells and plasma, to the donor.This process allows more of one particular part of\n"
                + "the blood to be collected than could be separated from a unit of whole blood. Apheresis is also performed to collect plasma (the liquid part\n"
                + "of the blood) and granulocytes (white blood cells).\n"
                + "\n"
                + "Storage of blood: Each unit of whole blood is normally separated into several components. Red blood cells may be stored under refrigeration\n"
                + "for a maximum of 42 days, or they may be frozen for up to 10 years. Red cells carry oxygen and are used to treat anemia. Platelets are important\n"
                + "in the control of bleeding and are generally used in patients with leukemia and other forms of cancer. Platelets are stored at room temperature\n"
                + "and may be kept for a maximum of five days. Fresh frozen plasma, used to control bleeding due to low levels of some clotting factors,is usually\n"
                + "kept in the frozen state for up to one year.Cryoprecipitated AHF, which contains only a few specific clotting factors, is made from fresh frozen\n"
                + "plasma and may be stored frozen for up to one year. Granulocytes are sometimes used to fight infections, although their efficacy is not well-\n"
                + "established.They must be transfused within 24 hours of donation.\n"
                + "\n"
                + "American Association of Blood Banks (AABB): The AABB is a key international association of blood banks, including hospital and community blood\n"
                + "centers, transfusion and transplantation services and individuals involved in transfusion and transplantation medicine. The AABB establishes the\n"
                + "standards of care for patients and donors in all aspects of blood banking; transfusion medicine; hematopoietic, cellular and gene therapies; and\n"
                + "tissue transplantation. More than 2000 community and hospital blood banks, hospital transfusion services and laboratories and over 8000 individuals\n"
                + "from the US and 80 countries outside the US make up the AABB.");
        info.setFont(font);
        gridHome.add(info, 5, 5);

        Label l2 = new Label("Type Of Blood :-");
        l2.setFont(font1);
        gridHome1.add(l2, 20, 20);

        info = new Text("Typing and testing blood: After blood is drawn, it is tested for the ABO blood group type and the Rh type (positive or negative), as well as\n"
                + "for any unexpected red blood cell antibodies that may cause problems in the recipient. Screening tests are also performed for evidence of donor\n"
                + "infection with hepatitis viruses B and C, human immunodeficiency viruses (HIV) 1 and 2, human T-lymphotropic viruses (HTLV) I and II and syphilis.\n");
        info.setFont(font);
        gridHome3.add(info, 5, 5);

        Label seeMore = new Label("See More.");
        seeMore.setFont(Font.font("Brush Script MT", FontWeight.EXTRA_BOLD, 20));
        gridHome4.add(seeMore, 20, 20);
        seeMore.setBackground(new Background(new BackgroundFill(Color.LAVENDER, CornerRadii.EMPTY, Insets.EMPTY)));
        
        seeMore.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                details(primaryStage);
            }
            
        
        });
        
        
        Label Term = new Label("Terms Of Donation.");
        Term.setFont(Font.font("Forte", FontWeight.BOLD, FontPosture.ITALIC, 30));
        gridHome4.add(Term, 20, 100);
        Term.setBackground(new Background(new BackgroundFill(Color.LAVENDER, CornerRadii.EMPTY, Insets.EMPTY)));
        Term.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                termOdDonation(primaryStage);
            }
            
        
        });
        
        Button Back = new Button("<- Back");
        
        
        Back.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Back.setTextFill(Color.WHITE);
        
        Back.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                start(primaryStage);
        
            }
        });
        
        
        Button Next = new Button("Admin Login");
        Next.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Next.setTextFill(Color.WHITE);
        Next.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                adminLogin(primaryStage);
        
            }
        });
        
    
        Button ContactUs = new Button();
        ContactUs.setText("Contact Us");
        ContactUs.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        ContactUs.setTextFill(Color.WHITE);
        
        ContactUs.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
                primaryStage.hide();
                contact(primaryStage);
            }
        });
        
        HBox hBox = new HBox(20);
        
        hBox.getChildren().addAll(Back , ContactUs , Next);
        
        gridFooter.add(hBox, 0, 0);
        
        Image i = new Image("project/800px_COLOURBOX4168554.jpg");
        ImageView imageView = new ImageView(i);
        imageView.setFitHeight(800);
        imageView.setFitWidth(1000);

        GridPane gridHome6 = new GridPane();
        gridHome6.setPadding(new Insets(0, 10, 10, 0));
        gridHome6.setAlignment(Pos.TOP_LEFT);
        gridHome6.setHgap(10);
        gridHome6.setVgap(10);

        Image logo = new Image("project/BKLogo-V2.1.png");
        ImageView imageView2 = new ImageView(logo);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(150);
        gridHome6.add(imageView2, 0, 0);

        
       
        
        
        StackPane root = new StackPane();
        root.getChildren().addAll(
        		imageView, 
        		gridHome, 
        		gridHome1 , gridHome3 , 
                        gridHome4 ,  gridHome6 , 
                        gridFooter
                );
        
        
        
        
        
 
        Scene scene = new Scene(root, 1000, 800);
        
        primaryStage.setTitle("Blood Bank");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void details(Stage primaryStage) {

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
    
    @Override
    public void start(Stage primaryStage) {
                
        GridPane gridFooter = new GridPane();
        gridFooter.setAlignment(Pos.BOTTOM_RIGHT);
        gridFooter.setPadding(new Insets(5, 10, 10, 10));

        Button Next = new Button("Next ->");
        
        
        
        Next.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Next.setTextFill(Color.WHITE);
        gridFooter.add(Next, 0, 12);
        Next.setDisable(false);
        Next.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                project(primaryStage);
        
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
    
    public void adminLogin(Stage primaryStage) {
    
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
        
        
        Label L1 = new Label ("Email");
        Label L2 = new Label ("Password");
        
        Text error = new Text(); 
        
        L1.setFont(Font.font("tahoma", FontWeight.NORMAL, 15));
        L2.setFont(Font.font("tahoma", FontWeight.NORMAL, 15));


        L1.setTextFill(Color.WHITE);
        L2.setTextFill(Color.WHITE);        
        
        
        TextField email = new TextField();
        PasswordField password = new PasswordField();
         
         
        grid.add(L1,0,1);
        grid.add(email,1,1);
        grid.add(L2,0,2);
        grid.add(password,1,2);
        grid.add(error,  2 , 12);

        Button loginbtn = new Button("log in");
        Button exit = new Button("Exit");
        exit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                project(primaryStage);
        
            }
        });
        
        loginbtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {

				DB database = new DB();
				
				Connection con = database.createCon();
			
				try {
					Statement check = con.createStatement();
					
					String emailVal = email.getText();
					String passwordVal = password.getText();
					
					String sql = "select * from staff where email = '" + emailVal + "' and password = '" + passwordVal + "'"; 
					
					ResultSet result = check.executeQuery(sql);
					
					if( result.next() ){
						primaryStage.hide();
						start(primaryStage);
        			}else {
        				
        		        Font font = new Font("Tahoma", 14);
        				error.setFont(font);
        				error.setText("Wrong Data Try Again..............");
        				
        			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			
			
			}
        	
        });
        
        loginbtn.setId("btnLogin");
        exit.setId("btnExit");
        
        HBox hbtn1 = new HBox(70);
         
         
        hbtn1.getChildren().add(loginbtn);
        hbtn1.getChildren().add(exit);
         
        grid.add(hbtn1,1,7);
        
        bp.setTop(hb);
        bp.setCenter(grid); 
        
        Scene scene = new Scene (bp , 800 , 600);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("login.css").toExternalForm());
        primaryStage.setTitle("Log in ;)");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }    
    
    public void contact(Stage primaryStage){
        
        Font Font = new Font("Bahnschrift Condensed", 40);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(5, 5, 5, 5));

        GridPane gridPane1 = new GridPane();
        gridPane1.setAlignment(Pos.TOP_LEFT);
        gridPane1.setHgap(5);
        gridPane1.setVgap(5);
        gridPane1.setPadding(new Insets(25, 5, 5, 5));

        GridPane gridPane2 = new GridPane();
        gridPane2.setAlignment(Pos.TOP_LEFT);
        gridPane2.setHgap(5);
        gridPane2.setVgap(5);
        gridPane2.setPadding(new Insets(240, 5, 5, 5));

        GridPane gridPane3 = new GridPane();
        gridPane3.setAlignment(Pos.TOP_LEFT);
        gridPane3.setHgap(5);
        gridPane3.setVgap(5);
        gridPane3.setPadding(new Insets(320, 5, 5, 5));

        GridPane gridPane4 = new GridPane();
        gridPane4.setAlignment(Pos.TOP_LEFT);
        gridPane4.setHgap(46);
        gridPane4.setVgap(0);
        gridPane4.setPadding(new Insets(350, 5, 5, 5));

        Label l = new Label("Type Of Blood :-");
        l.setFont(Font.font("Forte", FontWeight.BOLD, FontPosture.ITALIC, 30));
        gridPane.add(l, 5, 5);

        RadioButton button1 = new RadioButton("0+");
        gridPane1.add(button1, 15, 10);

        RadioButton button2 = new RadioButton("0-");
        gridPane1.add(button2, 35, 10);

        RadioButton button3 = new RadioButton("B+");
        gridPane1.add(button3, 15, 15);

        RadioButton button4 = new RadioButton("B-");
        gridPane1.add(button4, 35, 15);

        RadioButton button5 = new RadioButton("A+");
        gridPane1.add(button5, 15, 20);

        RadioButton button6 = new RadioButton("A-");
        gridPane1.add(button6, 35, 20);

        RadioButton button7 = new RadioButton("AB+");
        gridPane1.add(button7, 15, 25);

        RadioButton button8 = new RadioButton("AB-");
        gridPane1.add(button8, 35, 25);

        Label l1 = new Label("Quentity ->");
        l1.setFont(Font.font("Forte", FontWeight.BOLD, FontPosture.ITALIC, 30));
        TextField text = new TextField();
        gridPane2.add(l1, 5, 5);
        gridPane2.add(text, 15, 5);

        Label l2 = new Label("Importer ->");
        l2.setFont(Font.font("Forte", FontWeight.BOLD, FontPosture.ITALIC, 30));
        gridPane3.add(l2, 5, 5);

        ComboBox comboBox = new ComboBox();
        gridPane4.add(comboBox, 5, 5);
        comboBox.getItems().addAll("57357", "Adam International Hospital (IVF&ICSI)", "Ain Shams Specialized Hospital", "Ain Shams University hospital (El Demerdash)", "Agooza",
                "Al Salam", "Alexandria Psychiatric centre", "Alzahra Hospital", "As Salam International Hospital of Alameda Health Care", "Amoun Hospital", "Anglo-American",
                "Arab Contractors Medical Center", "Asyout University Hospital", "Badran", "Behman Hospital [1]", "Cairo Institute of Radiology", "Cairo Kidney Center", "Cairo Medical Center",
                "Cleopatra", "Coptic Hospital", "Dar Al Fouad Hospital", "Dar el Hekma \"Nasr city\"", "Dar el Salam General Hospital", "Dar el Oyoun Hospital", "Demerdash",
                "Dar El Teb Diagnostic Center", "Dar El Teb IVF Center", "Dar El Shefa Hospital", "Egyptian Medical Services Co. (EMS) - Cairo ", "Dialysis Center",
                "Egyptian Medical Services Co. (EMS) - Sharm El Sheikh Dialysis Center", "Egyptian Medical Services Co. (EMS) - Hurghada ", "Dialysis Center", "El Borg Hospital",
                "El Fayrouz", "El Ganzouri Specialized Hospital [2]", "El Galaa", "El Gomhoureya", "El Kablat Hospital", "El Kateb - Cairo", "El Madina - Cairo", "El Safa",
                "Elixir Gastro-hepatic care center, Mohandsin, Giza (Alameda Medical Care Corporate)", "El Merghany Hospital", "El Mobarra Maadi", "El Monera General Hospital",
                "El Nada Maternity Hospital", "El Nozha International Hospital", "El Shoruk Hospital", "El Tawfiaiia", "Ebtihag Shafik Hospital", "Gohar Hospital & Women's Health Clinic",
                "Garden City", "Hassabo International Hospital", "Hayat Medical Center", "Heliopolis Cardiac Center", "Hussein University Hospital", "Ibn Sina", "International Medical Center",
                "Italian", "Kasralainy Hospital [3]", "Misr El Amal Hospital", "Misr International", "Nasser General", "National Cancer Institute Egypt", "New Kasr El Aini Hospital",
                "New Cairo Hospital", "Nile Badrawi Hospital", "October 6 University (O6U) Hospital", "Red Crescent", "Roxy", "Shaalan Surgi Center", "Theodor Bilharz Research Institute",
                "Sheikh Zayed specialized Hospital", "Heliopolis Neuro-Center", "Zahraa University Hospital", "Zohairy Hospital", "Agial Hospital (Assisted Reproduction, Gynecologic Endoscopy, Obstetrics & Gynecology, NICU)",
                "Alexandria main University hospital (El Meery, koleyet el teb)", "El Shatby Pediatric", "El Shatby Gynaecology and Obstetrics", "El Hadara (Queen Nariman Hospital) for Orthopaedics and Neuropsychiatry",
                "Al Salama Al jadeeda Hospital", "Alex Radiology Center", "Alex Sidney Kiel", "Agial Hospital", "Alexandria Pediatric Center", "Alexandria Medical Center", "Armed Forces",
                "Badrawy Hospital", "Coptic Hospital", "Dermatological", "Dar el Shefa'", "Dar Ismail (Obstetrics)", "Dar ELAraby Maternity Hospital", "Al Helal Al Ahmar Hospital", "El Ahram",
                "El Amin El Kheireya - Alexandria", "El Anba Takla - Alexandria", "El Kabbari", "El Ma'moora Psychiatry Hospital", "El Madina El Tebbeya", "El Maleka Nazly Paediatric Hospital", "El Mowassah",
                "El Seguini (El Sammak Hospital)", "El Sherook", "El Thaghr Specialized", "Fevers (el homeyat)", "Farook Ophthalmology Hospital", "German Hospital", "Gamal Abdel Nasser Hospital",
                "Horus Vision Correction Center", "Mabarret El Asafra", "Maternity - Alexandria", "Miami Private", "Alkawther Hospital ", "The Egyptian Hospital ", "Red Sea Hospital", "Port Ghalib Hospital",
                "Al-Hekma Neurology, Neurosurgery and Advanced Surgeries Hospital", "Mansoura Medical Center", "Mansoura University Hospitals", "Zagazig General Hospital - Elhokamaa", "El Kenayate District Hospital",
                "Zagazig General Hospital - El Ahrar", "El Mabarah-Hospital - Health Insurance", "Organization", "Chest Hospital", "Fever Hospital", "Ophthalmic Hospital", "El Sharkia Eye Center", "El Delta Abdel Latif Hospital");
        // comboBox.getItems().setFont(Font.font("Forte", FontWeight.BOLD, FontPosture.ITALIC, 30));

        StackPane root = new StackPane();

        Image i = new Image("project/800px_COLOURBOX4168554.jpg");
        ImageView imageView = new ImageView(i);
        imageView.setFitHeight(500);
        imageView.setFitWidth(600);

        GridPane gridPane5 = new GridPane();
        gridPane5.setPadding(new Insets(0, 10, 10, 0));
        gridPane5.setAlignment(Pos.TOP_RIGHT);
        gridPane5.setHgap(10);
        gridPane5.setVgap(10);
        
        GridPane gridFooter = new GridPane();
        gridFooter.setAlignment(Pos.BOTTOM_CENTER);
        gridFooter.setPadding(new Insets(20, 20, 20, 20));
        
        Image logo = new Image("project/BKLogo-V2.1.png");
        ImageView imageView3 = new ImageView(logo);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(150);
        gridPane5.add(imageView3, 0, 0);
        
        Button Back = new Button("<- Back");
        Back.setBackground(new Background(new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        Back.setTextFill(Color.WHITE);
        gridFooter.add(Back , 0 , 0);
        
        Back.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.hide();
                project(primaryStage);
        
            }
        });
        
        root.getChildren().addAll(imageView, gridPane, gridPane1, 
                gridPane2, gridPane3, gridPane4,
                gridPane5 , gridFooter);
        Scene scene = new Scene(root, 1000, 800);
        primaryStage.setTitle("Cotacting");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    
    public void termOdDonation(Stage primaryStage){
        

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
        
}
