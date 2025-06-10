package dsaActivity;
import java.util.*;
public class Infix {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Programmer's Name: Your Name");
	        System.out.println("Source Code: Your Source Code");
	        System.out.println();

	        while (true) {
	            System.out.print("Enter the infix notation: ");
	            String infix = scanner.nextLine();

	            if (validateInput(infix)) {
	                System.out.println("MENU");
	                System.out.println("1. Prefix Notation");
	                System.out.println("2. Postfix Notation");
	                System.out.println("3. EXIT");
	                System.out.print("Enter Choice [1..3]: ");
	                int choice = scanner.nextInt();
	                
	                if (choice == 1) {
	                    System.out.println("\nPREFIX NOTATION:");
	                    System.out.println(infixToPrefix(infix));
	                } else if (choice == 2) {
	                    System.out.println("\nPOSTFIX NOTATION:");
	                    System.out.println(infixToPostfix(infix));
	                } else if (choice == 3) {
	                    System.out.println("\nEXIT");
	                    break;
	                } else {
	                    System.out.println("\nInvalid Choice");
	                }
	            } else {
	                System.out.println("\nInvalid Infix Notation");
	            }
	        }

	        scanner.close();
	    }

	    public static boolean validateInput(String infix) {
	        Stack<Character> stack = new Stack<>();
	        for (char c : infix.toCharArray()) {
	            if (Character.isAlphabetic(c)) {
	                continue;
	            } else if ("+ - * /".indexOf(c) != -1) {
	                if (stack.size() < 2) {
	                    return false;
	                }
	                stack.pop();
	                stack.pop();
	                stack.push(c);
	            } else if (c == '(') {
	                stack.push(c);
	            } else if (c == ')') {
	                if (stack.isEmpty() || stack.peek() != '(') {
	                    return false;
	                }
	                stack.pop();
	            } else {
	                return false;
	            }
	        }

	        return stack.size() == 1;
	    }

	    public static String infixToPrefix(String infix) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder prefix = new StringBuilder();

	        for (char c : infix.toCharArray()) {
	            if (Character.isAlphabetic(c)) {
	                prefix.append(c).append(' ');
	            } else if ("+ - * /".indexOf(c) != -1) {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    prefix.append(stack.pop()).append(' ');
	                }
	                stack.push(c);
	            } else if (c == '(') {
	                stack.push(c);
	            } else if (c == ')') {
	                stack.pop();
	            }
	        }

	        while (!stack.isEmpty()) {
	            prefix.append(stack.pop()).append(' ');
	        }

	        return prefix.reverse().toString();
	    }

	    public static String infixToPostfix(String infix) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder postfix = new StringBuilder();

	        for (char c : infix.toCharArray()) {
	            if (Character.isAlphabetic(c)) {
	                postfix.append(c).append(' ');
	            } else if ("+ - * /".indexOf(c) != -1) {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    postfix.append(stack.pop()).append(' ');
	                }
	                stack.push(c);
	            } else if (c == '(') {
	                stack.push(c);
	            } else if (c == ')') {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    postfix.append(stack.pop()).append(' ');
	                }
	                stack.pop();
	            }
	        }

	        while (!stack.isEmpty()) {
	            postfix.append(stack.pop()).append(' ');
	        }

	        return postfix.toString();
	    }

}
