import java.util.Arrays;
import java.util.Scanner;

public class BinaryRecursive {
  
    public static int binarySearch(int[] arr, int target, int left, int right) {

        // Base case: element not found
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // Search right half
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        }
        
        else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // Binary search requires sorted array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.print("Enter target element: ");
        int target = in.nextInt();
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
