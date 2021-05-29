package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String dishName;
	private Date orderDate;
	
	private ArrayList<Extra> extras;
	
	private double totalPrice;
	
	public Order(String dishName, Date orderDate) {
		this.dishName = dishName;
		this.orderDate = orderDate;
		
		extras = new ArrayList<Extra>();
	}

	public String getDishName() {
		return dishName;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}

	public ArrayList<Extra> getExtras() {
		return extras;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void addExtra(String en, double ep) {
		extras.add(new Extra(en, ep));
	}
	
	public void calculateTotal() {
		
	}
}
