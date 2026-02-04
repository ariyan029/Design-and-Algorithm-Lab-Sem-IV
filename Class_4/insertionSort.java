
import java.util.Arrays;
import java.util.Scanner;
public class insertionSort{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("====Insertion Sort====");
        int [] arr=new int[5];
        System.out.println("Enter the elements of the array :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("The unsorted array is :-"+Arrays.toString(arr));
    }
    public static void Insert_sort (int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            
        }
    }
}