import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 2, 13};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
