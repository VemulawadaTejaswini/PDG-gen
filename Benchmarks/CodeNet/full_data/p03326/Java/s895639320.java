import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        long[] z = new long[n+1];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        long ans = 0L;
        for (int i = 0; i < 8; i++) {
            long xs = (i & 1) == 1 ? 1L : -1L;
            long ys = (i >>1& 1) == 1 ? 1L : -1L;
            long zs = (i >>2& 1) == 1 ? 1L : -1L;
            long t = 0L;
            long[] s = new long[n+1];
            s[0] = Long.MIN_VALUE;
            for (int j = 1; j <= n; j++) {
                s[j] = x[j]*xs + y[j]*ys + z[j]*zs;
            }
            Arrays.sort(s);
            for (int j = 0; j < m; j++) {
                t += s[n-j];
            }
            if(ans < t) ans = t;
        }
        System.out.println(ans);
        sc.close();

    }

}
