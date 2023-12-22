import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        System.out.println(ans(A) ? "YES" : "NO");
    }

    private static boolean ans(int[] A) {
        long N = A.length;
        if (N == 1) {
            return true;
        }

        long sum = 0;
        for (long a : A) {
            sum += a;
        }

        final long round = (N * (N + 1)) / 2L;
        if (sum % round > 0) {
            return false;
        }

        final int K = (int) (sum / round);

        int[] d = new int[(int) N];
        for (int i = 0; i < N; i++) {
            int ni = (int) ((i + 1) % N);
            d[i] = A[ni] - A[i];
        }

        long k = K;
        for (int i = 0; i < N; i++) {
            if (d[i] < K) {
                k -= (K - d[i]) / N;
            }
            if (k < 0) {
                return false;
            }
        }

        return true;
    }
}