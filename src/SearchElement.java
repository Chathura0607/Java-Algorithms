import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {2, 5, -3, 10, 9, 7};

        while (true) {
            int search = inputNumber(scanner);
            searchElement(arr, search);
        }
    }

    private static void searchElement(int[] arr, int search) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Element found at Index: " + i);
                found = true;
                break;
            }
        } if (!found) {
            System.out.println("\u001B[31mElement not found\u001B[0m");
        }
    }

    private static int inputNumber(Scanner scanner) {
        System.out.print("Input number to Search: : ");
        return scanner.nextInt();
    }
}
