package model;

public class ProductForSale extends Product implements Saleable{

	private double discount;

	public ProductForSale(String code, String name, int units, double price, ProductType type){

		super(code, name, units, price, type);
	}

	@Override
	public double applyExtraDiscount(double discount){

	}

	@Override
	public double calculateTax(double ){

	}

	@Override
	public double getSalePrice(int price){


	}

	@Override
	public String getInformation(){

	}

	public void setDiscount(double discount){
		this.discount = discount;
	}

	@Override
	public boolean isSafeSale(){

	}
}
