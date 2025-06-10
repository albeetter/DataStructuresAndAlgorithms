package dsaActivity;
import java.util.*;
public class InfixFinal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Infix Notation: ");
		String infix = input.nextLine();
		
		int choice = 0;
		while(choice != 3) {
                System.out.println("\nMENU");
                System.out.println("1. Prefix Notation");
                System.out.println("2. Postfix Notation");
                System.out.println("3. EXIT");
                System.out.print("Enter Choice [1..3]: ");
                choice = input.nextInt();
                
            switch (choice) {
            	case 1: 
                    System.out.println("\nPREFIX NOTATION:");
                    System.out.println(infixToPrefix(infix));
                    break;
            	case 2: 
                    System.out.println("\nPOSTFIX NOTATION:");
                    System.out.println(infixToPostfix(infix));
                    break;
            	case 3:
                    System.out.println("\nJulius Albert Ortiz");
                    break;
            	default:
                    System.out.println("\nInvalid Choice");
                    break;
                }
        }
		
	}
	
	
	public static String infixToPrefix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder prefix = new StringBuilder();

        for(int i=infix.length()-1; i>=0;i--)
		{
			char c = infix.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				prefix.insert(0, c).append(' ');
			}
			else if(c == ')') {
				stack.push(c);

			}
			else if(c == '(') {
				while (!stack.isEmpty() && stack.peek() != ')') {
					prefix.insert(0, stack.pop()).append(' ');
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
					prefix.insert(0, stack.pop()).append(' ');
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			prefix.insert(0, stack.pop()).append(' ');
		}
		return prefix.toString();
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c).append(' ');
            } else if (c == '(') {
                stack.push(c);   
            } else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop()).append(' ');
				}

				stack.pop(); // Discard '('
			} else {
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					postfix.append(stack.pop()).append(' ');
				}
				stack.push(c);
			}
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString();
    }

    static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
            	return 3;
            default:
                return 0; // Lower precedence than operators
        }
    }
    
}
