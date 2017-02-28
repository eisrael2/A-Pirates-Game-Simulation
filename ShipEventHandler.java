package project;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

//Enable the ship to move on the grid from keyboard commands
public class ShipEventHandler implements EventHandler<KeyEvent> {
		
	
		public ShipEventHandler(Ship ship, ImageView shipImageView, int scalingFactor) {

		this.ship = ship;
		this.shipImageView = shipImageView;
		this.scalingFactor = scalingFactor;
	}

		Ship ship;
		private ImageView shipImageView;
		private int scalingFactor;
		
		@Override
		public void handle(KeyEvent key) {
			switch(key.getCode()) {
			case RIGHT:
				ship.goRight();
				break;
			case LEFT:
				ship.goLeft();
				break;
			case UP:
				ship.goUp();
				break;
			case DOWN:
				ship.goDown();
				break;
			default:
				break;
			}
			shipImageView.setX(ship.getX()*scalingFactor);
			shipImageView.setY(ship.getY()*scalingFactor);
		}
	}
