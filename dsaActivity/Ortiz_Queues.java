package dsaActivity;
import dsaActivity.ArrayQueue;
import dsaActivity.LinkedListQueue;
import java.util.*;
public class Ortiz_Queues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayQueue array = new ArrayQueue();
		LinkedListQueue linkedList = new LinkedListQueue();
		
		int choice=0;
		while (true) {
		System.out.println("Menu");
		System.out.println("1. Array Implementation");
		System.out.println("2. Linked List Implementation");
		System.out.println("3. Exit");
		
		System.out.print("Enter Choice [1..3]: ");
		choice = input.nextInt();
		
		switch (choice) {
		case 1:
			array.arrayImp(choice);
			break;
			case 2:
			linkedList.linkedListImp(choice);
			break;
			case 3:
			System.out.println("Terminated");
			return;
			default:
			System.out.println("Invalid choice");
		}

	}

}
}
