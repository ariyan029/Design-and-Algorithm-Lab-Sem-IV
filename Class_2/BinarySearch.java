import java.util.Arrays;                 // Time: O(1) 
import java.util.Scanner;                // Time: O(1) 

public class BinarySearch {              // Time: O(1) 

    public static int binarySearch(int[] arr, int target) {
        int left = 0;                    // Time: O(1) 
        int right = arr.length - 1;      // Time: O(1)

        while (left <= right) {          // Time: O(log n) 
            int mid = left + (right - left) / 2; // Time: O(1)
            if (arr[mid] == target) {    // Time: O(1)
                return mid;              // Time: O(1)
            } else if (arr[mid] < target) { // Time: O(1) 
                left = mid + 1;          // Time: O(1) 
            } else {
                right = mid - 1;         // Time: O(1) 
            }
        }
        return -1;                       // Time: O(1) 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Time: O(1) 
        int[] arr = new int[5];              // Time: O(1) 
        System.out.println("Enter 5 elements:"); // Time: O(1) 
        for (int i = 0; i < arr.length; i++) { // Time: O(n) 
            arr[i] = in.nextInt();             // Time: O(1) 
        }
        Arrays.sort(arr);                       // Time: O(n log n) 
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Time: O(n) 
        System.out.print("Enter the target element to search: "); // Time: O(1) 
        int target = in.nextInt();                                 // Time: O(1) 
        int result = binarySearch(arr, target); // Time: O(log n) 
        if (result != -1) {                     // Time: O(1) 
            System.out.println("Element found at index: " + result); // Time: O(1) 
        } else {
            System.out.println("Element not found in the array.");   // Time: O(1) 
        }

        /*
        ===== FINAL COMPLEXITIES =====
        Binary Search (iterative):
        Time = O(log n), Space = O(1)
        Whole Program (including sorting):
        Time = O(n log n), Space = O(n)
        */
    }
}

