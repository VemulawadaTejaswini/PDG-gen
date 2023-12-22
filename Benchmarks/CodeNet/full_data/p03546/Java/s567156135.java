import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            int[][] c = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    c[i][j] = in.nextInt();
                }
            }

            int[][] A = new int[H][W];
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    A[h][w] = in.nextInt();
                }
            }

            for (int k = 0; k < 10; k++) {
                for (int from = 0; from < 10; from++) {
                    for (int to = 0; to < 10; to++) {
                        c[from][to] = Math.min(c[from][to], c[from][k] + c[k][to]);
                    }
                }
            }

            long sum = 0;
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (A[h][w] != -1) {
                        sum += c[A[h][w]][1];
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
