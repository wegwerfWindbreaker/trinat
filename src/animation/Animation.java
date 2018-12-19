package animation;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.*;
import javafx.scene.layout.Pane;

public class Animation extends Application{


	public Label time = new Label();
	public Label label = new Label("Count: ");
	final Button button = new Button("click me");
	final Button start = new Button("start");


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



	public void counter() {
		counter ++;
	}

	//	int timer = 60;
	//
	//	public void countdown() {
	//
	//		Timer mytimer = new Timer();
	//
	//		TimerTask mytask = new TimerTask() {
	//
	//
	//			@Override
	//			public void run() {
	//				if (timer <= 0) {
	//					time.setText("Hallo " +Integer.toString(timer));
	//					timer--;
	//				}
	//				
	//			}
	//		};mytimer.schedule(mytask, 0, 1000);
	//	}
	
	public void window() {
		
		Stage stage2 = new Stage();
		stage2.setTitle("new game");
		Pane pane = new Pane();
		Scene game = new Scene(pane, Color.GREEN);
		stage2.setMaximized(true);
		stage2.setScene(game);
		stage2.show();	
		
		
		label.relocate(30, 30);
		pane.getChildren().add(label);
		
		button.relocate(30,setcordinate());
		pane.getChildren().add(button);
		
		pane.getChildren().add(time);
		time.relocate(200, 30);
		
		countdown c = new countdown();
		c.counter(60);


		Thread t = new Thread() {
			@Override
			public void run() {
				if (c.getTimer() != 0) {
					//				time.textProperty().bind(new SimpleIntegerProperty(c.getTimer()).asString());
					time.setText("what up "+ Integer.toString(c.getTimer()));
				}
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
		//time.textProperty().bind(Bindings.format("%.2i", new SimpleIntegerProperty(timeLeft)));
		//		time.textProperty().bind(new SimpleIntegerProperty(timeFromTimer).asString());
		//		time.textProperty().bind(c.getTimer().SimpleIntegerProperty());

		
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
			counter();
			button.setDisable(true);
			button.setVisible(false);
		});
		
	}

	@Override
	public void start(Stage stage) {

		stage.setTitle("Mohrhuhn");
		Pane root = new Pane();
		Scene scene = new Scene(root,400, 400,Color.WHITE);
		stage.setScene(scene);
		stage.show();



		start.setCenterShape(true);
		root.getChildren().add(start);
		
		// setzt ein neues Fenster beim drücken vom Start button;
		start.setOnAction((event) -> {
			window();	
		});

		

		









	}

}
