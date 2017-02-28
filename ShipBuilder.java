package project;

import javafx.scene.layout.Pane;

//Create a ship on the grid
public abstract class ShipBuilder {
	Pane root;
	final int scale = 50;
	public ShipBuilder(Pane root) {
		this.root = root;
	}
	protected abstract PirateShip BuildShip(UpdateStrategy strategy);
	
	public PirateShip buildShip(float x, float y, UpdateStrategy strategy) {
		PirateShip piratesships;
		piratesships = BuildShip(strategy);
		piratesships.setX((int) x);
		piratesships.setY((int) y);
		root.getChildren().add(piratesships.shipImageView);
		
		return piratesships;
	}
}
