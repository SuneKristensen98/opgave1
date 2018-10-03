package presenationFX;
import presenationFX.HovedMenu;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindVen extends Application {

	Label response;
	TextField tf;
	Stage window;
	Scene Hovedmenu, Opret, Opdatere, Slet, Hent, Find;

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		Label label5 = new Label("Find Ven eller bekendt");
		Button btnBack4 = new Button("Gå tilbage til hovedmenuen");
		btnBack4.setPrefSize(170, 10);
		btnBack4.setOnAction(e -> window.setScene(Hovedmenu));
		VBox layout5 = new VBox(20);
		layout5.setAlignment(Pos.CENTER);
		layout5.getChildren().addAll(label5, btnBack4);
		Find = new Scene(layout5, 800, 600);
		
		
}
}