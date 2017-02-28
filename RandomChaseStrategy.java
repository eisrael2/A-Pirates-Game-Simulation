package project;

import java.util.Random;

//RandomChase Strategy - All ships and sharks are been notified each time the player ship moves
public class RandomChaseStrategy implements UpdateStrategy {
	
	Random rand = new Random();
	
	public void update(PirateShip sfina, PlayerShip ship, Jaws jaws) {
		
		int number = rand.nextInt(4);  //Generate a number between 0-3
		if (number == 0) {
			sfina.goUp();
		}
		if (number == 1) {
			sfina.goDown();
		}
		if (number == 2) {
			sfina.goLeft();
		}
		if (number == 3) {
			sfina.goRight();
		}
	}
}


