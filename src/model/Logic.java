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
	boolean validPay;
	
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
		validPay=false;
		
		login.textFields();
		register.textFields();
		register.hide();
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
			if(validPay) {
			pay.draw();
			}
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
		switch(screen) {
		case 1:
			//De Login a Register
			if((257<app.mouseX&&app.mouseX<327)&&(607<app.mouseY&&app.mouseY<616)) {
				screen=2;
				login.clear();
				login.hide();
				register.show();

			}
			//De Login a Home
			if((63<app.mouseX&&app.mouseX<348)&&(773<app.mouseY&&app.mouseY<833)) {
				screen=3;
				login.clear();
				login.hide();
			}
			break;
		case 2:
			//De Register a Login "Iniciar sesión"
			if((222<app.mouseX&&app.mouseX<300)&&(677<app.mouseY&&app.mouseY<689)) {
				screen=1;
				register.clear();
				register.hide();
				login.show();
			}
			//De Register a Login "Registrarse"
			if((63<app.mouseX&&app.mouseX<348)&&(773<app.mouseY&&app.mouseY<833)) {
				screen=1;
				register.clear();
				register.hide();
				login.show();
			}
			break;
		case 3:
			//De Home a Corral
			if((48<app.mouseX&&app.mouseX<365)&&(207<app.mouseY&&app.mouseY<321)) {
				extra.setExtraScreen(0);
				screen=4;	
			}
			//De Home a Corral Queso
			if((48<app.mouseX&&app.mouseX<365)&&(354<app.mouseY&&app.mouseY<467)) {
				extra.setExtraScreen(1);
				screen=4;	
			}
			//De Home a Corral Tocineta
			if((48<app.mouseX&&app.mouseX<365)&&(500<app.mouseY&&app.mouseY<613)) {
				extra.setExtraScreen(2);
				screen=4;	
			}
			//De Home a Corral Pollo
			if((48<app.mouseX&&app.mouseX<365)&&(646<app.mouseY&&app.mouseY<760)) {
				extra.setExtraScreen(3);
				screen=4;	
			}
			//De Home a History
			if((195<app.mouseX&&app.mouseX<215)&&(830<app.mouseY&&app.mouseY<857)) {
				screen=6;	
			}
			//De Home a Login (Cerrar sesion)
			if((296<app.mouseX&&app.mouseX<320)&&(830<app.mouseY&&app.mouseY<857)) {
				screen=1;
				login.show();
			}
			break;
		case 4:
			//De Extra a Home
			if((37<app.mouseX&&app.mouseX<57)&&(94<app.mouseY&&app.mouseY<106)) {
				screen=3;
			}
			//De Extra a Extra+Pay
			if((63<app.mouseX&&app.mouseX<348)&&(787<app.mouseY&&app.mouseY<845)) {
				validPay=true;
			}
			//De Extra+Pay a Summary
			if((validPay)&&(65<app.mouseX&&app.mouseX<348)&&(736<app.mouseY&&app.mouseY<789)) {
				validPay=false;
				screen=5;
			}
			break;
		case 5:
			//De Summary a Home
			if((63<app.mouseX&&app.mouseX<348)&&(755<app.mouseY&&app.mouseY<814)) {
				screen=3;
			}
			break;
		case 6:
			//De History a Home
			if((92<app.mouseX&&app.mouseX<117)&&(830<app.mouseY&&app.mouseY<857)) {
				screen=3;	
			}
			//De History a Login (Cerrar sesion)
			if((296<app.mouseX&&app.mouseX<320)&&(830<app.mouseY&&app.mouseY<857)) {
				screen=1;
				login.show();
			}
			break;
		}
		
	}
}
