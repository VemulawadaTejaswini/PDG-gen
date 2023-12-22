import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long M = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long lcm = 1;
            for (int i = 0; i < N; i++) {
                lcm = lcm(lcm, A[i]);
                if (lcm > M) {
                    System.out.println(0);
                    return;
                }
            }

            for (int i = 0; i < N; i++) {
                if ((lcm / A[i]) % 2 == 0) {
                    System.out.println(0);
                    return;
                }
            }

            long ans = (M * 2 / lcm + 1) / 2;

            System.out.println(ans);
        }
    }

    public static long gcd(long M, long N) {
        if (M < N) {
            return gcd(N, M);
        }
        return N > 0 ? gcd(N, M % N) : M;
    }

    public static long lcm(long M, long N) {
        return M * N / gcd(M, N);
    }

}
