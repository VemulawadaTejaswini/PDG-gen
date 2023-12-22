import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int N = ni();
        int L = ni();
        int minI = -1;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            int a = L+i-1;
            if (Math.abs(a) < minAbs) {
                minI = i;
                minAbs = Math.abs(a);
            }
        }
        
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i == minI) continue;
            ans += L+i-1;
        }
        so.println(ans);
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }
}
