package project;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

//Uploads Jaws image
public class JawsFactory extends ShipBuilder {
	
	public JawsFactory(Pane root) {
		super(root);
	}
	private static Image shipImage = null;
	@Override
	protected Jaws BuildShip(UpdateStrategy strategy) {
		if (shipImage == null) {
			shipImage = new Image("FILE:c:\\Users\\eisrael2\\Desktop\\Pictures\\Jaws.jpg", OceanMap.scale, OceanMap.scale, true, true); //Change image
		}
		ImageView JawsImageView = new ImageView(shipImage);
		Jaws jaws = new Jaws(strategy); 
		jaws.shipImageView = JawsImageView;
		return jaws;
	}
}