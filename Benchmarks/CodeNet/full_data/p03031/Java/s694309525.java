import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int n = ni();
        int m = ni();
        int[][] s = new int[m+1][];
        s[0] = new int[0];
        
        for (int i = 1; i <= m; i++) {
            int k = ni();
            s[i] = new int[k+1];
            for (int j = 1; j <= k; j++)
                s[i][j] = ni();
        }
        
        int[] p = new int[m+1];
        for (int i = 1; i <= m; i++)
            p[i] = ni();
        
        
        int count = 0;
        for (int i = 0; i < Math.pow(2, n); i++)
            if (allOn(n, m, i, s, p))
                count++;
        
        so.println(count);
    }
    
    private static boolean allOn(int n, int m, int bits, int[][] s, int[] p) {
        for (int i = 1; i <= m; i++) {
            if (!on(n, bits, s[i], p[i]))
                return false;
        }
        return true;
    }
    
    private static boolean on(int n, int bits, int[] si, int pi) {
        int switchCount = 0;
        for (int i = 1; i < si.length; i++) {
            if (bitStands(bits, si[i])) {
                switchCount++;
            }
        }
        
        return switchCount % 2 == pi;
    }
    
    public static boolean bitStands(int bits, int digit) {
        return ((bits >> (digit-1)) & 1) == 1;
    }

    static class R implements Comparable<R>{
        String s;
        int p;
        int num;
        
        public R(String s, int p, int num) {
            this.s = s;
            this.p = p;
            this.num = num;
        }
        @Override
        public int compareTo(R that) {
            if (this.s.equals(that.s)) {
                return that.p - this.p;
            }
            return (this.s).compareTo(that.s);
        }
        
        @Override
        public String toString() {
            return this.num + " " + this.s + " " + this.p;
        }
    }

    
    private static int ni() {
        return sc.nextInt();
    }

    private static long nl() {
        return sc.nextLong();
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

    private static long[] nlongs(int n, int padding) {
        long[] a = new long[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
