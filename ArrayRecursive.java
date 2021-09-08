package Task07;

public class ArrayRecursive {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 4, 6, 0, 90};
        printArray(array, array.length - 1);

    }

    private static void printArray(int[] arr, int i) {
        if (i != -1) {
            printArray(arr, i - 1);
            System.out.println(arr[i]);
        }
    }
}
