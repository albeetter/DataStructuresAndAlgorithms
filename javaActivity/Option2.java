package src.javaActivity;
import java.util.*;
public class Option2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input array size: ");
		int size= input.nextInt();
		int array[]=new int[size];
		System.out.println("\nOPTIONS");
		System.out.println("1 - Sum of N number in an array");
		System.out.println("2 - Maximum and Minimum number");
		System.out.println("3 - Distinct Number");
		System.out.println("4 - Exit");
		
		System.out.print("\nEnter Option [1-4]: ");
		int op = input.nextInt();
		int pos = 1;
		int sum = 0;
		switch (op) {
		case 1:
			System.out.println("\nInput " + size + " values");
			for(int i=0; i<array.length; i++) {
				System.out.print("Enter Integer " + pos + ": ");
				array[i]=input.nextInt();
				pos++;
				sum += array[i];
			}
			
			System.out.println("\nSum of " + size + " values: " + sum);
			break;
			
		case 2:
			System.out.println("\nInput " + size + " values");
			for(int i=0; i<array.length; i++) {
				System.out.print("Enter Integer " +  pos + ": ");
				array[i]=input.nextInt();
				pos++;
			}
			Arrays.sort(array);
			System.out.println("\nMinimum Value is " + array[0]);
			System.out.println("Maximum Value is " + array[array.length-1]);
			break;
			
		case 3:
			System.out.println("\nInput " + size + " values");
			for (int i=0; i<array.length; i++) {
				System.out.print("Enter Integer " +  pos + ": ");
				array[i]=input.nextInt();
				pos++;
			}
			
			Arrays.sort(array);
			
			int[] result = new int[array.length];
	        int previous = array[0];
	        result[0] = previous;
	        int tracker = 1;
	        
	        for (int i = 1; i < array.length; i++) {
	            int current = array[i];
	            if (current != previous) {
	                result[tracker] = current;
	                previous = current;
	                tracker++;
	            }
	        }
	        
	        result = Arrays.copyOf(result, tracker);
	        
	        System.out.println("\nOriginal Array: " + Arrays.toString(array));
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(result));
			break;
			
		default:
			System.out.println("\nProgram is Terminated");
		}
	}
}

