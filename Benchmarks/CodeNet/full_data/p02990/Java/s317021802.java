import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    static final int M = (int) 1E9 + 7;
    static long[][] com;
    
    public static void main(String[] args) {
        com = calcCom(2000);
        
        int N = nint();
        int K = nint();
        int s = N-K+1;
        
        for (int i = 1; i <= K; i++) {
            long a = com[s][i];
            long b = com[K-1][i-1];
            so.println(((a%M) * (b%M)) % M);
        }
    }
    
    public static long[][] calcCom(int size) {
        long[][] com = new long[size+1][size+1];
        com[0][0] = 1;
        for (int i = 1; i <= size; i++) {
            com[i][0] = 1;
            for (int j = 1; j <= size; j++) {
                com[i][j] = (com[i-1][j-1] + com[i-1][j]) % M;
            }
        }
        return com;
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
