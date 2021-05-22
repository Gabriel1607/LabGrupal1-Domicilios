package view;
import controller.ControllerLogIn;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	@Override
	public void settings() {
		size(414,896);
	}
	
ControllerLogIn loginCtrl;
	
	@Override
	public void setup() {
	loginCtrl = new ControllerLogIn(this, null);
	}
	
	@Override
	public void draw() {
	loginCtrl.changeScreen();
	}
}