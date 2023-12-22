import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    public static void main(String[] args) {
        int N = nint();
        int M = nint();
        List<Integer> ds = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(M); i++) {
            if (M % i == 0) {
                ds.add(i);
                ds.add(M/i);
            }
        }
        ds.sort((i1, i2) -> i1 - i2);
        
        for (int d: ds) {
            if (d >= N) {
                so.println(M / d);
                return;
            }
        }
        throw new RuntimeException();
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }
    
    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }
    
    private static String[] nstrs(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = nstr();
        return a;
    }
    
    private static char[][] nchars2D(int h, int w) {
        return nchars2D(h, w, 0);
    }
    
    private static char[][] nchars2D(int h, int w, int pad) {
        char[][] a2 = new char[h+pad*2][w+pad*2];
        for(int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad+i], pad, w);
        return a2;
    }
}
