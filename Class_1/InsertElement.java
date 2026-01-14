import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter position (0-based index): ");
        int pos = sc.nextInt();
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
/*
Enter elements:
1 2 3
Enter element to insert: 5
Enter position (0-based index): 0
Array after insertion:
5 1 2 3 
*/