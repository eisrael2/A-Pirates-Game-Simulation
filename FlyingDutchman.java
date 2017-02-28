package project;

import java.util.Observable;

//Set RandomChaseShip Strategy to BlackPearl and notifies it each time the player ship moves 
public class FlyingDutchman extends PirateShip {

	public FlyingDutchman(UpdateStrategy strategy) {
		super(strategy);
	}

	@Override
	public void update(Observable o, Object arg) {
		PlayerShip ship = (PlayerShip)arg;
		strategy.update(this, ship, null);
	}
}
