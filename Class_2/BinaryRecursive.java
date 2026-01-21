import java.util.Arrays;
import java.util.Scanner;
public class BinaryRecursive {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;                       // O(1)
        }
        int mid = left + (right - left) / 2; // O(1)
        if (arr[mid] == target) {
            return mid;                      // O(1)
        }
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); // O(log n)
        }
        else {
            return binarySearch(arr, target, left, mid - 1);  // O(log n)
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // O(1)
        System.out.print("Enter number of elements: "); // O(1)
        int n = in.nextInt();                 // O(1)
        int[] arr = new int[n];               // O(1)
        System.out.println("Enter elements:"); // O(1)
        for (int i = 0; i < n; i++) {        // O(n)
            arr[i] = in.nextInt();           // O(n)
        }
        Arrays.sort(arr);                     // O(n log n)
        System.out.println("Sorted array: " + Arrays.toString(arr)); // O(n)
        System.out.print("Enter target element: "); // O(1)
        int target = in.nextInt();            // O(1)
        int result = binarySearch(arr, target, 0, arr.length - 1); // O(log n)
        if (result != -1) {                   // O(1)
            System.out.println("Element found at index: " + result); // O(1)
        } else {
            System.out.println("Element not found."); // O(1)
        }
        // ------------------- Complexity (short) -------------------
        // Input + loop: O(n)
        // Sort: O(n log n)
        // Binary search: O(log n)
        // Total: O(n log n)
    }
}