package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String dishName;
	private Date orderDate;
	private int orderCuantity;
	
	private ArrayList<Extra> extras;
	
	private double totalPrice;
	
	public Order(String dishName, int orderCuantity, Date orderDate) {
		this.dishName = dishName;
		this.orderCuantity = orderCuantity;
		this.orderDate = orderDate;
		
		totalPrice = 0;
		extras = new ArrayList<Extra>();
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderCuantity() {
		return orderCuantity;
	}

	public void setOrderCuantity(int orderCuantity) {
		this.orderCuantity = orderCuantity;
	}

	public ArrayList<Extra> getExtras() {
		return extras;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void addExtra() {
		
	}
	
	public void calculateTotal() {
		
	}
}
