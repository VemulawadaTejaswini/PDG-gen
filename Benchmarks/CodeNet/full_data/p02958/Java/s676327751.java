import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++)
            p[i] = in.nextInt();

        int[] sorted = p.clone();
        Arrays.sort(sorted);

        boolean flag = false;
        if (equals(p, sorted)) {
            out.println("YES");
            return;
        }

        search:
        for (int i=0; i < n-1; i++) {
            for (int j=i+1; j < n; j++) {
                int[] swapped = swap(p.clone(), i, j);
                if (equals(swapped, sorted)) {
                    flag = true;
                    break search;
                }
            }
        }

        out.println(flag ? "YES" : "NO");
    }

    private static int[] swap(int[] p, int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
        return p;
    }

    private static boolean equals(int[] a, int[] b) {
        for (int i1 = 0; i1 < a.length; i1++) {
            if (b[i1] != a[i1])
                return false;
        }
        return true;
    }

}
