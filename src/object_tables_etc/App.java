package object_tables_etc;

public class App {
	public static void main(String[] args) {
		People mike = new People();
		mike.name = "Mike";
		mike.age = 30;
		mike.gender = "male";
		mike.profession = "Mortgage Advisor";
		mike.print();

		People patryk = new People();
		patryk.name = "Patryk";
		patryk.age = 23;
		patryk.gender = "male";
		patryk.profession = "customer advisor";
		patryk.print();

		People leo = new People();
		leo.name = "Leo";
		leo.age = 25;
		leo.gender = "Male";
		leo.profession = "IT Support";
		leo.print();

		People[] peopleArray = { mike, patryk, leo };
		for (People people : peopleArray) {
			people.print();
		}
	}

}
