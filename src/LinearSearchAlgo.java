public class LinearSearchAlgo {
    public static void main(String[] args) {
        int [] nums = {10, 2, 8, 3, 5};
        int search = 2;
        linearSearchAlgo(nums, search);
    }

    private static void linearSearchAlgo(int[] nums, int search) {
        for(int i = 0; i < nums.length; i++) {
            if (search == nums[i]) {
                System.out.println("Element Found at Index: " + i);
                break;
            } else {
                System.out.println("Element Not Found at Index: " + i);
            }
        }
    }
}
