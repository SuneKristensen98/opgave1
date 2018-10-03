package presenationFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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

		Label label1 = new Label("Opret Ven");
		Button btnBack = new Button("Gå tilbage til hovedmenuen");
		btnBack.setPrefSize(170, 10);
		btnBack.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout1 = new VBox(20);
		layout1.setAlignment(Pos.CENTER);
		layout1.getChildren().addAll(label1, btnBack);
		Opret = new Scene(layout1, 800, 600);

		Label label2 = new Label("Opdatere Ven eller bekendt");
		Button btnBack1 = new Button("Gå tilbage til hovedmenuen");
		btnBack1.setPrefSize(170, 10);
		btnBack1.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout2 = new VBox(20);
		layout2.setAlignment(Pos.CENTER);
		layout2.getChildren().addAll(label2, btnBack1);
		Opdatere = new Scene(layout2, 800, 600);

		Label label3 = new Label("Slet Ven eller bekendt");
		Button btnBack2 = new Button("Gå tilbage til hovedmenuen");
		btnBack2.setPrefSize(170, 10);
		btnBack2.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout3 = new VBox(20);
		layout3.setAlignment(Pos.CENTER);
		layout3.getChildren().addAll(label3, btnBack2);
		Slet = new Scene(layout3, 800, 600);

		Label label4 = new Label("Hent Ven eller bekendt");
		Button btnBack3 = new Button("Gå tilbage til hovedmenuen");
		btnBack3.setPrefSize(170, 10);
		btnBack3.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout4 = new VBox(20);
		layout4.setAlignment(Pos.CENTER);
		layout4.getChildren().addAll(label4, btnBack3);
		Hent = new Scene(layout4, 800, 600);

		Label label5 = new Label("Find Ven eller bekendt");
		Button btnBack4 = new Button("Gå tilbage til hovedmenuen");
		Label findtext = new Label ("Indtast din email her");
		tf = new TextField();
		btnBack4.setPrefSize(170, 10);
		btnBack4.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout5 = new VBox(20);
		layout5.setAlignment(Pos.CENTER);
		layout5.getChildren().addAll(label5, findtext, btnBack4, tf);
		Find = new Scene(layout5, 800, 600);
		
	
				

	}

}

//package presenationFX;
//
//// Demonstrate JavaFX events and buttons.
//import javafx.application.*;
//import javafx.scene.*;
//import javafx.stage.*;
//import javafx.scene.layout.*;
//import javafx.scene.control.*;
//import javafx.event.*;
//import javafx.geometry.*;
//
//public class HovedMenu extends Application {
//
//	Label response;
//
//	public static void main(String[] args) {
//		// Start the JavaFX application by calling launch().
//		launch(args);
//	}
//
//	// Override the start() method.
//	public void start(Stage myStage) {
//		// Give the stage a title.
//		myStage.setTitle("Use JavaFX Buttons and Events.");
//		// Use a FlowPane for the root node. In this case,
//		// vertical and horizontal gaps of 10.
//		FlowPane rootNode = new FlowPane(800, 10);
//		// Center the controls in the scene.
//		rootNode.setAlignment(Pos.CENTER);
//		// Create a scene.
//		Scene myScene = new Scene(rootNode, 800, 600);
//		// Set the scene on the stage.
//		myStage.setScene(myScene);
//		// Create a label.
//		response = new Label("Push a Button");
//		// Create two push buttons.
//		Button btnVen = new Button("Opret Ven");
//		btnVen.setPrefSize(100, 10);
//		Button btnOpdatere = new Button("Opdatere Ven");
//		btnOpdatere.setPrefSize(100, 10);
//		Button btnSlet = new Button("Slet Ven");
//		btnSlet.setPrefSize(100, 10);
//		Button btnHent = new Button("Hent Ven");
//		btnHent.setPrefSize(100, 10);
//		Button btnFind = new Button("Find Ven");
//		btnFind.setPrefSize(100, 10);
//
//		// Handle the action events for the Down button.
//		btnVen.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent ae) {
//				myStage.setScene(myScene2);
//			}
//		});
//
//		// Add the label and buttons to the scene graph.
//		rootNode.getChildren().addAll(btnVen, btnOpdatere, btnSlet, btnHent, btnFind, response);
//		// Show the stage and its scene.
//		myStage.show();
//	}
//}