import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int[][] A = new int[N][N-1];
                
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                A[i][j] = nint()-1;
            }
        }
        
        int[] idx = new int[N];
        int count = 0;
        
        while (true) {
            boolean[] used = new boolean[N];
            boolean breaks = true;
            for (int n = 0; n < N; n++) {
                if (idx[n] >= N-1) continue;
                if (used[n]) continue;
                
                int o = A[n][idx[n]];
                if (used[o]) continue;
                
                int o2 = A[o][idx[o]];
                if (n == o2) {
                    breaks = false;
                    idx[n]++;
                    idx[o]++;
                    used[n] = true;
                    used[o] = true;
                }
            }
            if (breaks) break;
            count++;
            
            boolean finished = true;
            for (int i = 0; i < N; i++) {
                if (idx[i] != N-1) {
                    finished = false;
                }
            }
            if (finished) {
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
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
