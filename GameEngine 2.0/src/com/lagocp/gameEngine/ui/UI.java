package com.lagocp.gameEngine.ui;

import com.lagocp.gameEngine.sprite.Sprite;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;

/**
 * This abstract class builds the necessary UI components for a game.
 * 
 * @author Phillip
 *
 */
public abstract class UI extends Pane {
	private Canvas canvas;
	
	public UI(Canvas canvas) {
		this.canvas = canvas;
	}

	/**
	 * Creates the UI for the game.
	 */
	public abstract void create();

	/**
	 * Places the canvas.
	 * The canvas is where the Sprites and such are drawn onto.
	 */
	public abstract void placeCanvas();
	
	/**
	 * Updates the UI depending on the Sprites passed in.
	 */
	public abstract void updateUI(Sprite... sprites);
	
	/**
	 * Initializes the statistics used to debug the game.
	 */
	public abstract void initStats(Sprite... sprites); 
	
	public Canvas getCanvas() {
		return canvas;
	}
}
