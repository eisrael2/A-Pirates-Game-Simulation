package project;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

//Uploads BlackPearl image
public class BlackPearlFactory extends ShipBuilder {
	
	public BlackPearlFactory(Pane root) {
		super(root);
	}
	private static Image shipImage = null;
	@Override
	protected PirateShip BuildShip(UpdateStrategy strategy) {
		if (shipImage == null) {
			shipImage = new Image("FILE:c:\\Users\\eisrael2\\Desktop\\Pictures\\Pirate_Ship1.png", OceanMap.scale, OceanMap.scale, true, true); //Change image
		}
		ImageView shipImageView = new ImageView(shipImage);
		PirateShip BlackPearl = new BlackPearl(strategy); 
		BlackPearl.shipImageView = shipImageView;
		return BlackPearl;
	}
}