package presenationFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HovedMenu extends Application {
	Label response;

	Stage window;
	Scene Hovedmenu, Opret, Opdatere, Slet, Hent, Find;

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

Label label1 = new Label("Opret Ven");
Button btnBack = new Button("Gå tilbage til hovedmenuen");
btnBack.setPrefSize(100, 10);
btnBack.setOnAction(e -> window.setScene(Hovedmenu));
VBox layout1 = new VBox(20);
layout1.getChildren().addAll(label1, btnBack);
Opret = new Scene(layout1, 800, 600);
System.out.println("1");
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		// Start the JavaFX application by calling launch().
////		launch(args);
////	}
//
//// Override the start() method.
//	public void start(Stage myStage) {
//// Give the stage a title.
//		myStage.setTitle("Use JavaFX Buttons and Events.");
//// Use a FlowPane for the root node. In this case,
//// vertical and horizontal gaps of 10.
//		FlowPane rootNode = new FlowPane(800, 10);
//// Center the controls in the scene.
//		rootNode.setAlignment(Pos.CENTER);
//// Create a scene.
//		Scene myScene2 = new Scene(rootNode, 800, 600);
////Set the scene on the stage.
//		myStage.setScene(myScene2);
////Create a label.
//		response = new Label("Push a Button");
////Create two push buttons.
//		Button btnVen = new Button("Opret Ven");
//		btnVen.setPrefSize(100, 10);
//		Button btnOpdatere = new Button("Opdatere Ven");
//		btnOpdatere.setPrefSize(100, 10);
//		Button btnSlet = new Button("Slet Ven");
//		btnSlet.setPrefSize(100, 10);
//		Button btnHent = new Button("Hent Ven");
//		btnHent.setPrefSize(100, 10);
//		Button btnFind = new Button("Find Vennnnnnnnn");
//		btnFind.setPrefSize(100, 10);
//
////		//Handle the action events for the Down button.
////		btnVen.setOnAction(new EventHandler<ActionEvent>() {
////			public void handle(ActionEvent ae) {
////				myStage.setScene();
////			}
////		});
//		
//
//}
//	
}
