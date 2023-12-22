import java.util.Scanner;

/**
 * Handshake
 */
public class Main2 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int MAX = 100000;

            int N = sc.nextInt();
            long M = sc.nextLong();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] C = new int[MAX + 2];
            for (int a : A) {
                C[a]++;
            }

            int[] CS = new int[MAX + 2];
            for (int i = MAX; i >= 0; i--) {
                CS[i] += CS[i + 1] + C[i];
            }

            int min = 0;
            int max = MAX * 2;

            while (max - min > 1) {
                int mid = (max + min) / 2;

                long K = 0;
                for (int a : A) {
                    K += CS[Math.max(mid - a, 0)];
                }

                if (K < M) {
                    max = mid;
                } else {
                    min = mid;
                }
            }

            long[] S = new long[MAX + 2];
            for (int i = MAX; i >= 0; i--) {
                S[i] = S[i + 1] + (long) i * C[i];
            }

            long H = 0;
            long K = 0;
            for (int a : A) {
                H += a * CS[Math.max(min + 1 - a, 0)] + S[Math.max(min + 1 - a, 0)];
                K += CS[Math.max(min + 1 - a, 0)];
            }

            if (M - K > 0) {
                H += min * (M - K);
            }

            System.out.println(H);
        }
    }

}
