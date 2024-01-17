package garage;

public class Printing {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();

		v.setType("Vehicle");
		v.setMake("Test");
		v.setModel("Z");
		v.setColour("White");
		v.print();

		Car c = new Car();
		c.print();

		c.setType("Car");
		c.setMake("Ferrari");
		c.setModel("x");
		c.setColour("Red");
		c.setDoors(3);
		c.print();

		Bike b = new Bike();
		b.print();

		b.setType("Bike");
		b.setMake("Voodoo");
		b.setModel("B55");
		b.setColour("Blue & White");
		b.setBike_type("Mountain");
		b.print();

		Plane p = new Plane();
		p.print();

		p.setType("Plane");
		p.setMake("Boeing");
		p.setModel("737");
		p.setColour("Blue & Yellow");
		p.setSeats(120);
		p.print();
	}
}
