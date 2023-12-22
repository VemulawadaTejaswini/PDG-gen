
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //solve_147_C();
        solve_147_D();
        return;
    }

    private static void solve_147_D() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] Ai = new long[N + 1];
        long[] Aj = new long[N + 1];
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            Ai[i] = sc.nextLong();
            Aj[i] = Ai[i];
        }
        for (int i = 1; i <= N; i++) {
            if(( i+1)>N ) continue;
            for (int j = i+1; j <= N; j++) {
                sum += (Ai[i] ^ Aj[j]);
            }
        }

        long surp = sum % ((1000000000)+7);
        System.out.println(surp);
        return;
    }

    private static void solve_147_C() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[20];
        int[][] x = new int[20][20];
        int[][] y = new int[20][20];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            for (int j = 1; j <= A[i]; j++) {
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int bits = 1; bits < (1 << N); bits++) {
            boolean ok = true;
            for (int i = 1; i <= N; i++) {
                if ((bits & (1 << (i - 1))) == 0) continue;
                for (int j = 1; j <= A[i]; j++) {
                    if ((((bits >> (x[i][j] - 1)) & 1) ^ y[i][j]) == 1) ok = false;
                }
            }
            if (ok) ans = Math.max(ans, counter(bits));
        }
        System.out.println(ans);
        return;
    }

    private static int counter(int x) {
        if (x == 0) return 0;
        return counter(x >> 1) + (x & 1);
    }
}