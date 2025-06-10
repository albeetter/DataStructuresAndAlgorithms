package src.javaActivity;

public class Insertion {
	public static void main(String [] args) {
		int LA[]= {1, 3, 5, 7, 8};
		int item = 10, k = 3, n = 3;
		int i = 0, j = n;
		
		System.out.print("The original array elements are : \n");
		for(i = 0; i<n; i++) {
			System.out.print("LA["+i+"] = " + LA[i] + "\n");
		}
		
		n = n + 1;
		
		while(j >= k) {
			LA[j+1] = LA[j];
			j = j - 1;
		}
		
		LA[k] = item;
		
		System.out.print("The array elements after insertion :\n");
		
		for(i=0; i<n; i++) {
			System.out.print("LA["+i+"]="+ LA[i] +"\n");
		}
		
	}
}
