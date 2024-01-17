package object_tables_etc;

public class People {
	private String name;
	private int age;
	private String gender;
	private String profession;

	public People(String name, int age, String gender, String profession) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}

	public People() {
	}

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

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getProfession() {
		return this.profession;
	}
}
