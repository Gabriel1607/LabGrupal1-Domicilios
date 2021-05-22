package view;

import processing.core.PApplet;

public class OrderHistoryScreen extends Screen {
	
	public OrderHistoryScreen (PApplet app) {
	        super(app);
	    }

	@Override
	public void draw() {
		  app.image(History,0,0);
		
	}

}
