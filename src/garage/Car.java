package garage;

public class Car extends Vehicle {

	private int doors;

	public Car(String type, String make, String model, String colour, int doors) {
		super(type, make, model, colour);
		this.doors = doors;
	}

	public Car() {
		super();
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
