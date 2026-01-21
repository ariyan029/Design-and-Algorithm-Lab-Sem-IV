import java.util.Arrays;                 //  O(1) 
import java.util.Scanner;                //  O(1) 

public class BinarySearch {              // O(1) 

    public static int binarySearch(int[] arr, int target) {
        int left = 0;                    //  O(1) 
        int right = arr.length - 1;      //  O(1)

        while (left <= right) {          //  O(log n) 
            int mid = left + (right - left) / 2; //  O(1)
            if (arr[mid] == target) {    //  O(1)
                return mid;              //  O(1)
            } else if (arr[mid] < target) { //  O(1)
                left = mid + 1;          //  O(1)
            } else {
                right = mid - 1;         //  O(1)
            }
        }
        return -1;                       //  O(1)
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //  O(1) 
        int[] arr = new int[5];              //  O(1) 
        System.out.println("Enter 5 elements:"); //  O(1) 
        for (int i = 0; i < arr.length; i++) { //  O(n) 
            arr[i] = in.nextInt();             //  O(1) 
        }
        Arrays.sort(arr);                       //  O(n log n) 
        System.out.println("Sorted Array: " + Arrays.toString(arr)); //  O(n) 
        System.out.print("Enter the target element to search: "); //  O(1) 
        int target = in.nextInt();                                 //  O(1) 
        int result = binarySearch(arr, target); //  O(log n) 
        if (result != -1) {                     //  O(1) 
            System.out.println("Element found at index: " + result); //  O(1) 
        } else {
            System.out.println("Element not found in the array.");   //  O(1) 
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

