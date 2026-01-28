import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;     // O(1)
        int n2 = right - mid;        // O(1)
        int[] L = new int[n1];       // O(n1)
        int[] R = new int[n2];       // O(n2)
        for (int i = 0; i < n1; i++) // O(n1)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) // O(n2)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;  // O(1)
        while (i < n1 && j < n2) {   // O(n)
            if (L[i] <= R[j]) {      // O(1)
                arr[k] = L[i];       // O(1)
                i++;
            } else {
                arr[k] = R[j];       // O(1)
                j++;
            }
            k++;
        }
        while (i < n1) {             // O(n1)
            arr[k] = L[i];           // O(1)
            i++;
            k++;
        }
        while (j < n2) {             // O(n2)
            arr[k] = R[j];           // O(1)
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {          // O(1)
            int mid = (left + right) / 2; // O(1)

            mergeSort(arr, left, mid);     // O(log n)
            mergeSort(arr, mid + 1, right);// O(log n)

            merge(arr, left, mid, right);  // O(n)
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // O(1)
        System.out.print("Enter number of elements: "); // O(1)
        int n = in.nextInt();                   // O(1)
        int[] arr = new int[n];                 // O(1)
        System.out.println("Enter elements:");  // O(1)
        for (int i = 0; i < n; i++) {            // O(n)
            arr[i] = in.nextInt();               // O(1) each → O(n)
        }
        mergeSort(arr, 0, n - 1);                // O(n log n)
        System.out.println("Sorted array: " + Arrays.toString(arr)); // O(n)
    }
    // ------------------- Complexity (short) -------------------
    /*
     * Merge Sort:
     *   Dividing array: O(log n)
     *   Merging arrays: O(n) at each level
     *   Total: O(n log n)
     *
     * Input reading: O(n)
     * Printing: O(n)
     * Overall: O(n log n) (dominant term)
     */
}

