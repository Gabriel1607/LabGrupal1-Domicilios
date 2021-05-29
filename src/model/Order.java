package model;

import java.util.Date;

public class Order {
	private String dishName;
	private Date orderDate;
	private double dishPrice;
	
	private Extra[] extraList;
	
	private double totalPrice;
	
	public Order(String dishName, Date orderDate, double dishPrice) {
		this.dishName = dishName;
		this.orderDate = orderDate;
		this.dishPrice = dishPrice;
		
		extraList = new Extra[1];
	}

	public String getDishName() {
		return dishName;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public double getDishPrice() {
		return dishPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void addExtra1 (String en, double ep) {
		extraList[0] = new Extra(en, ep);
	}
	
	public void addExtra2 (String en, double ep) {
		extraList[1] = new Extra(en, ep);
	}
	
	public void calculateTotal() {
		totalPrice = extraList[0].getExtraPrice() + extraList[1].getExtraPrice() + dishPrice;
	}
}
