package animation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.scene.layout.Pane;

public class Animation extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	// random funktion für y kordinaten
	public double setcordinate() {

		double Ycoordinate = Math.round((int) (Math.random() * 800));
		return Ycoordinate;
	}
	
	// random funktion für geschwindigkeit
	public int setvelocity() {
		
		int velocity = (int) (Math.random()*4000 + 1000);
		
		return velocity;
	}
		
	public int setbutton() {
		
		int buttons = (int) (Math.random()*8);
		
		return buttons;
	}
	

	@Override
	public void start(Stage stage) {
		stage.setTitle("Lueg emol Michi du Opfer");
		Pane root = new Pane();
		Scene scene = new Scene(root, 800, 600, Color.WHITE);
		stage.setScene(scene);
		stage.show();
		
		for (int i=0; i<setbutton(); i++) {
		Button button = new Button("click me");
		button.relocate(30,setcordinate());
		root.getChildren().add(button);
		}

////		// gibt dem button eine bewegung
////		TranslateTransition but = new TranslateTransition(Duration.millis(setvelocity()), button);
////		but.setByX(800f);
//////		but.setByY(200f);
////		but.setCycleCount(5);
////		but.setAutoReverse(true);
////
////		but.play();
////
////		// gibt dem button eine reaction
////		button.setOnAction((event) -> {
////			Rectangle ract = new Rectangle(30, 40 ,50 ,60);
////			root.getChildren().add(ract);
//		});
	}

//	Rectangle rect = new Rectangle(100, 40, 100, 100);
//	rect.setArcHeight(50);
//	rect.setArcWidth(50);
//	rect.setFill(Color.VIOLET);
//	root.getChildren().add(rect);
//
//	TranslateTransition tt = new TranslateTransition(Duration.millis(2000), rect);
//	tt.setByX(200f);
//	tt.setCycleCount(4);
//	tt.setAutoReverse(true);
//	tt.play();

}
