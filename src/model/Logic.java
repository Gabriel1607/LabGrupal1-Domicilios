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
	OrderSummaryScreen orderSummary;
	OrderHistoryScreen history;
	
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
			orderSummary.draw();
			break;
		case 6:
			history.draw();
			break;

		}
	}
}
