import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long K = in.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }

//            long m = 0;
//            for (long i = 0; i <= K; i++) {
////                Utils.debug(i, f(A, i));
//                m = Math.max(m, f(A, i));
//            }
//            Utils.debug(m);

            long[] count = new long[64];
            for (int i = 0; i < N; i++) {
                for (int shift = 0; shift < 64; shift++) {
                    long mask = 1L << shift;
                    count[shift] += (A[i] & mask) == 0 ? 0 : 1;
                }
            }
//            Utils.debug(count);

            long sum = 0L;
            long k = 0L;
            int shift = 63;
//            for (; shift < 64; shift++) {
//                if (((1L << shift) - 1) >= K) {
//                    break;
//                }
//            }

            sum = 0;
            k = 0;
            for (; shift >= 0; shift--) {
                if ((1L << shift) > K) {
//                    Utils.debug(shift, "k, sum", k, sum);
                    continue;
                }

                if (k + (1L << shift) <= K && N - count[shift] > count[shift]) {
                    sum += (N - count[shift]) * (1L << shift);
                    k += (1L << shift);
                } else {
                    sum += count[shift] * (1L << shift);
                    k += 0;
                }
//                Utils.debug(shift, "k, sum", k, sum);
            }

//            long[][] dp = new long[64][2];
//            dp[0][0] = count[0];
//            dp[0][1] = N - count[0];
//            for (int i = 1; i < 64; i++) {
//                for (int j = 0; j < 2; j++) {
//                    dp[i][j] = dp[i - 1][0];
//                }
//            }
//            long sum = dfs(63, 0, count, N, K);
//            Utils.debug(m, sum);
//            long sum = 0;
//            for (long mask = 1; mask <= K; mask <<= 1) {
//                long max = 0;
//                max = Math.max(max, f(A, mask, 0));
//                max = Math.max(max, f(A, mask, mask));
//                sum += max;
//            }

            System.out.println(sum);
        }
    }

    static long[][] dp2 = new long[100][100];

    private static long dfs(int shift, long sum, long[] count, int N, long K) {
        if (shift < 0) {
            return 0;
        }
//        if(dp2[shift][sum])
        long l = (long) -1e9;
        if (sum + (1L << shift) <= K) {
            l = (1L << shift) * (N - count[shift]) + dfs(shift - 1, sum + (1L << shift), count, N, K);
        }
        long l2 = (1L << shift) * count[shift] + dfs(shift - 1, sum, count, N, K);
        return Math.max(l, l2);
    }

    private static long f(long[] a, long mask, long x) {
        long f = 0;
        for (int i = 0; i < a.length; i++) {
            f += (a[i] ^ x) & mask;
        }
        return f;
    }

    private static long f(long[] a, long x) {
        long f = 0;
        for (int i = 0; i < a.length; i++) {
            f += a[i] ^ x;
        }
        return f;
    }

}
