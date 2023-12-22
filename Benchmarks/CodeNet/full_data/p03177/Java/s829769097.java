import  java.math.*;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[][] A = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        long[][] res = pow_mod_m(A, N, K);
        int m = (int) 1e9 + 7;

        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans += res[i][j];
                ans %= m;
            }
        }

        System.out.println(ans);
    }

    public static long[][] pow_mod_m(long[][] A, int N, long K) {
        long[][] ret = new long[N][N];
        for (int i = 0; i < N; i++) ret[i][i] = 1;

        while (K > 0) {
            if ((K & 1) == 1) ret = mul_m(ret, A, N);
            A = mul_m(A, A, N);
            K >>= 1;
        }
        return ret;
    }

    public static long[][] mul_m(long[][] A, long[][] B, int N) {
        long[][] res = new long[N][N];
        int m = (int) 1e9 + 7;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                    res[i][j] %= m;
                }
            }
        }

        return res;
    }
}
