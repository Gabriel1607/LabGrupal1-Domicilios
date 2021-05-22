package view;

import processing.core.PApplet;

public class OrderSummaryScreen extends Screen {
	 
	public OrderSummaryScreen(PApplet app) {
	        super(app);
	    }

	@Override
	public void draw() {
		  app.image(Details,0,0);
		
	}

}
