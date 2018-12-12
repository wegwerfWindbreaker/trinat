
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		 primaryStage.setTitle ("Lueg emol Michi du Opfer");
		 Pane root = new Pane();
		 Scene scene = new Scene(root, 800, 600, Color.WHITE);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	
		 Button button = new Button("yallah");
		 button.relocate(50, 60);
		 button.setTextFill(Color.AQUA);
		 root.getChildren().add(button);
		 
		 TranslateTransition but = new TranslateTransition(Duration.millis(2000), button);
		 but.setByX(400f);
		 but.setByY(200f);
		 but.setCycleCount(5);
		 but.setAutoReverse(true);
		 
		 but.play();
		 
		 Rectangle rect = new Rectangle (100, 40, 100, 100);
		 rect.setArcHeight(50);
		 rect.setArcWidth(50);
		 rect.setFill(Color.VIOLET);
		 rect.relocate(100, 100);
		 root.getChildren().add(rect);
		 
		 TranslateTransition tt = new TranslateTransition(Duration.millis(2000), rect);
		 tt.setByX(200f);
		 tt.setCycleCount(4);
		 tt.setAutoReverse(true);
		 
		 tt.play();
		 
	}
}
