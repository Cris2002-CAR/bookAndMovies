package model;

public interface Saleable{

	public double getSalePrice(int units, double discount);

	public boolean isSafeSale(int units);

	public double applyExtraDiscount(double subtotal,double percenteageDiscount);

	public double calculateTax(double totalPrice, double percentage);
}