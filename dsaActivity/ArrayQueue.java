package dsaActivity;

import java.util.Scanner;

public class ArrayQueue {
    static int[] queue;
    static int front, rear, size;

    public void arrayImp(int op) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Queue: ");
        size = input.nextInt();
        queue = new int[size];
        front = -1;
        rear = -1;

        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter Choice [1..4]: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    enqueue(input);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    displayQueue();
                    break;
                case 4:
                    System.out.println("\nJulius Albert D. Ortiz");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    private static void enqueue(Scanner scanner) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (front == -1) {
            front = 0;
        }
        queue[++rear] = num;

        displayQueue(); // Display queue after enqueue
    }

    private static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Dequeue: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        displayQueue(); // Display queue after dequeue
    }

    private static void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        System.out.println("Front: " + queue[front]); // Displaying first number in the queue as front index
        System.out.println("Rear: " + queue[rear]);
    }
}
