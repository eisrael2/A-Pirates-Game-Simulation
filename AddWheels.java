package project;

import java.util.Observer;

//Adding wheels to the player ship as an ability to get away from others
public class AddWheels implements ShipAbility  {
	
	Ship ship;
	
	public AddWheels(Ship ship) {
		this.ship = ship;
	}
	//Checks if there is an island and go right
	public void goRight() {
		if (ship.getX()+1 >= ship.oceanMap.getDimensions()) {
			return;
		}
		boolean island = ship.oceanMap.getmap()[ship.getX()+1][ship.getY()];
		if (island == true) {
			ship.setX(ship.getX()+1);
		}
		else {
			ship.goRight();
		}
	}
	//Checks if there is an island and go left
	public void goLeft() {
		if (ship.getX()-1 < 0) {
			return;
		}
		boolean island = ship.oceanMap.getmap()[ship.getX()-1][ship.getY()];
		if (island == true) {
			ship.setX(ship.getX()-1);
		}
		else {
			ship.goLeft();
		}
	}
	//Checks if there is an island and go up
	public void goUp() {
		if (ship.getY()-1 < 0) {
			return;
		}
		boolean island = ship.oceanMap.getmap()[ship.getX()][ship.getY()-1];
		if (island == true) {
			ship.setY(ship.getY()-1);
		}
		else {
			ship.goUp();
		}
	}
	//Checks if there is an island and go down
	public void goDown() {
		if (ship.getY()+1 >= ship.oceanMap.getDimensions()) {
			return;
		}
		boolean island = ship.oceanMap.getmap()[ship.getX()][ship.getY()+1];
		if (island == true) {
			ship.setY(ship.getY()+1);
		}
		else {
			ship.goDown();
		}
	}
	
	public void addObserver(Observer ob) {
		ship.addObserver(ob);
	}
}
