package src.javaActivity;

public class Percentages {

	public static void main(String[] args) {
		double num1 = 5.0;
		double num2 = 10.0;
		
		System.out.println("The first number is " + num1);
		System.out.println("The second number is " + num2);
		
		computePercent(num1, num2);
		computePercent(num2, num1);

	}
	
	public static void computePercent(double n1, double n2) {
		System.out.println();
		
		double percentage = (n1/n2) * 100;
		
		System.out.println(n1 + " is " + percentage + " percent of " + n2);
	}

}
