
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int X = nint();
        int Y = nint();
        int Z = nint();
        int K = nint();
        long[] A = nlongs(X);
        long[] B = nlongs(Y);
        long[] C = nlongs(Z);
        
        long[] a = new long[X*Y];
        int ia = 0;
        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                a[ia] = A[x] + B[y];
                ia++;
            }
        }
        rsort(a);
        
        long[] b = new long[Math.min(3000, X*Y) * Z];
        int ib = 0;
        for (int ia2 = 0; ia2 < Math.min(3000, a.length); ia2++) {
            for (int z = 0; z < Z; z++) {
                b[ib] = a[ia2] + C[z];
                ib++;
            }
        }
        rsort(b);
        
        for (int ib2 = 0; ib2 < Math.min(K, b.length); ib2++) {
            System.out.println(b[ib2]);
        }
    }
    static void rsort(long[] a) {
        Arrays.sort(a);
        int len = a.length;
        for(int i = 0; i < (len+1)/2; i++) {
            long temp = a[i];
            a[i] = a[len-i-1];
            a[len-i-1] = temp;
        }
    }
    
    static long max(long... longs) {
        return Arrays.stream(longs).max().getAsLong();
    }
    
    static long min(long... longs) {
        return Arrays.stream(longs).min().getAsLong();
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

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
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

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = sc.nextDouble();
        }
        return d;
    }

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
