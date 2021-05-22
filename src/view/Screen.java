package view;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Screen {
	  protected PApplet app;
	  PImage Login,Register,Home,ExtrasCorral,ExtrasTocineta,ExtrasPollo,ExtrasQueso,Details,Pay,History;
	  public Screen(PApplet app) {
		  this.app = app;
		  Login = app.loadImage ("img/Login.png");
		  Register = app.loadImage ("img/Register.png");
		  Home = app.loadImage ("img/Home.png");
		  ExtrasCorral = app.loadImage ("img/ExtrasCorral.png");
		  ExtrasQueso = app.loadImage ("img/ExtrasQueso.png");
		  ExtrasTocineta = app.loadImage ("img/ExtrasTocineta.png");
		  ExtrasPollo = app.loadImage ("img/ExtrasPollo.png");
		  Details = app.loadImage ("img/Details.png");
		  Pay = app.loadImage ("img/Pay.png");
		  History = app.loadImage ("img/History.png");
	  }
	  public abstract void draw ();
}
