import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, -3, 10, 9, 7};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
