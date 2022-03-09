import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class conway extends Application {
	@Override
	final static int cellsDim = 20;
	
	public void start(Stage stage) {
		GridPane gridpane = new GridPane();
		gridpane.setGridLinesVisible(true);
		gridpane.setMinSize(400, 400);
		
		Node cell = new Node();
		
		Scene scene = new Scene(gridpane);
		stage.setTitle("Conway's Game of Life");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
