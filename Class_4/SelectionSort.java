import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("====Selection sort=====");
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        s_sort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }
    public static void s_sort(int arr[]) {
        int min_index;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
