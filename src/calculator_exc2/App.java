package calculator_exc2;

public class App {
	static int MethodAdd (int a, int b) {
		return a+b;
		}
	
	static int MethodSubtract (int a,int b) {
		return a-b;
	}
	
	static int MethodMultiply (int a, int b) {
		return a*b;
	}
	
	static double MethodDivide (double a, int b) {
		return a/b;
	}
	static String MethodResult () {
		return "The result is:";
	}

	public static void main(String[] args) {
		System.out.println(MethodResult()+MethodAdd(5,5));
		System.out.println(MethodResult()+MethodSubtract(10,2));
		System.out.println(MethodResult()+MethodMultiply(5,5));
		System.out.println(MethodResult()+MethodDivide(10,4));
	}
}
