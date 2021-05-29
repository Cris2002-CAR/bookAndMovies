package model;

public interface Saleable{

	public double getSalePrice(int units);

	public boolean isSafeRent();

	public double applyExtraDiscount(double percenteageDiscount);

	public double calculateTax(double totalPrice, double percentage);
}