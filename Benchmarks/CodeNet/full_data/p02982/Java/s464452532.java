import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int D = in.nextInt();
            int[][] X = new int[N][D];
            for (int n = 0; n < N; n++) {
                for (int d = 0; d < D; d++) {
                    X[n][d] = in.nextInt();
                }
            }

            int count = 0;
            for (int n = 0; n < N; n++) {
                for (int n2 = n + 1; n2 < N; n2++) {
                    if (is(n, n2, X, D)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static boolean is(int n, int n2, int[][] x, int D) {
        int sum = 0;
        for (int d = 0; d < D; d++) {
            int diff = x[n][d] - x[n2][d];
            sum += diff * diff;
        }

        for (int i = 0; i * i <= sum; i++) {
            if (i * i == sum) {
                return true;
            }
        }

        return false;
    }
}
