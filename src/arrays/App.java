package arrays;

public class App {
	static int Addition (int a, int b) {
		return a+b;
		}
	static String Result () {
		return "The result is:";
		}
	public static void main(String[] args) {
		// An array of 10 ints with a for loop which prints every array value
		int [] shelf = {0, 1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10};
			for (int i = 0; i < shelf.length; i++ ) {
				System.out.println("array: " + shelf[i]);
			}
			
		String [] shelf2 = new String[10];
			for (String i: shelf2) {
				System.out.println(i);
		}
		
		int [] shelf3 = {0, 1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10};
			for (int i: shelf3) {
				System.out.println(i);
		}
			
		System.out.println(Result()+Addition(10,1));
	}
}
