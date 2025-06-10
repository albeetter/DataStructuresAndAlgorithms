package dsaActivity;
import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr;
		int size, choice;
		
		System.out.print("Enter the size of an array: ");
		size = input.nextInt();
		arr = new int[size];
		System.out.print("Enter " + size + " values: ");
		for(int x = 0; x < size; x++) {
			arr[x] = input.nextInt();
		}
		
		System.out.println("Menu");
		System.out.println("\n\t1. Bubble\n\t2. Insertion\n\t3. Selection\n\t4. Merge Sort\n\t5. Quick Sort\n\t6. Heap Sort\n\t7. Exit");
		System.out.print("\nEnter Choice[1..7]: ");
		choice = input.nextInt();
		
		switch(choice) {
			case 1:
				bubbleSort(arr);
				break;
			case 2:
				insertionSort(arr);
				break;
			case 3:
				selectionSort(arr);
				break;
			case 4:
				mergeSort(arr);
				break;
			case 5:
				quickSort(arr, 0, arr.length - 1); // Call Quick Sort
                System.out.print("Final Output: ");
                printArray(arr);
				break;
			case 6:
				heapSort(arr);
                System.out.print("Final Output: ");
                printArray(arr);
				break;
			default:
				System.out.println("Program Terminated");
		}
	}
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println("Pass " + (i+1));
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			for(int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
				for(int k = 0; k < arr.length; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			n--;
		}
	}
	static void insertionSort(int[] arr) {
		int temp;
		
		System.out.println(arr[0]);
		for(int i = 1 ; i < arr.length; i++) {
			temp = arr[i];
			int hole = i;
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] > temp) {
					arr[hole] = arr[j];
					hole--;
				}
			}
			arr[hole] = temp;
			for(int k = 0; k <= i; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}
	static void selectionSort(int[] arr) {
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}
	static void mergeSort(int[] arr) {
		int half = arr.length/2;
		int[] left = new int[half];
		int[] right;
		if(arr.length%2 == 0) {
			right = new int[half];
		}
		else {
			right = new int[half+1];
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < half; i++) {
			left[i] = arr[i];
		}
		int x = 0;
		for(int i = half; i < arr.length; i++) {
			right[x] = arr[i];
			x++;
		}
		for(int i = 0; i < left.length-1; i++) {//sort left
			int minIndex = i;
			for(int j = i; j < left.length; j++) {
				if(left[minIndex] > left[j]) {
					minIndex = j;
				}
			}
			int temp = left[i];
			left[i] = left[minIndex];
			left[minIndex] = temp;
		}
		for(int i = 0; i < right.length-1; i++) {//sort right
			int minIndex = i;
			for(int j = i; j < right.length; j++) {
				if(right[minIndex] > right[j]) {
					minIndex = j;
				}
			}
			int temp = right[i];
			right[i] = right[minIndex];
			right[minIndex] = temp;
		}
		System.out.print("Left  ");
		for(int i = 0; i < left.length; i++) {
			System.out.print(left[i] + " ");
		}
		System.out.print("\nRight ");
		for(int i = 0; i < right.length; i++) {
			System.out.print(right[i] + " ");
		}
		System.out.println();
		int nL = 0, nR = 0;
		for(int i = 0; i < arr.length; i++) {
			if(nL >= left.length || left[nL] > right[nR]) {
				arr[i] = right[nR];
				nR++;
			}
			else if(nR >= right.length || left[nL] < right[nR]) {
				arr[i] = left[nL];
				nL++;
			}
		}
		System.out.print("Final Output  ");
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
	
	 static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            System.out.println("Pivot: " + arr[pi]);
	            System.out.print("Array after partition: ");
	            printArray(arr);
	            System.out.println();

	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;

	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }
	    
	    static void heapSort(int[] arr) {
	        int n = arr.length;

	        for (int i = n / 2 - 1; i >= 0; i--)
	            heapify(arr, n, i);

	        for (int i = n - 1; i > 0; i--) {	           
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	          
	            heapify(arr, i, 0);
	            
	            System.out.println("Array after step " + (n - i) + " of heap sort:");
	            printArray(arr);
	        }
	    }

	    static void heapify(int[] arr, int n, int i) {
	        int largest = i; // Initialize largest as root
	        int left = 2 * i + 1; // left = 2*i + 1
	        int right = 2 * i + 2; // right = 2*i + 2
	        
	        if (left < n && arr[left] > arr[largest])
	            largest = left;

	        if (right < n && arr[right] > arr[largest])
	            largest = right;
	       
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	            
	            heapify(arr, n, largest);
	            
	        }
	    }

	    static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
}




