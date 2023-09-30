public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*Description : 
The provided code is a Java program that demonstrates the Bubble Sort algorithm to sort an array of integers in ascending order. Here's a short description of the code:

1. The `bubbleSort` function takes an array of integers as input and sorts it using the Bubble Sort algorithm. Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until no more swaps are needed, indicating that the array is sorted.

2. In the `main` function:
   - It initializes an array with unsorted integer values.
   - It prints the original unsorted array.
   - It calls the `bubbleSort` function to sort the array in ascending order.
   - It prints the sorted array.

3. The `printArray` function is a utility function used to print the elements of an array.

The program provides a basic example of the Bubble Sort algorithm, which is not the most efficient sorting algorithm but is easy to understand and implement. It can be useful for educational purposes and for sorting small arrays.*/
