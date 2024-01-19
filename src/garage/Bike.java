package garage;

public class Bike extends Vehicle {

	private String bike_type;
	private int wheelSize;

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

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public void printBike_type() {
		System.out.println("Bike type: " + this.bike_type);
	}

	public void printWheelSize() {
		System.out.println("Wheel size: " + this.wheelSize);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (this.getBike_type() != other.getBike_type()) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "Bike [Bike Type=" + bike_type + ", Type=" + getType() + ", Make=" + getMake() + ", Model=" + getModel()
				+ ", Colour=" + getColour() + "]";
	}

	@Override
	public double calcBill() {
		return 10 + this.wheelSize * 10;
	}

}
