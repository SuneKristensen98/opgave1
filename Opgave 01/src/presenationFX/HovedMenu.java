package presenationFX;

import data.VenContainer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.Ven;
import logic.VennerOgBekendte;
import logic.VennerOgBekendteFactory;

public class HovedMenu extends Application {
	Label response;
	TextField tf;
	Stage window;
	Scene Hovedmenu, Opret, Opdatere, Slet, Hent, Find;

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		Label label0 = new Label("Hoved Menu");
		Button btnOpret = new Button("Opret Ven");
		btnOpret.setPrefSize(100, 20);
		btnOpret.setOnAction(e -> window.setScene(Opret));
		Button btnOpdatere = new Button("Opdatere Ven");
		btnOpdatere.setPrefSize(100, 20);
		btnOpdatere.setOnAction(e -> window.setScene(Opdatere));
		Button btnSlet = new Button("Slet Ven");
		btnSlet.setPrefSize(100, 20);
		btnSlet.setOnAction(e -> window.setScene(Slet));
		Button btnHent = new Button("Hent Ven");
		btnHent.setPrefSize(100, 20);
		btnHent.setOnAction(e -> window.setScene(Hent));
		Button btnFind = new Button("Find Ven");
		btnFind.setPrefSize(100, 20);
		btnFind.setOnAction(e -> window.setScene(Find));
		VBox layout0 = new VBox(20);
		layout0.setAlignment(Pos.CENTER);
		layout0.getChildren().addAll(label0, btnOpret, btnOpdatere, btnSlet, btnHent, btnFind);
		Hovedmenu = new Scene(layout0, 800, 600);
		window.setScene(Hovedmenu);
		window.show();

		Label labelNavn = new Label("Navn");
		TextField tfNavn = new TextField();
		tfNavn.setMaxWidth(200);
		Label labelAdresse = new Label("Adresse");
		TextField tfAdresse = new TextField();
		tfAdresse.setMaxWidth(200);
		Label labelEmail = new Label("Email");
		TextField tfEmail = new TextField();
		tfEmail.setMaxWidth(200);
		Label labelTelefon = new Label("Telefon");
		TextField tfTelefon = new TextField();
		tfTelefon.setMaxWidth(200);
		Label labelFødselsdag = new Label("Fødselsdag");
		TextField tfFødselsdag = new TextField();
		tfFødselsdag.setMaxWidth(200);
		Label labelPostnr = new Label("Postnummer");
		TextField tfPostnr = new TextField();
		tfPostnr.setMaxWidth(200);
		Label labelOprettet = new Label("");
		Button btnOpret1 = new Button("Opret");
		btnOpret1.setPrefSize(100, 10);
		Button btnBack = new Button("Tilbage");
		btnBack.setPrefSize(100, 10);
		btnBack.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout1 = new VBox(10);
		layout1.setAlignment(Pos.CENTER);
		layout1.getChildren().addAll(labelNavn, tfNavn, labelEmail, tfEmail, labelTelefon, tfTelefon, labelFødselsdag,
				tfFødselsdag, labelAdresse, tfAdresse, labelPostnr, tfPostnr, btnOpret1, labelOprettet, btnBack);
		Opret = new Scene(layout1, 800, 600);

		btnOpret1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				VennerOgBekendte venner = new VennerOgBekendteFactory().makeVennerOgBekendte();
				Ven ven = new Ven(tfNavn.getText(), tfAdresse.getText(), tfEmail.getText(), tfFødselsdag.getText(),
						tfTelefon.getText(), tfPostnr.getText());
				venner.opret(ven);
				labelOprettet.setText("Denne person er oprettet");

			}
		});
		{

		}

		Label label2 = new Label("Opdatere Ven eller bekendt");
		Button btnBack1 = new Button("Tilbage");
		btnBack1.setPrefSize(100, 10);
		btnBack1.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout2 = new VBox(10);
		layout2.setAlignment(Pos.CENTER);
		layout2.getChildren().addAll(label2, btnBack1);
		Opdatere = new Scene(layout2, 800, 600);

		Label label3 = new Label("Slet Ven eller bekendt");
		Button btnBack2 = new Button("Tilbage");
		btnBack2.setPrefSize(100, 10);
		btnBack2.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout3 = new VBox(10);
		layout3.setAlignment(Pos.CENTER);
		layout3.getChildren().addAll(label3, btnBack2);
		Slet = new Scene(layout3, 800, 600);

		Label label4 = new Label("Hent Ven eller bekendt");
		Button btnBack3 = new Button("Tilbage");
		Button btnhent = new Button("Hent");
		Label henttext = new Label("Indtast navn");
		Label hentPerson = new Label("");
		TextField ind = new TextField();
		ind.setMaxWidth(200);
		btnBack3.setPrefSize(170, 10);
		btnBack3.setOnAction(e -> window.setScene(Hovedmenu));
		btnhent.setPrefSize(170, 10);
		VBox layout4 = new VBox(10);
		layout4.setAlignment(Pos.CENTER);
		layout4.getChildren().addAll(label4, henttext, ind, btnhent, hentPerson, btnBack3);
		Hent = new Scene(layout4, 800, 600);

		btnhent.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				VennerOgBekendte venner = new VennerOgBekendteFactory().makeVennerOgBekendte();
				Ven ven = venner.hent(ind.getText());
				if (ven != null) {
					hentPerson.setText(ven.toString());
				} else
					hentPerson.setText("Prøv igen");

			}
		});

		Label label5 = new Label("Find Ven eller bekendt");
		Button btnBack4 = new Button("Tilbage");
		Button btnSøg = new Button("Søg");
		Label findtext = new Label("Indtast email her");
		Label findVen = new Label("");
		TextField søg = new TextField();
		søg.setMaxWidth(200);
		btnBack4.setPrefSize(100, 10);
		btnSøg.setPrefSize(100, 10);
		btnBack4.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout5 = new VBox(10);
		layout5.setAlignment(Pos.CENTER);
		layout5.getChildren().addAll(label5, findtext, søg, btnSøg, findVen, btnBack4);
		Find = new Scene(layout5, 800, 600);
		
		btnSøg.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			VennerOgBekendte venner = new VennerOgBekendteFactory().makeVennerOgBekendte();
				VenContainer ven = venner.find(søg.getText());
				if (ven != null) {
					findVen.setText(ven.toString());
				} else
					findVen.setText("Intet resultat");
				
				
			}
		});

	}
}
