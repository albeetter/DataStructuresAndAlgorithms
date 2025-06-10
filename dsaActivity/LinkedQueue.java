package dsaActivity;

public class LinkedQueue{
	public class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public class LinkedListImp {
		Node front, rear;
		public LinkedListImp() {
			front = rear = null;
		}

		public void enqueue(int num) {
			Node newNode = new Node(num);
			if (rear == null) {
				front = rear = newNode;
			} 
			else {
				rear.next = newNode;
				rear = newNode;
			}
			System.out.println("\nQueue: " + num);
			System.out.println("Front: " + (front != null ? front.data : ""));
			System.out.println("Rear: " + (rear != null ? rear.data : ""));
		}
		public void dequeue() {
			if (front == null) {
				System.out.println("Queue Underflow");
				return;
			}
			int data = front.data;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			System.out.println("Front: " + (front != null ? front.data : ""));
			System.out.println("Rear: " + (rear != null ? rear.data : ""));
		}
		
		public void display() {
			if (front == null) {
				System.out.println("Nothing to display");
				return;
			}
			System.out.println("\nQueue: ");
			Node temp = front;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
			System.out.println("Front: " + front.data);
			System.out.println("Rear: " + rear.data);
		}
	}
}
