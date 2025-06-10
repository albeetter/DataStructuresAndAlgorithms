package src.javaActivity;
import java.util.Arrays;

public class IntMax {
	public static int diff_between_two_elements(int[]nums) {
		int diff_two_elements = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length-1; i++){
			for(int j=i+1; j<nums.length; j++)
			{
				diff_two_elements = Integer.max(diff_two_elements, nums[j]-nums[i]);
			}
		}
		return diff_two_elements;
	} 
	
	public static void main(String [] args) {
		int []nums = {2, 3, 1, 7, 9, 5, 11, 3, 5};
		System.out.println("\nOriginal array: " + Arrays.toString(nums));
		
		System.out.print("The maximum difference between two elements of the said two array elements\n" + diff_between_two_elements(nums));
	}
}
