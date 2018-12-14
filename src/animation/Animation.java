package animation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
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
		
		int velocity = (int) (Math.random()*6000 + 1000);
		
		return velocity;
	}
	
	// erstellen eines counters und einer anzeige
	int counter = 1;
	public Label label = new Label("Count: ");
	
	public void counter() {
		counter ++;
	}
	// erstellen eines timers
	public Label timer = new Label("Time: ");
	





	@Override
	public void start(Stage stage) {
		stage.setTitle("Mohrhuhn");
		Pane root = new Pane();
		Scene scene = new Scene(root, 1200, 1000, Color.WHITE);
		stage.setScene(scene);
		stage.show();
		
//		Pane pane = new Pane();
//		pane.setPrefSize(300, 300);
		
		
		root.getChildren().add(label);
		label.relocate(30, 30);
		
		
		root.getChildren().add(timer);
		timer.relocate(100, 30);
		
		
		Button button = new Button("click me");
		button.relocate(30,setcordinate());
		root.getChildren().add(button);
		

		// gibt dem button eine bewegung
		TranslateTransition but = new TranslateTransition(Duration.millis(setvelocity()), button);
		but.setByX(1100f);
//		but.setByY(200f);
//		but.setCycleCount(5); ist nicht nötig es gibt nur einen cycle
		but.setAutoReverse(true);
		
	
		but.play();

		// gibt dem button die gewünschten reaktionen beim draufklicken
		button.setOnAction((event) -> {
		       label.setText("Count: "+Integer.toString(counter));
		       counter();;
		 button.setDisable(true);
		 button.setVisible(false);
		});
		
		
		
	}
}
