import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {10, -3, 5, 8, 3, 25, 32, 2, 4, 12};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int mainValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > mainValue) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = mainValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
