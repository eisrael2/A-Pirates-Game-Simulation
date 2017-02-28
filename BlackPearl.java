package project;

import java.util.Observable;

//Set ChaseShip Strategy to BlackPearl and notifies it each time the player ship moves 
public class BlackPearl extends PirateShip {

	public BlackPearl(UpdateStrategy strategy) {
		super(strategy);
	}
	
	//Updates BlackPearl of the player ship location
	@Override
	public void update(Observable o, Object arg) {
		PlayerShip ship = (PlayerShip)arg;
		strategy.update(this, ship, null);
	}
}