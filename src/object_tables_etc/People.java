package object_tables_etc;

public class People {
	String name;
	int age;
	String gender;
	String profession;

	String introduction() {
		return "Hi, my name is: ";
	}

	void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(profession);
		System.out.println(introduction() + name);
	}
}
