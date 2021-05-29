package model;

public interface Rentable{

	public boolean isSafeRent();

	public double getRentPrice(int units);

	public String rentProduct();
}