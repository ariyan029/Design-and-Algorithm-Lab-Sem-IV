import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;                   // O(1)
        for (int i = 0; i < n - 1; i++) {    // Outer loop: O(n)
            for (int j = 0; j < n - i - 1; j++) { // Inner loop: O(n) → total O(n^2)
                if (arr[j] > arr[j + 1]) {   // O(1)
                    int temp = arr[j];       // O(1)
                    arr[j] = arr[j + 1];    // O(1)
                    arr[j + 1] = temp;      // O(1)
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // O(1)
        System.out.print("Enter number of elements: "); // O(1)
        int n = in.nextInt();                 // O(1)
        int[] arr = new int[n];               // O(1)
        System.out.println("Enter elements:"); // O(1)
        for (int i = 0; i < n; i++) {        // O(n)
            arr[i] = in.nextInt();           // O(1) each → O(n)
        }
        bubbleSort(arr);                      // O(n^2)
        System.out.println("Sorted array: " + Arrays.toString(arr)); // O(n)
    }
    // ------------------- Complexity (short) -------------------
    /*
     * Bubble Sort:
     *   Outer loop: O(n)
     *   Inner loop: O(n)
     *   Total: O(n^2)
     * Input reading: O(n)
     * Printing: O(n)
     * Overall: O(n^2) (dominant term)
     */
}
