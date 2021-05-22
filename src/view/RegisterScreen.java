package view;

import processing.core.PApplet;

public class RegisterScreen extends Screen {
	 public RegisterScreen(PApplet app) {
	        super(app);
	    }

	@Override
	public void draw() {
		  app.image(Register,0,0);
		
	}

}
