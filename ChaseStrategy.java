package project;

//Chase Strategy - All ships and sharks are been notified each time the player ship moves
public class ChaseStrategy implements UpdateStrategy {
	
	public void update(PirateShip sfina, PlayerShip ship, Jaws jaws) {
		if(sfina.getX() > ship.getX()) {
			sfina.goLeft();
		}
		else if (sfina.getX() < ship.getX()) {
			sfina.goRight();
		}
		else if (sfina.getY() > ship.getY()) {
			sfina.goUp();
		}
		else if (sfina.getY() < ship.getY()) {
			sfina.goDown();
		}
	}
}
