package src.javaActivity;
import java.util.*;
public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pos=1;
		int nums[]=new int[10];
		for(int i=0; i<nums.length; i++) {
			System.out.print("Enter Integer " + pos + ": ");
			nums[i]=input.nextInt();
			pos++;
		}
		System.out.println("\nOriginal Array is: "+Arrays.toString(nums));
		Arrays.sort(nums);
		int seq=nums.length;
		System.out.print("Sorted Array : [");
		for(int i=nums.length-1; i>=0; i--) {
			System.out.print(nums[i]);
			if(i>0) {
				System.out.print(", ");
			}
			else {
				System.out.print("");
			}
		}
		System.out.print("]");
	}

}
