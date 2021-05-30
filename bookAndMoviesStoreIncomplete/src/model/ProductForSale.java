package model;

public class ProductForSale extends Product implements Saleable{

	private double discount;

	public ProductForSale(String code, String name, int units, double price, ProductType type){

		super(code, name, units, price, type);
		
	}

	@Override
	public double applyExtraDiscount(double subtotal, double percenteageDiscount){

		double out = subtotal * percenteageDiscount;

		return out;


	}



	@Override
	public double calculateTax(double totalPrice, double percentage){

		double out = totalPrice * percentage;

		out = out + totalPrice;

		return out;
	}

	@Override
	public double getSalePrice(int units, double discount){

		double price = getPrice();

		double out = units * price - discount;

		return out;


	}

	@Override
	public String getInformation(){

		String out = "product: "+getName()+" code: "+getCode();

		return out;

	}

	public void setDiscount(double discount){
		this.discount = discount;
	}

	@Override
	public boolean isSafeSale(int units){

		boolean out;

		if(units>0){
			out = true;
		}
		else{
			out = false;
		}

		return out;

	}
}
