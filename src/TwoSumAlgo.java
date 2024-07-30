import java.util.Scanner;

public class TwoSumAlgo {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 4, 6, 8, 13, 21};
        twoSum(arr);
    }

    private static void twoSum(int[] arr) {
        while (true) {
            int search = enterNumber();
            boolean found = false;

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == search) {
                        System.out.println(arr[i] + "[ index " + i + "]" + " + " + arr[j] + "[ index " + j + "]" + " = " + search);
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("Not Found Values");
            }
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        return scanner.nextInt();
    }
}
