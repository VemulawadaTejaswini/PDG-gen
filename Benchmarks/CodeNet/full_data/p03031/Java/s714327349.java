import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] k;
    static int[][] s;
    static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        k = new int[M];
        s = new int[M][N];
        for (int i = 0; i < M; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }
        //bit
        int ans = 0;
        for (int bits = 0; bits < modPow(2,N); bits++) {
            int b = bits;
            int[] d = new int[N];
            for (int i = 0; i < N; i++) {
                d[i] = b%2;
                b /= 2;
            }
            boolean ok = true;
            for (int j = 0; j < M; j++) {
                int SUM = 0;
                for (int l = 0; l < k[j]; l++) {
                    SUM += d[s[j][l]-1];
                }
                if (SUM % 2 == p[j]) {
                    continue;
                } else {
                    ok = false;
                    break;
                }
            }
            if (ok) ans++;
        }
        System.out.println(ans);

    }

    public static final int MOD = 1_000_000_007;
    public static int[] fact;
    public static int[] invfact;
    /**
     * preCalcFactorials() should be executed beforehand.
     * Calculate nCm modulo to global MOD.
     * @param n
     * @param m
     * @return
     */
    public static int combMod(int n, int m) {
        int ans = modProd(fact[n], invfact[n-m]);
        ans = modProd(ans, invfact[m]);
        return ans;
    }
    /**
     * Calculate a product of 2 integers modulo to mod
     * @param x
     * @param y
     * @param mod modulo
     * @return
     */
    public static int modProd(int x, int y) {
        long ans = ((long) x) * ((long) y); //prevent overflow
        ans %= MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }
    /**
     * Calculate a power of integer modulo to mod
     * @param x
     * @param pow
     * @param mod
     * @return
     */
    public static int modPow(int x, int pow) {
        if (pow == 0) return 1;
        int y = modProd(x,x);
        int ans; 
        if (pow % 2 == 1) {
            ans = x;
        } else {
            ans = 1;
        }
        ans = modProd(ans, modPow(y, pow/2));
        return ans;
    }
    /**
     * Calculate a inverse of an integer modulo to mod, using Fermat's Theorem.
     * Assuming mod is a prime number.
     * @param x
     * @param mod
     * @return
     */
    public static int invMod(int x) {
        return modPow(x, MOD - 2);
    }

    /**
     * x / y modulo MOD global
     * @param x
     * @param y
     * @return
     */
    public static int modDivide(int x, int y) {
        return modProd(x, invMod(y));
    }



}