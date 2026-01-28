import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;    // O(1)
        int n2 = right - mid;       // O(1)

        int[] L = new int[n1];      // O(n)
        int[] R = new int[n2];      // O(n)

        
        for (int i = 0; i < n1; i++) {  // O(n)
            L[i] = arr[left + i];       // O(1)
        }

        for (int j = 0; j < n2; j++) {  // O(n)
            R[j] = arr[mid + 1 + j];    // O(1)
        }

        int i = 0, j = 0;           // O(1)
        int k = left;               // O(1)

        while (i < n1 && j < n2) {  // O(n)
            if (L[i] <= R[j]) {     // O(1)
                arr[k] = L[i];      // O(1)
                i++;                // O(1)
            } else {
                arr[k] = R[j];      // O(1)
                j++;                // O(1)
            }
            k++;                    // O(1)
        }
        while (i < n1) {            // O(n)
            arr[k] = L[i];          // O(1)
            i++;                    // O(1)
            k++;                    // O(1)
        }
        while (j < n2) {            // O(n)
            arr[k] = R[j];          // O(1)
            j++;                    // O(1)
            k++;                    // O(1)
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {             // O(1)
            int mid = left + (right - left) / 2; // O(1)

            mergeSort(arr, left, mid);      // Recurrence call
            mergeSort(arr, mid + 1, right); // Recurrence call

            merge(arr, left, mid, right);   // O(n)
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // O(1)

        System.out.print("Enter number of elements: "); // O(1)
        int n = in.nextInt();                 // O(1)

        int[] arr = new int[n];               // O(1)

        System.out.println("Enter elements:");// O(1)
        for (int i = 0; i < n; i++) {         // O(n)
            arr[i] = in.nextInt();            // O(1) → O(n)
        }

        mergeSort(arr, 0, n - 1);             // O(n log n)

        System.out.println("Sorted array: " + Arrays.toString(arr)); // O(n)
    }

    // ------------------- Recurrence Relation -------------------
    /*
     * Merge step takes O(n) time.
     *
     * Best / Average / Worst Case:
     *   Array is always divided into two halves.
     *
     *   Recurrence:
     *     T(n) = T(n/2) + T(n/2) + cn
     *          = 2T(n/2) + cn
     */

    // ------------------- Substitution Method -------------------
    /*
     * T(n) = 2T(n/2) + cn
     *
     * = 2[2T(n/4) + c(n/2)] + cn
     * = 4T(n/4) + 2cn + cn
     * = 4T(n/4) + 3cn
     *
     * After k levels:
     *   T(n) = 2^k T(n / 2^k) + kcn
     *
     * Stop when:
     *   n / 2^k = 1  →  k = log n
     *
     * T(n) = nT(1) + cn log n
     * T(n) = O(n log n)
     */

    // ------------------- Complexity (short) -------------------
    /*
     * Merge Sort:
     *   Best Case: O(n log n)
     *   Average Case: O(n log n)
     *   Worst Case: O(n log n)
     *   Space Complexity: O(n)
     */
}
