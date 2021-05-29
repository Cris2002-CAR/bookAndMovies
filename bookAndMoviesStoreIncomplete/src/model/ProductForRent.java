package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements  Rentable{

	private LocalDate devolutionDate;

	private State state;

	public ProductForRent(String code, String name, double price, ProductType type, State state){

		super(code, name, price, type);
		this.state = state;

	}

	@Overrides
	public String rentProduct(int amountDays){


	}

	@Override
	public double getRentPrice(int amountDays){


	}

	@Override
	public String getInformation(){


	}

	@Override
	public boolean isSafeRent(){

	}
}