package garage;

import java.util.ArrayList;

public class BigGarage {
	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public BigGarage(String name) {
		super();
		this.name = name;
	}

//	add vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

//	remove vehicle
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}

}
