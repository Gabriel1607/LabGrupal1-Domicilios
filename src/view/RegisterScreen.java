package view;

import javax.swing.JOptionPane;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;

public class RegisterScreen extends Screen {
	ControlP5 cp5;
	
	private String name;
	private String mail;
	private String pass;
	
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
		 .setFont(app.createFont("arial",16))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));
		 
		 cp5.addTextfield("correo")
		 .setPosition(64, 487)
		 .setSize(285,61)
		 .setFont(app.createFont("arial",16))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));
		 
		 cp5.addTextfield("contraseņa")
		 .setPosition(64, 589)
		 .setSize(285,61)
		 .setFont(app.createFont("arial",16))
		 .setAutoClear(false)
		 .setColor(app.color(62,36,32))
		 .setColorBackground(app.color(0,0,0,1))
		 .setColorForeground(app.color(0,0,0,1))
		 .getCaptionLabel().setColor(app.color(255,235,207));

	}
	
	public void hide() {
		cp5.get("nombre").hide();
		cp5.get("correo").hide();
		cp5.get("contraseņa").hide();
	}
	public void show() {
		cp5.get("nombre").show();
		cp5.get("correo").show();
		cp5.get("contraseņa").show();
	}
	public void clear() {
		cp5.get(Textfield.class,"nombre").clear();
		cp5.get(Textfield.class,"correo").clear();
		cp5.get(Textfield.class,"contraseņa").clear();
	}
	
	public void textfieldValues() {
		name = cp5.get(Textfield.class,"nombre").getText();
		mail = cp5.get(Textfield.class,"correo").getText();
		pass = cp5.get(Textfield.class,"contraseņa").getText();
	}
	public boolean isNull() {
		if(cp5.get(Textfield.class,"nombre").getText().trim().isEmpty() ||
		   cp5.get(Textfield.class,"correo").getText().trim().isEmpty() ||
		   cp5.get(Textfield.class,"contraseņa").getText().trim().isEmpty())
	        {
			JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Woops", JOptionPane.ERROR_MESSAGE);
	           return true;
	        }else {
	        	return false;
	        }
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getPass() {
		return pass;
	}
}
