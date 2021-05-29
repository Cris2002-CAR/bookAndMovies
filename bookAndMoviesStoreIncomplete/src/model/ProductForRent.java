package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements  Rentable{

	private LocalDate devolutionDate;

	private State state;

	public ProductForRent(String code, String name, double price, ProductType type){

		super(code, name, price, type);

	}

	@Overrides
	public String rentProduct(int code){


	}

	@Override
	public double getRentPrice(int code){


	}

	@Override
	public String getInformation(){


	}

	@Override
	public boolean isSafeRent(){

	}
}