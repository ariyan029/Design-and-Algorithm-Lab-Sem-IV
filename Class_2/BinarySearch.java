import java.util.Arrays;          // Time: O(1) | Space: O(1)
import java.util.Scanner;         // Time: O(1) | Space: O(1)

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;             // Time: O(1) | Space: O(1)
        int right = arr.length-1; // Time: O(1) | Space: O(1)

        while (left <= right) {   // Time: O(log n) | Space: O(1)

            int mid = (left + right) / 2; // Time: O(1) | Space: O(1)

            if (arr[mid] == target) {     // Time: O(1) | Space: O(1)
                return mid;               // Time: O(1) | Space: O(1)
            } 
            else if (arr[mid] < target) { // Time: O(1) | Space: O(1)
                left = mid + 1;           // Time: O(1) | Space: O(1)
            } 
            else {
                right = mid - 1;          // Time: O(1) | Space: O(1)
            }
        }
        return -1;                        // Time: O(1) | Space: O(1)
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Time: O(1) | Space: O(1)
        int[] arr = new int[5];              // Time: O(1) | Space: O(n)

        for (int i = 0; i < arr.length; i++) { // Time: O(n) | Space: O(1)
            arr[i] = in.nextInt();             // Time: O(1)
        }
        Arrays.sort(arr);                     // Time: O(n log n) | Space: O(log n)
        int target = in.nextInt();             // Time: O(1) | Space: O(1)
        int result = binarySearch(arr, target);// Time: O(log n) | Space: O(1)
    }
}
/*
FINAL RESULT:

Binary Search:
Time  = O(log n)
Space = O(1)

Whole Program:
Time  = O(n log n)
Space = O(n)
*/
