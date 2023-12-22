import java.util.*;

public class Main {

    static int mod = 1_000_000_007;

    static long[][] mul(long[][] A, long[][] B) {
        long[][] C = new long[A.length][B[0].length];
        for (int i=0;i<A.length;i++) {
            for (int k=0;k<B.length;k++) {
                for (int j=0;j<B[0].length;j++) {
                    C[i][j] = (C[i][j]+A[i][k]*B[k][j])%mod;
                }
            }
        }
        return C;
    }

    static long[][] pow(long[][] A, long n) {
        long[][] B = new long[A.length][A.length];
        for (int i=0;i<A.length;i++) {
            B[i][i]=1;
        }
        while (n>0) {
            if ((n&1)==1) {
                B = mul(B, A);
            }
            A = mul(A, A);
            n>>=1;
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = sc.nextLong();
        long[][] a = new long[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        a = pow(a, K);
        long ans = 0;
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                ans = (ans + a[i][j]) % mod;
            }
        }
        System.out.println(ans);
    }
}