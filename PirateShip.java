package project;

import java.util.Observer;

//Moves the Pirates ships on the grid in different directions
public abstract class PirateShip extends Ship implements Observer {
	
	UpdateStrategy strategy;
	
	public PirateShip(UpdateStrategy strategy) {
		this.strategy = strategy;
	}
	public void goLeft() {
		super.goLeft();	
	}
	public void goRight() {
		super.goRight();
	}
	public void goUp() {
		super.goUp();
	}
	public void goDown() {
		super.goDown();
	}
	public void addObserver(Observer ob) {

	}
}