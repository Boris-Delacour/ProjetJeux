package ihm;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class MainFrame extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Jeux");
		primaryStage.setWidth(1600);
		primaryStage.setHeight(960);
		
		BorderPane pane = new BorderPane();
		pane.setMinWidth(1600);
		pane.setMinHeight(960);
		
		pane.setBackground(new Background(new BackgroundFill(Color.web("#000000"), CornerRadii.EMPTY, Insets.EMPTY)));
		
		ImageView i = new ImageView(new Image("ressources/Tamriel.png"));
		pane.setCenter(i);
						
		primaryStage.setScene(new Scene(pane));
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}