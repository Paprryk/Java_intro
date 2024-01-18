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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (this.getDoors() != other.getDoors()) {
			return false;
		}

		return true;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Doors: " + this.doors);
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", Type=" + getType() + ", Make=" + getMake() + ", Model=" + getModel()
				+ ", Colour=" + getColour() + "]";
	}

}
