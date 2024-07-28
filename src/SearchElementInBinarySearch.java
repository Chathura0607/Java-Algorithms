import java.util.Scanner;

public class SearchElementInBinarySearch {
    public static void main(String[] args) {
        int [] arr = {10,-3,8,2,5,35,9,45,53};
        sortingArray(arr);
        binarySearch(arr);
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to search : ");
        return scanner.nextInt();
    }

    private static int[] sortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static void binarySearch(int[] arr) {
        while (true) {
            int search = enterNumber();

            boolean found = false;

            int midIndex = (0 + arr.length) / 2;
            if (arr[midIndex] == search) {
                System.out.println("Found at index : " + midIndex);
                found = true;
                break;

            } else if (arr[midIndex] < search) {
                for (int i = midIndex + 1; i < arr.length; i++) {
                    if (arr[i] == search) {
                        System.out.println("Found at index : " + i);
                        found = true;
                        break;
                    }
                }
            } else if (arr[midIndex] > search) {
                for (int i = midIndex - 1; i >= 0; i--) {
                    if (arr[i] == search) {
                        System.out.println("Found at index : " + i);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("\u001B[31mElement doesn't exist !\u001B[0m");
            }
        }
    }
}
