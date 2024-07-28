public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int search = 10;
        binarySearchAlgo(arr, search);
    }

    private static void binarySearchAlgo(int[] arr, int search) {
        int midIndex = 0 + arr.length / 2;

        if (midIndex == search) {
            System.out.println("Index Found at: " + midIndex);
        } else if (arr[midIndex] > search) {
            for (int i = midIndex - 1; i <= 0; i++) {
                if (arr[i] == search) {
                    System.out.println("index found at: " + i);
                }
            }
        } else {
            if (arr[midIndex] < search) {
                for (int i = midIndex + 1; i < arr.length; i++) {
                    if (arr[i] == search) {
                        System.out.println("index found at: " + i);
                    }
                }
            }
        }
    }
}
