package view;
import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	@Override
	public void settings() {
		size(414,896);
	}
	
Controller controller;
	
	@Override
	public void setup() {
	controller = new Controller(this, null);
	}
	
	@Override
	public void draw() {
	controller.changeScreen();
	}
}