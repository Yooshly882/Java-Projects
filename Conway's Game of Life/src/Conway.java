import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

public class Conway extends Application {
	final int CELLDIM = 20;
	@Override
	public void start(Stage stage) {
		GridPane gridpane = new GridPane();
		Node cell = new Rectangle();
		
		for (int i = 0; i < CELLDIM; i++) {
			for (int j = 0; j < CELLDIM; j++) {
				gridpane.add(cell, i, j);
			}
		}
		
		Scene scene = new Scene(gridpane);
		stage.setTitle("Conway's Game of Life");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
