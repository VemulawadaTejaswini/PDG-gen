import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[][] A = new int[2][N];
            for (int r = 0; r < 2; r++) {
                for (int c = 0; c < N; c++) {
                    A[r][c] = in.nextInt();
                }
            }

            int max = 0;
            for (int c = 0; c < N; c++) {
                int count = 0;
                for (int c2 = 0; c2 < N; c2++) {
                    if (c2 < c) {
                        count += A[0][c2];
                    } else if (c2 == c) {
                        count += A[0][c2];
                        count += A[1][c2];
                    } else {
                        count += A[1][c2];
                    }
                }
                max = Math.max(max, count);
            }
            System.out.println(max);
        }
    }
}
