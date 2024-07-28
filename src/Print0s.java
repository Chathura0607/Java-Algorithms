public class Print0s {
    public static void main(String[] args) {
        int col = 10;
        int row = 10;
        print100s(col, row);
    }

    private static void print100s(int col, int row) {
        for (int i = 0; i <= col; i++) {
            for (int j = 0; j <= row; j++) {
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }
}
