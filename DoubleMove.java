package project;

//In case a player ship runs into an island, it will go over it
public class DoubleMove implements ShipAbility {

	Ship ability;
	
	public DoubleMove(Ship ability) {
		this.ability = ability;
	}
	public void goRight() {
		ability.goRight();
		ability.goRight();
	}

	public void goLeft() {
		ability.goLeft();
		ability.goLeft();
	}

	public void goUp() {
		ability.goUp();
		ability.goUp();
	}

	public void goDown() {
		ability.goDown();
		ability.goDown();
	}
	public int getX() {
		return ability.getX();
	}
	public int getY() {
		return ability.getY();
	}
}
