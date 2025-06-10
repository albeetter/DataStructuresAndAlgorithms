package src.javaActivity;

public class UpdateOp {
	public static void main(String []args) {
		int LA[] = {1, 3, 5, 7, 8};
		int k = 3, n = 5, item = 10;
		int i, j;
		
		System.out.print("The original array elements are :\n");
		
		for(i=0; i<n; i++) {
			System.out.print("LA["+i+"] = " + LA[i] + "\n");
		}
		
		LA[k-1] = item;
		
		System.out.print("The array elements after updation :\n");
		
		for(i=0; i<n; i++) {
			System.out.print("LA["+i+"] = " + LA[i] + "\n");
		}
	}
}
