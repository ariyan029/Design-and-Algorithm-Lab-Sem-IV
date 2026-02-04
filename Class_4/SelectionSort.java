import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("====Selection sort====="); // O(1)
        int[] arr = new int[5];          // O(1)
        Scanner in = new Scanner(System.in); // O(1)
        System.out.println("Enter the elements of the array:"); // O(1)
        for (int i = 0; i < arr.length; i++) {  // O(n)
            arr[i] = in.nextInt();              // O(1) → O(n)
        }
        System.out.println(Arrays.toString(arr)); // O(n)
        s_sort(arr); // O(n²)
        System.out.println("The sorted array is " + Arrays.toString(arr)); // O(n)
    }
    // ------------------- Selection Sort Logic -------------------
    public static void s_sort(int arr[]) {
        int min_index;                   // O(1)
        for (int i = 0; i < arr.length - 1; i++) { // O(n)
            min_index = i;               // O(1)
            for (int j = i + 1; j < arr.length; j++) { // O(n)
                if (arr[j] < arr[min_index]) {         // O(1)
                    min_index = j;                      // O(1)
                }
            }
            // Swap
            int temp = arr[i];           // O(1)
            arr[i] = arr[min_index];     // O(1)
            arr[min_index] = temp;       // O(1)
        }
    }

    // ------------------- Time Complexity Analysis -------------------
    /*
     * Outer loop runs (n - 1) times.
     * Inner loop runs (n - i - 1) times.
     *
     * Total comparisons:
     *   (n - 1) + (n - 2) + ... + 1
     * = n(n - 1) / 2
     *
     * T(n) = O(n²)
     */

    // ------------------- Complexity (short) -------------------
    /*
     * Selection Sort:
     *   Best Case: O(n²)
     *   Average Case: O(n²)
     *   Worst Case: O(n²)
     *   Space Complexity: O(1)
     */
}
