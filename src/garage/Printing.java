package garage;

public class Printing {

	public static void main(String[] args) {
//		Vehicle test = new Vehicle();
//		test.print();
//		test.setType("Vehicle");
//		test.setMake("Test");
//		test.setModel("Z");
//		test.setColour("White");
//		test.print();

//		Car c = new Car("Car", "Ferrari", "x", "Red", 3);
//		c.print();

//		Bike b = new Bike("Bike", "Voodoo", "B55", "Blue & White", "Mountain");
//		b.print();
//		b.printBike_type();

//		Plane p = new Plane("Plane", "Boeing", "737", "Blue & Yellow", 120);
//		p.print();
//		p.printSeats();

		Vehicle v1 = new Car("Car", "Porsche", "911", "Blue", 3);
		Vehicle v2 = new Car("Car", "Toyota", "Yaris", "Silver", 5);
		Vehicle v3 = new Bike("Bike", "Carrera", "v92", "Blue & Gold", "Mountain");
		Vehicle v4 = new Plane("Plane", "Boeing", "736", "White", 150);

		Vehicle[] parking = { v1, v2, v3, v4 };

		for (Vehicle vehicle : parking) {
			vehicle.print();
		}

		Car c = new Car("Car", "Ferrari", "x", "Red", 3);
		Car c2 = new Car("Car", "Ferrari", "x", "Red", 3);
		System.out.println("c == c2: " + (c == c2));
//		Uses equals method
		System.out.println("c.equals(c2): " + c.equals(c2));
		System.out.println(c);

		Plane p = new Plane("Plane", "Boeing", "636", "Black", 200);
		System.out.println(p);

		Bike b = new Bike("Bike", "Voodoo", "Dirt55", "Gold", "OffRoad");
		System.out.println(b);
	}
}
