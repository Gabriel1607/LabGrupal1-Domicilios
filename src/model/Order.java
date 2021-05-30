package model;

import java.util.Date;

public class Order {
	private String dishName;
	private Date orderDate;
	private int dishPrice;
	
	private Extra[] extraList;
	
	public Order(String dishName, Date orderDate, int dishPrice) {
		this.dishName = dishName;
		this.orderDate = orderDate;
		this.dishPrice = dishPrice;
		
		extraList = new Extra[2];
	}

	public String getDishName() {
		return dishName;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public int getDishPrice() {
		return dishPrice;
	}
	
	public Extra getExtra(int x) {
		return extraList[x];
	}
	
	public void addExtra1 (String en, int ep) {
		extraList[0] = new Extra(en, ep);
	}
	
	public void addExtra2 (String en, int ep) {
		extraList[1] = new Extra(en, ep);
	}
		
	public int calculateTotal() {
		return extraList[0].getExtraPrice() + extraList[1].getExtraPrice() + dishPrice;
	}
}
