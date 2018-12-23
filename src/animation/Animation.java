package animation;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
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
	final Button button = new Button("click me");
	final Button start = new Button("start");
	final Button stop = new Button("Klick here to stop");
	int counter = 1;

	// random funktion für y kordinaten
	public double setcordinate() {

		double Ycoordinate = Math.round((int) (Math.random() * 800) + 50);
		return Ycoordinate;
	}

	// random funktion für geschwindigkeit
	public int setvelocity() {

		int velocity = (int) (Math.random()*6000 + 2000);

		return velocity;
	}

	// erstellen eines counters und einer anzeige
	
	
	public void counter() {
		counter ++;
	}
	
	public void buttonclick(Button button) {
	    button.setOnAction((Event) -> {
			label.setText("Count: "+Integer.toString(counter));
			counter();
			button.setDisable(true);
			button.setVisible(false);	
		});   
	}
	
	
	
	public void window() {
		
		Stage stage2 = new Stage();
		stage2.setTitle("new game");
		Pane pane = new Pane();
		Scene game = new Scene(pane, Color.GREEN);
		stage2.setMaximized(true);
		stage2.setScene(game);
		stage2.show();	
		
	    final Timeline timeline = new Timeline(
	    	      new KeyFrame(Duration.ZERO, new EventHandler<ActionEvent>() {
	    	        @Override public void handle(ActionEvent event) {
	    	        	
	    	        	Button button = new Button("click me");
	    	        	button.relocate(0,setcordinate());
	    	        	pane.getChildren().add(button);
	    	        
	    	    		TranslateTransition but = new TranslateTransition(Duration.millis(setvelocity()), button);
	    	    		but.setByX(1800f);
	    	        	but.play();
	    	        	buttonclick(button);
	    	        }
	    	      }),  
	    	      new KeyFrame(Duration.millis(4000))
	    	    );
	    	    timeline.setCycleCount(Timeline.INDEFINITE);
	    
	    stop.setOnAction((event) -> {
	    	stage2.close();
	    });
 	     	    
		timeline.play();
		
		
		pane.getChildren().add(label);
		label.relocate(30, 30);
		
		pane.getChildren().add(time);
		time.relocate(200, 30);
		
		pane.getChildren().add(stop);
		stop.relocate(1500, 30);

		
		/*	
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
	t.start();*/
		
	}

	@Override
	public void start(Stage stage) {

		stage.setTitle("Mohrhuhn");
		Pane root = new Pane();
		Scene scene = new Scene(root,400, 400,Color.WHITE);
		stage.setScene(scene);
		stage.show();



		start.setAlignment(Pos.CENTER);
		root.getChildren().add(start);
		
		// setzt ein neues Fenster beim drücken vom Start button;
		start.setOnAction((event) -> {
			window();	
			stage.close();
		});
		

	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
