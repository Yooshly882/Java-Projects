package org.openjfx.DungeonGenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */

public class App extends Application {
	final int TILE_PX = 20;
	final int SCENE_W = 400;
	final int SCENE_H = 400;

    @Override
    public void start(Stage stage) {
    	int columns = SCENE_W / TILE_PX;
    	int rows = SCENE_H / TILE_PX;
    	GridPane gridpane = new GridPane();
    	gridpane.setGridLinesVisible(true);
    	
    	for (int row = 0; row < rows; row++) {
    		for (int column = 0; column < columns; column++) {
    			Rectangle rect = new Rectangle();
    			rect.setHeight(TILE_PX);
    			rect.setWidth(TILE_PX);
    			//rect.setFill(Color.WHITE);
    			gridpane.add(rect, column, row);
    		}
    	}
    	
    	Scene scene = new Scene(new StackPane(gridpane), SCENE_W, SCENE_H);
    	
    	stage.setTitle("Dungeon Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}