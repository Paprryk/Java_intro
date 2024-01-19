package garage;

public class Plane extends Vehicle {

	private int seats;

	public Plane(String type, String make, String model, String colour, int seats) {
		super(type, make, model, colour);
		this.seats = seats;
	}

	public Plane() {
		super();
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void printSeats() {
		System.out.println("Seats: " + this.seats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (this.getSeats() != other.getSeats()) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "Plane [seats=" + seats + ", Type=" + getType() + ", Make=" + getMake() + ", Model=" + getModel()
				+ ", Colour=" + getColour() + "]";
	}

	@Override
	public double calcBill() {
		return 10 + this.seats * 5;
	}

}
