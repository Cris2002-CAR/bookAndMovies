package model;

public interface Rentable{

	public boolean isSafeRent();

	public double getRentPrice(int amountDays);

	public String rentProduct(int amountDays);
}