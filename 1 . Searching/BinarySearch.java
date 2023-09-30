import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

/*Description About The Code :

The provided code is for a Java program that implements the binary search algorithm to search for a target element in a sorted array. Here is a short description of the code:

1. The `binarySearch` function takes an array of integers and a target value as input and returns the index of the target value in the array. If the target is not found, it returns -1. It performs the binary search by maintaining two pointers (`left` and `right`) to the beginning and end of the array, respectively. It iteratively divides the search range in half and compares the middle element with the target, updating the pointers accordingly until the target is found or the search range is exhausted.

2. In the `main` function:
   - It prompts the user to input the length of the sorted array and then reads the elements from the user.
   - It also asks the user to enter the element to search for (`target`).
   - It sorts the input array using `Arrays.sort()` because binary search requires a sorted array.
   - It calls the `binarySearch` function to search for the target element and prints the result.
   - If the target is found, it prints the index at which it was found; otherwise, it prints that the element was not found in the array.

Overall, this code demonstrates the binary search algorithm in action and provides a simple command-line interface for the user to input the array and the element to search for.*/
