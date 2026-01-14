public class DeleteArr {
    public static int[] deleteElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr) {
            if (num != element) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        int elementToDelete = 3;
        System.out.println("Original Array:");
        printArray(arr);
        arr = deleteElement(arr, elementToDelete);
        System.out.println("Array after deleting " + elementToDelete + ":");
        printArray(arr);
    }
}
