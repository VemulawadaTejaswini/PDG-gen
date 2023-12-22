import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[][] C = new int[3][3];
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    C[r][c] = in.nextInt();
                }
            }

            int[] a = new int[3];
            int[] b = new int[3];
            int[][] a2 = new int[3][3];
            a[0] = 0;

            for (int c = 0; c < 3; c++) {
                b[c] = C[0][c] - a[0];
            }

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    a2[r][c] = C[r][c] - b[c];
                }
            }

            for (int r = 0; r < 3; r++) {
                for (int c = 1; c < 3; c++) {
                    if (a2[r][c - 1] != a2[r][c]) {
                        System.out.println("No");
                        return;
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}
