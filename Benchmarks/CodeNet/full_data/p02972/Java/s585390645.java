
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = nint();
        int[] a = nints(N, 1, 0);
        int[] ball = new int[N+1];
        int r = N; 
        int l = (r+1)/2;
        while(true) {
            for (int i_r = r; i_r >= l; i_r--) {
                ball[i_r] = a[i_r];
                update(a, ball, i_r);
            }
            r = l - 1;
            l = Math.max(r-1, 0);
            if (r <= 0) break;
        }
        
        
        int m = 0;
        for (int i = 1; i <= N; i++)
            if (ball[i] == 1)
                m++;
        
        so.println(m);
        for (int i = 1; i <= N; i++)
            if (ball[i] == 1)
                so.println(i);
            
    }
    
    private static void update(int[] a, int[] ball, int curr) {
        if (curr == 1) return;
        
        for (int i = 1; i <= Math.sqrt(curr); i++) {
            if (curr % i == 0) {
                a[i] = (a[i] + ball[curr]) % 2;
            }
        }
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

    private static char[] nsToChars() {
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

    private static char[][] nsToChars2D(int h, int w) {
        return nsToChars2D(h, w, 0);
    }

    private static char[][] nsToChars2D(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nsToChars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
