package garage;

public class Vehicle {
	private String type;
	private String make;
	private String model;
	private String colour;

	public Vehicle() {
		super();
	}

	public Vehicle(String type, String make, String model, String colour) {
		super();
		this.type = type;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void print() {
		System.out.println("Vehicle type: " + this.type);
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Colour: " + this.colour);
	}

}
