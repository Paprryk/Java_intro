package garage;

public class ListGarage {
	public static void main(String[] args) {
		BigGarage myBigGarage = new BigGarage("Richmans Garage");
		myBigGarage.addVehicle(new Car("Car", "BMW", "e45", "Silver", 5));
		myBigGarage.addVehicle(new Bike("Bike", "Carrera", "ZX2", "White & Yellow", "Dirt"));
		myBigGarage.addVehicle(new Plane("Plane", "Boeing", "737", "Blue & Yellow", 200));

		myBigGarage.print();
	}
}
