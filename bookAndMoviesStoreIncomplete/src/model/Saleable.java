package model;

public interface Saleable{

	public double getSalePrice(int);

	public boolean isSafeRent();

	public double applyExtraDiscount(double discount);

	public double calculateTax();
}