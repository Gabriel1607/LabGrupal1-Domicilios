package view;

import processing.core.PApplet;

public class AddExtraScreen extends Screen {
	int extraScreen;
	 public AddExtraScreen(PApplet app) {
	        super(app);
	    }

	@Override
	public void draw() {
		//Cambios de pantallas segun la hamburguesa
		switch(extraScreen) {
		case 0:
			 app.image(ExtrasCorral,0,0);
		break;
		case 1:
			 app.image(ExtrasQueso,0,0);
		break;
		case 2:
			 app.image(ExtrasTocineta,0,0);
		break;
		case 3:
			 app.image(ExtrasPollo,0,0);
		break;
		}
		 
		
	}

	public void setExtraScreen(int extraScreen) {
		this.extraScreen = extraScreen;
	}

}
