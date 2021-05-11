package model;

public class Extra {
	private String extraName;
	private double extraPrice;
	private int extraCuantity;
	
	public Extra(String extraName, double extraPrice, int extraCuantity) {
		this.extraName = extraName;
		this.extraPrice = extraPrice;
		this.extraCuantity = extraCuantity;
	}

	public String getExtraName() {
		return extraName;
	}

	public void setExtraName(String extraName) {
		this.extraName = extraName;
	}

	public double getExtraPrice() {
		return extraPrice;
	}

	public void setExtraPrice(double extraPrice) {
		this.extraPrice = extraPrice;
	}

	public int getExtraCuantity() {
		return extraCuantity;
	}

	public void setExtraCuantity(int extraCuantity) {
		this.extraCuantity = extraCuantity;
	}
}
