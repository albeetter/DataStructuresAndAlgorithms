package dsaActivity;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {
    private static Node front, rear;
    private static int size, maxSize;

    public void linkedListImp(int op) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Queue: ");
        maxSize = input.nextInt();

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
        if (size == maxSize) {
            System.out.println("Queue Overflow");
            return;
        }

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Node newNode = new Node(num);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\nFront: " + front.data);
        System.out.println("Rear: " + rear.data);
    }

    private static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Dequeue: " + front.data);
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        if (front != null) {
            System.out.print("Queue: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("\nFront: " + front.data);
            System.out.println("Rear: " + rear.data);
        } else {
            System.out.println("Queue is empty");
        }
    }

    private static void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\nFront: " + front.data);
        System.out.println("Rear: " + rear.data);
    }
}
