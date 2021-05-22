package model;

import processing.core.PApplet;
import view.AddExtraScreen;
import view.CompletePayScreen;
import view.HomeScreen;
import view.LogInScreen;
import view.OrderHistoryScreen;
import view.OrderSummaryScreen;
import view.RegisterScreen;

public class Logic {
	private PApplet app ;
	int screen;
	LogInScreen login;
	RegisterScreen register;
	HomeScreen home;
	AddExtraScreen extra;
	CompletePayScreen pay;
	OrderSummaryScreen summary;
	OrderHistoryScreen history;
	
	public Logic(PApplet app) {
		this.app=app;
		screen = 1;
		login = new LogInScreen(app);
		register = new RegisterScreen(app);
		home = new HomeScreen(app);
		extra = new AddExtraScreen(app);
		pay = new CompletePayScreen(app);
		summary = new OrderSummaryScreen(app);
		history = new OrderHistoryScreen(app);
	}
	
	public void changeScreen() {
		switch(screen) {
		case 1:
			login.draw();
			break;
		case 2:
			register.draw();
			break;
		case 3:
			home.draw();
			break;
		case 4:
			extra.draw();
			
			//Si le da a realizar pago, llama el método draw de de pay
			pay.draw();
			break;
		case 5:
			summary.draw();
			break;
		case 6:
			history.draw();
			break;

		}
	}
	public void mousePressed() {
		screen++;
	}
}
