package week1.assignments;

public class Calculator {
	public int add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		System.out.println("Addition");
		return sum;
		

	}
	public int sub(int num1, int num2) {
		int subtract= num1-num2;	
		System.out.println("Subtract");
		return subtract;
		

	}
	public double mul(double num1, double num2) {
		double multiply = num1 * num2;
		System.out.println("Multiplication");
		return multiply;
		

	}
	public float div(float num1, float num2) {
		float divide=num1 /num2;
		System.out.println("Division");
		return divide;
		
		
		
	}
}
