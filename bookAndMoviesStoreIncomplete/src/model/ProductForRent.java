package model;

import java.time.LocalDate;

public class ProductForRent extends Product implements  Rentable{

	private LocalDate devolutionDate;

	private State state;

	public ProductForRent(String code, String name, double price, ProductType type){

		super(code, name, 1, price, type);
		this.state = State.AVAILABLE;
		devolutionDate = LocalDate.of(2021,05,28);

	}

	@Override
	public String rentProduct(int amountDays){

		String out = "";

		State state1 = State.RENTED;

		setState(state1);

		out = "El producto ha sido rentado por "+amountDays+" dias";

		return out;
		

	}

	@Override
	public double getRentPrice(int amountDays){

		double price = getPrice();

		double out = amountDays * price;

		return out;
	}

	@Override
	public String getInformation(){

		String out = "Product: "+getName()+" code: "+getCode();

		return out;

	}

	@Override
	public boolean isSafeRent(){

		boolean out;

		if(getState() == state.AVAILABLE){

			out = true;
		}
		else{

			out = false;
		}

		return out;

	}

	public State getState(){
		return state;
	}

	public void setState(State state){
		this.state = state;
	}
}