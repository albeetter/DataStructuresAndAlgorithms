package src.javaActivity;
import java.util.Arrays;
public class ArrayTest1 {

	public static void main(String[] args) {
		int num1[]= {3,5,6,9,8,7};
		int num2[]= {5,0,1,2,3,4,-2};
		
		System.out.println("Input:");
		System.out.println("num1[]= {3,5,6,9,8,7}\n"
				+ "num2[]= {5,0,1,2,3,4,-2}\n");
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		System.out.println("Output:");
		System.out.println("After sorting new array becomes: "+ Arrays.toString(num1));
		System.out.println("After sorting new array becomes: "+ Arrays.toString(num2));
		

	}

}
