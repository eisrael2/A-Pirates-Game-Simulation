package project;

import java.util.Observable;
import java.util.Random;

//Set RandomChaseShip Strategy to Jaws and notifies it each time the player ship moves 
public class Jaws extends PirateShip {
	
	Random rand = new Random();
	
	public Jaws(UpdateStrategy strategy) {
		super(strategy);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		PlayerShip jews = (PlayerShip)arg;
		strategy.update(this, jews, null);
		moverandomly();
	}
	//Generates a number between 0-3, moves randomly on the grid
	public void moverandomly() {
		
		int number = rand.nextInt(4);
		if (number == 0) {
			super.goUp();
		}
		if (number == 1) {
			super.goDown();
		}
		if (number == 2) {
			super.goLeft();
		}
		if (number == 3) {
			super.goRight();
		}	
	}
}
