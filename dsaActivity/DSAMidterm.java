package dsaActivity;
import java.util.*;
public class DSAMidterm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("1. Reverse word");
		System.out.println("2. Balancing the Parenthesis");
		System.out.println("3. Exit\n");
		
		System.out.print("Select an option [1...3]: ");
		int option = input.nextInt();
		
		switch(option) {
			case 1:
				System.out.print("Enter a word to reverse: ");
                String word = input.next();
                String reversed = reverseWord(word);
                System.out.println("Reversed word: " + reversed);
                break;
			case 2: 
				System.out.print("Enter a parenthesis expression: ");
				String par = input.next();
				balancingParenthesis(par);
				break;
			case 3:
				System.out.println("Julius Albert D. Ortiz");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}
	
	public static String reverseWord(String word) {
		if (word.isEmpty()) {
            return word;
		}
        else {
            return reverseWord(word.substring(1)) + word.charAt(0);
        }
	}
	
	public static void balancingParenthesis(String par) {
		 int counter = 0;
	        for (int i = 0; i < par.length(); i++) {
	            if (par.charAt(i) == '(') {
	                counter++;
	            } else if (par.charAt(i) == ')') {
	                counter--;
	            }
	        }
	        if (counter > 0 || counter < 0) {
	            System.out.println("Not balanced");
	        } else {
	            System.out.println("Balanced");
	        }
	}
}
