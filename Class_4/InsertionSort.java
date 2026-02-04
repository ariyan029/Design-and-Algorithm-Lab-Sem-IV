import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("====Insertion Sort====");   // O(1)
        int[] arr = new int[5];                         // O(1)
        Scanner in = new Scanner(System.in);            // O(1)
        System.out.println("Enter the elements of the array:"); // O(1)
        for (int i = 0; i < arr.length; i++) {           // O(n)
            arr[i] = in.nextInt();                       // O(1) → O(n)
        }
        System.out.println(Arrays.toString(arr));        // O(n)
        insert_sort(arr);                                // O(n²)
        System.out.println("The sorted array is " + Arrays.toString(arr));    // O(n)
    }
    public static void insert_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {           // O(n)
            int key = arr[i];                            // O(1)
            int j = i - 1;                               // O(1)
            while (j >= 0 && arr[j] > key) {             // O(n)
                arr[j + 1] = arr[j];                     // O(1)
                j--;                                     // O(1)
            }
            arr[j + 1] = key;                            // O(1)
        }
    }
    // ------------------- Time Complexity Analysis -------------------
    /*
     * Outer loop runs (n - 1) times.
     * Inner while loop runs up to i times in the worst case.
     *
     * Worst-case comparisons:
     *   1 + 2 + 3 + ... + (n - 1)
     * = n(n - 1) / 2
     *
     * T(n) = O(n²)
     */

    // ------------------- Complexity (short) -------------------
    /*
     * Insertion Sort:
     *   Best Case: O(n)        (already sorted array)
     *   Average Case: O(n²)
     *   Worst Case: O(n²)      (reverse sorted array)
     *   Space Complexity: O(1)
     */
}
