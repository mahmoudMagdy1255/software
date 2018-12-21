/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author smn
 */
public class ContactproJect extends Application {

    @Override
    public void start(Stage primaryStage) {

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

        Image logo = new Image("project/BKLogo-V2.1.png");
        ImageView imageView3 = new ImageView(logo);
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(150);
        gridPane5.add(imageView3, 0, 0);

        root.getChildren().addAll(imageView, gridPane, gridPane1, gridPane2, gridPane3, gridPane4, gridPane5);
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Cotacting");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
