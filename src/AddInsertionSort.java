import java.util.Arrays;
import java.util.Scanner;

public class AddInsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (true) {
            arr = addInsertionSort(arr);
            printArray(arr);
        }
    }

    private static int[] addInsertionSort(int[] arr) {
        int number = enterNumber();
        int[] newArr = new int[arr.length + 1];
        int i = arr.length - 1;

        while (i >= 0 && arr[i] > number) {
            newArr[i + 1] = arr[i];
            i--;
        }

        newArr[i + 1] = number;
        while (i >= 0) {
            newArr[i] = arr[i];
            i--;
        }
        return newArr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        return scanner.nextInt();
    }
}