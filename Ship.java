package project;

import java.util.Observer;

import javafx.scene.image.ImageView;

//Implements the ship to move on the grid in different directions
public abstract class Ship implements ShipAbility {
	
	
	OceanMap oceanMap;
	public ImageView shipImageView;
	
	public Ship(OceanMap oceanMap, Point pirateShipLocation) {
		this.oceanMap = oceanMap;
	}
	public Ship() {
		this.oceanMap = OceanMap.getInstance();
	}
	public int getX() {
		return (int) shipImageView.getX()/OceanMap.scale;
	}
	public int getY() {
		return (int) shipImageView.getY()/OceanMap.scale;
	}
	public void setX(int x) {
		shipImageView.setX(x*OceanMap.scale);
	}
	public void setY(int y) {
		shipImageView.setY(y*OceanMap.scale);
	}
    public void goRight() {
		if(getX() < oceanMap.getDimensions()-1 && oceanMap.ocean(getX()+1, getY())) {
			setX(getX()+1);
		}
	}
	public void goLeft() {
		if(getX() > 0 && oceanMap.ocean(getX()-1, getY())) {
			setX(getX()-1);
		}
	}
	public void goUp() {
		if(getY() > 0 && oceanMap.ocean(getX(), getY()-1)) {
			setY(getY()-1);
		}
	}
	public void goDown() {
		if(getY() < oceanMap.getDimensions()-1 && oceanMap.ocean(getX(), getY()+1)) {
			setY(getY()+1);
		}
	}
	public abstract void addObserver(Observer ob);
	
}