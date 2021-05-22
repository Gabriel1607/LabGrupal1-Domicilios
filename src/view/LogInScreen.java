package view;

import processing.core.PApplet;

public class LogInScreen extends Screen {
	 public LogInScreen(PApplet app) {
	        super(app);
	    }

	@Override
	public void draw() {
		  app.image(Login,0,0);
		
	}

}
