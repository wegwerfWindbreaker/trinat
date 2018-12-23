package animation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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

	//definition aller variabeln
	final Label explanation = new Label();
	final Label time = new Label();
	final Label label = new Label("Score: ");
	final Label gameover = new Label();
	final Button button = new Button("click me");
	final Button start = new Button("start");
	final Button stop = new Button("Klick here to stop");
	final Stage stage3 = new Stage();
	final Stage stage2 = new Stage();
	public countdown c = new countdown();
	int counter = 1;


	// random Funktion für y Kordinaten
	public double setcordinate() {

		double Ycoordinate = Math.round((int) (Math.random() * 800) + 60);
		return Ycoordinate;
	}


	// random Funktion für Geschwindigkeit
	public int setvelocity() {

		int velocity = (int) (Math.random()*6000 + 2000);

		return velocity;
	}

	// erstellen eines counters und einer Anzeige
	public void counter() {
		counter ++;
	}

	// Funktion beim drucken des button
	public void buttonclick(Button button) {
		button.setOnAction((Event) -> {
			label.setText("Count: "+Integer.toString(counter));
			counter();
			button.setDisable(true);
			button.setVisible(false);	
		});   
	}
	
	// erstellen der gameover Stage
	public void gameover(Stage stage2, Stage stage3){
		if (c.getTimer() == 0) {

			stage3.setTitle("gameover");
			Pane pane = new Pane();
			Scene over = new Scene(pane, 400, 300, Color.WHITE);
			stage3.setScene(over);
			stage3.show();
			pane.getChildren().add(gameover);
			gameover.setText("GAME OVER" + "\n" + "your score is: " + Integer.toString(counter));
			stage2.close();
		}
	}


	// Erstellen der Spiel-Stage
	public void window(Stage stage2) {

		stage2.setTitle("new game");
		Pane pane = new Pane();
		Scene game = new Scene(pane, Color.WHITE);
		stage2.setMaximized(true);
		stage2.setScene(game);
		stage2.show();	

		// Definition der Spiellänge
		c.counter(60);

		// Loop um neue buttons zu erzeugen
		final Timeline timeline = new Timeline(
				new KeyFrame(Duration.ZERO, new EventHandler<ActionEvent>() {
					@Override public void handle(ActionEvent event) {

						Button button = new Button("click me");
						button.relocate(0,setcordinate());
						pane.getChildren().add(button);

						TranslateTransition but = new TranslateTransition(Duration.millis(setvelocity()), button);
						but.setByX(2000f);
						but.play();
						buttonclick(button);
						gameover(stage2, stage3);
					}
				}),  
				new KeyFrame(Duration.millis(3000))
				);
		timeline.setCycleCount(Timeline.INDEFINITE);

		// Action beim drücken des Stop buttons
		stop.setOnAction((event) -> {
			stage2.close();
		});


		timeline.play();


		pane.getChildren().add(label);
		label.relocate(30, 60);


		pane.getChildren().add(stop);
		stop.relocate(30, 30);




		/* implementierung des visuellen Timers (funktioniert leider nicht)
		Thread t = new Thread() {
		@Override
		public void run() {
			if (c.getTimer() != 0) {
				//				time.textProperty().bind(new SimpleIntegerProperty(c.getTimer()).asString());
				time.setText("time left: "+ Integer.toString(c.getTimer()));
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	t.start();
	
	pane.getChildren().add(time);
	time.relocate(200, 30);*/
	}

	// main Stage
	@Override
	public void start(Stage stage) {

		stage.setTitle("Mohrhuhn");
		Pane root = new Pane();
		Scene scene = new Scene(root,400, 400,Color.WHITE);
		stage.setScene(scene);
		stage.show();


		start.relocate(160, 200);
		root.getChildren().add(start);

		explanation.relocate(100, 100);
		explanation.setText("This is a moorhuhn game. \nEach round lasts 60 seconds \n\n           HAVE FUN!");
		root.getChildren().add(explanation);
		// setzt ein neues Fenster beim drücken vom Start button;
		start.setOnAction((event) -> {
			window(stage2);	
			stage.close();
		});


	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
