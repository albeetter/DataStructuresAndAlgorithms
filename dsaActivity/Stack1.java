package dsaActivity;
import java.util.*;
import java.io.*;

public class Stack1 {
	static Scanner input = new Scanner(System.in);
	static Stack stack1 = new Stack();
	static int elements;
	static int option;
	static int pos = 1;
	
	public static void main(String[] args) {
		System.out.print("Enter size of elements: ");
		elements = input.nextInt();
		System.out.println();
		System.out.println("MENU");
		System.out.println("1 - Push Operation");
		System.out.println("2 - Pop Operation");
		System.out.println("3 - Top Operation");
		System.out.println("4 - Size");
		System.out.println("5 - Stack is Empty");
		System.out.println("6 - Display Stack");
		System.out.println("7 - Exit");
		Choice();
	}
	
	public static void Choice() {
		System.out.print("\nEnter Choice [1...7]: ");
		int option = input.nextInt();
		Options(option);

	}
	
	public static void Options(int op) {
		switch(op) {
		case 1:
			for(int i=0; i<elements; i++) {
				System.out.print("Enter Integer " + pos + " : ");
				int num = input.nextInt();
				stack1.push(num);
				pos++;
			}
			System.out.println("\nStack: " + stack1);
			System.out.println("Stack Overflow");
			Choice();
			break;
			
		case 2:
			if(stack1.isEmpty()) {
				System.out.println("Stack is empty");
			}
			else {
				System.out.println("Stack: " + stack1);
				System.out.println("Popped element: " + stack1.pop());
				System.out.println("Stack after pop operation: " + stack1);
			}
			Choice();
			break;
			
		case 3:
			System.out.println("The top value of the stack is: " + stack1.peek());
			Choice();
			break;
			
		case 4:
			System.out.println("The size of the stack is: " + stack1.size());
			Choice();
			break;
			
		case 5:
			if(stack1.isEmpty()) {
				System.out.println("TRUE");
			}
			else {
				System.out.println("FALSE");
			}
			Choice();
			break;
			
		case 6:
			System.out.println("The content of the stack is: " + stack1);
			Choice();
			break;
			
		default:
			System.out.println("Julius Albert D. Ortiz");
			break;
		}
	}
}
