package dsaActivity;

public class ArrayQueues {
	public class QueueArray {
		public int[] queue;
		public int front;
		public int rear;
		public int size;
		
		public void QueueArr(int size) {
		this.size = size;
		queue = new int[size];
		front = rear = -1;
		}
		
		public void enqueue(int data) {
		if (rear == size - 1) {
		System.out.println("Queue Overflow");
		} else {
		if (front == -1) {
		front = 0;
		}
		rear++;
		queue[rear] = data;
		System.out.print("Queue: ");
		for (int i = front; i <= rear; i++) {
		System.out.print(queue[i] + " ");
		}
		System.out.println("\nFront: " + front);
		System.out.println("Rear: " + rear);
		}
		}

		public void dequeue() {
		if (front == -1 || front > rear) {
		System.out.println("Queue Underflow");
		} else {
		front++;
		System.out.print("Queue: ");
		for (int i = front; i <= rear; i++) {
		System.out.print(queue[i] + " ");
		}

		System.out.println("\nFront: " + front);
		System.out.println("Rear: " + rear);
		}
		}

		public void display() {
		if (front == -1 || front > rear) {
		System.out.println("Queue is empty");
		} else {
		for (int i = front; i <= rear; i++) {
		System.out.print("Queue: " + queue[i] + " ");
		}
		System.out.println("\nFront: " + front);
		System.out.println("Rear: " + rear);
		}
		}
	}
}
