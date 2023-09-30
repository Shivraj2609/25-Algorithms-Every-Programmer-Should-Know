import java.util.Arrays;
import java.util.Collections;

public class InbuiltRevSort {

    public static void main(String[] args) {
        // Sorting in descending order
        Integer[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        Arrays.sort(arr, Collections.reverseOrder()); // Sort in descending order

        System.out.println("\nSorted Array (Descending Order):");
        printArray(arr);
    }

    public static void printArray(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*The provided Java program demonstrates how to use the `Arrays.sort` method along with `Collections.reverseOrder()` to sort an array of integers in descending order. Here's a short description of its working:

1. An array of integers `arr` is created, containing the values {64, 25, 12, 22, 11}.

2. The program prints the original array using the `printArray` method, displaying "Original Array."

3. The `Arrays.sort` method is used with `Collections.reverseOrder()` as the comparator. This combination sorts the `arr` array in descending order, meaning the largest elements will come first.

4. The program then prints the sorted array using the `printArray` method, displaying "Sorted Array (Descending Order)."

5. The `printArray` method is a utility function that prints the elements of an Integer array, separated by spaces.

As a result, the program will output the original array followed by the sorted array, showing the elements in descending order.*/
