package project;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

//Uploads FlyingDutchman image
public class FlyingDutchmanFactory extends ShipBuilder {
	
	public FlyingDutchmanFactory(Pane root) {
		super(root);
	}
	private static Image shipImage = null;
	@Override
	protected PirateShip BuildShip(UpdateStrategy strategy) {
		if (shipImage == null) {
			shipImage = new Image("FILE:c:\\Users\\eisrael2\\Desktop\\Pictures\\Pirate_Ship.png", OceanMap.scale, OceanMap.scale, true, true);
		}
		ImageView shipImageView = new ImageView(shipImage);
		PirateShip flyingDutchman = new FlyingDutchman(strategy); 
		flyingDutchman.shipImageView = shipImageView;
		return flyingDutchman;
	}

}
