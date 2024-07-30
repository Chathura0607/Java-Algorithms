import java.util.Scanner;

public class SearchDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 9, 5, 3, 6, 9};
        searchDuplicate(arr);
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        return scanner.nextInt();
    }

    private static void searchDuplicate(int[] arr) {
        while (true) {
            int search = enterNumber();
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == search) {
                    System.out.println("Element found at index " + i);
                    found = true;

                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == search) {
                            System.out.println("Duplicate found at index " + j + " and " + i);
                            break;
                        }
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Value not found");
            }
        }
    }
}
