import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];          // O(1)
        int i = low - 1;                // O(1)

        for (int j = low; j < high; j++) { // O(n)
            if (arr[j] <= pivot) {      // O(1)
                i++;                    // O(1)

                int temp = arr[i];      // O(1)
                arr[i] = arr[j];        // O(1)
                arr[j] = temp;          // O(1)
            }
        }

        int temp = arr[i + 1];          // O(1)
        arr[i + 1] = arr[high];         // O(1)
        arr[high] = temp;               // O(1)

        return i + 1;                   // O(1)
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {               // O(1)
            int pi = partition(arr, low, high); // O(n)

            quickSort(arr, low, pi - 1); // Recurrence call
            quickSort(arr, pi + 1, high);// Recurrence call
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // O(1)

        System.out.print("Enter number of elements: "); // O(1)
        int n = in.nextInt();                 // O(1)

        int[] arr = new int[n];               // O(1)

        System.out.println("Enter elements:");// O(1)
        for (int i = 0; i < n; i++) {         // O(n)
            arr[i] = in.nextInt();            // O(1) → O(n)
        }

        quickSort(arr, 0, n - 1);             // O(n log n) avg

        System.out.println("Sorted array: " + Arrays.toString(arr)); // O(n)
    }

    // ------------------- Recurrence Relation -------------------
    /*
     * Partition step takes O(n) time.
     *
     * Best / Average Case:
     *   Pivot divides array into two equal halves.
     *   Recurrence:
     *     T(n) = T(n/2) + T(n/2) + cn
     *          = 2T(n/2) + cn
     *
     * Worst Case:
     *   Pivot is smallest or largest element.
     *   Recurrence:
     *     T(n) = T(n - 1) + cn
     */

    // ------------------- Substitution Method -------------------
    /*
     * Best / Average Case:
     *
     *   T(n) = 2T(n/2) + cn
     *
     *   = 2[2T(n/4) + c(n/2)] + cn
     *   = 4T(n/4) + 2cn + cn
     *   = 4T(n/4) + 3cn
     *
     *   After k levels:
     *     T(n) = 2^k T(n / 2^k) + kcn
     *   Stop when:
     *     n / 2^k = 1  →  k = log n
     *   T(n) = nT(1) + cn log n
     *   T(n) = O(n log n)
     *
     * Worst Case:
     *   T(n) = T(n - 1) + cn
     *   = T(n - 2) + c(n - 1) + cn
     *   = T(n - 3) + c(n - 2) + c(n - 1) + cn
     *   ...
     *   = T(1) + c(2 + 3 + ... + n)
     *   Sum = n(n + 1) / 2
     *   T(n) = O(n^2)
     */

    // ------------------- Complexity (short) -------------------
    /*
     * Quick Sort:
     *   Average Case: O(n log n)
     *   Worst Case: O(n^2)
     *   Space Complexity: O(log n) (recursive stack)
     */
}
