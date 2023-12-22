import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long M = sc.nextLong();
            int V = sc.nextInt();
            int P = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A);

            long[] S = new long[N];
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    S[i] = A[i];
                } else {
                    S[i] = S[i - 1] + A[i];
                }
            }

            //System.out.println(Arrays.toString(A));

            long ans = -1;

            for (int i = 0; i < N; i++) {
                long K = A[i] + M;

                if (K < A[N - P]) {
                    continue;
                }

                long x = M * (V - i - 1);
                if (x <= 0) {
                    ans = N - i;
                    break;
                }

                int pos = Arrays.binarySearch(A, K + 1);
                if (pos < 0) {
                    pos = -(pos + 1);
                }

                //System.out.println(i + " x : " + x + " pos : " + pos);

                x -= K * (pos - i - 1) - (S[pos - 1] - S[i]);
                if (x <= 0) {
                    ans = N - i;
                    break;
                }

                x -= M * (N - pos);
                if (x <= 0) {
                    ans = N - i;
                    break;
                }

                x -= M * (pos - (N - P) - 1) - (K * (pos - (N - P) - 1) - (S[pos - 1] - S[N - P]));
                if (x <= 0) {
                    ans = N - i;
                    break;
                }
                
                //System.out.println(i + " x : " + x);
            }

            System.out.println(ans);
        }
    }

}
