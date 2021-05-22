package model;

import processing.core.PApplet;
import view.LogInScreen;

public class Logic {
	private PApplet app ;
	int screen;
	LogInScreen login;
	public Logic(PApplet app) {
		this.app=app;
		screen = 1;
		login = new LogInScreen(app);
	}
	public void changeScreen() {
		switch(screen) {
		case 1:
			login.draw();
			break;
		}
	}
}
