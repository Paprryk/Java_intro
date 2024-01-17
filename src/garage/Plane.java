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
}
