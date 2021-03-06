package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class User {
	private String name;
	private String email;
	private String password;
	
	private LinkedList<Order> orderList;
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
		
		orderList = new LinkedList<Order>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void newOrder(String dn, Date od, int dp, int ot) {
		orderList.add(new Order(dn, od, dp, ot));
	}

	public LinkedList<Order> getOrderList() {
		return orderList;
	}
	
}
