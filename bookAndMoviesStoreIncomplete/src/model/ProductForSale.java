package model;

public class ProductForSale extends Product implements Saleable{

	private double discount;

	public ProductForSale(String code, String name, int units, double price, ProductType type){

		super(code, name, units, price, type);
	}

	@Override
	public double applyExtraDiscount(double percenteageDiscount){

	}

	@Override
	public double calculateTax(double totalPrice, double percentage){

	}

	@Override
	public double getSalePrice(int units){


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
