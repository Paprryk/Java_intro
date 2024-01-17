package garage;

public class Bike extends Vehicle {

	private String bike_type;

	public Bike(String type, String make, String model, String colour, String bike_type) {
		super(type, make, model, colour);
		this.bike_type = bike_type;
	}

	public Bike() {
		super();
	}

	public String getBike_type() {
		return bike_type;
	}

	public void setBike_type(String bike_type) {
		this.bike_type = bike_type;
	}

	public void printBike_type() {
		System.out.println("Bike type: " + this.bike_type);
	}
}
