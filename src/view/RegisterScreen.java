package view;

import controlP5.ControlP5;
import processing.core.PApplet;

public class RegisterScreen extends Screen {
	ControlP5 cp5;
	 public RegisterScreen(PApplet app) {
	        super(app);
	        cp5= new ControlP5 (app);
	    }

	@Override
	public void draw() {
		  app.image(Register,0,0);
		
	}
	
	public void textFields() {
		 cp5.addTextfield("nombre")
		 .setPosition(64, 383)
		 .setSize(285,61)
		 .setFont(app.createFont("nunito",20))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));
		 
		 cp5.addTextfield("correo")
		 .setPosition(64, 487)
		 .setSize(285,61)
		 .setFont(app.createFont("nunito",20))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));
		 
		 cp5.addTextfield("contraseña")
		 .setPosition(64, 589)
		 .setSize(285,61)
		 .setFont(app.createFont("nunito",20))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));

	}
	
	public void hide() {
		cp5.get("nombre").hide();
		cp5.get("correo").hide();
		cp5.get("contraseña").hide();
	}

}
