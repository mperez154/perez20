package perez20;

public class Car {
	String make;
	String model;
	double price;
	
	public Car(String make, String model, double price)
	{
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}
	
	public String carToString(){
		return "Car: " + make + " " + model + ", Price: $" + price;
	}
}