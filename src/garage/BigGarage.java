package garage;

import java.util.ArrayList;

public class BigGarage {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

//	add vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

//	remove vehicle
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

// remove vehicle by index
	public void removeVehicle(int vehicle) {
		vehicles.remove(vehicle);
	}

	public double fix() {
		double bill = 0;

		for (Vehicle v : this.vehicles) {
			bill += v.calcBill();
		}
		return bill * 2.5;
	}

	public void print() {
		System.out.println("Richmans Garage");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
