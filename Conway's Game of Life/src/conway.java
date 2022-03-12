import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class conway extends Application {
	final int EDGECELLS = 20;

	@Override
	public void start(Stage stage) {
		GridPane gridpane = new GridPane();
		Rectangle cell = new Rectangle();

		for (int i = 0; i < EDGECELLS; i++) {
			for (int j = 0; j < EDGECELLS; j++) {
				gridpane.add(cell, i, j);
			}
		}

		Scene scene = new Scene(gridpane, 400, 400);
		stage.setTitle("Conway's Game of Life");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
