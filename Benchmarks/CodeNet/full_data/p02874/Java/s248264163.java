import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        In[] in = new In[N];
        
        for (int i = 0; i < N; i++) {
            in[i] = new In(nint(), nint());
        }
        Arrays.sort(in, (a, b) -> Integer.compare(a.l, b.l));
        
        int[] sum1 = new int[N];
        int l1 = in[0].l;
        int r1 = in[0].r;
        sum1[0] = r1 - l1 + 1;
        for (int i = 1; i < N; i++) {
            int li = in[i].l;
            int ri = in[i].r;
            if (ri < l1 || r1 < li)
                break;
            
            if (l1 < li)
                l1 = li;
            
            if (ri < r1)
                r1 = ri;
            
            sum1[i] = r1 - l1 + 1;
        }
        
        int[] sum2 = new int[N];
        int l2 = in[N-1].l;
        int r2 = in[N-1].r;
        sum2[N-1] = r2 - l2 + 1;
        for (int i = N-2; i >= 0; i--) {
            int li = in[i].l;
            int ri = in[i].r;
            if (ri < l2 || r2 < li)
                break;
            
            if (l2 < li)
                l2 = li;
            
            if (ri < r2)
                r2 = ri;
            
            sum2[i] = r2 - l2 + 1;
        }
        
        long ans = 0;
        for (int i = 0; i < N-1; i++) {
            ans = Math.max(sum1[i] + sum2[i+1], ans);
        }

        Arrays.sort(in, (a, b) -> Integer.compare(b.r, a.r));
        int[] sum4 = new int[N];
        int l4 = in[0].l;
        int r4 = in[0].r;
        sum4[0] = r4 - l4 + 1;
        for (int i = 1; i < N; i++) {
            int li = in[i].l;
            int ri = in[i].r;
            if (ri < l4 || r4 < li)
                break;
            
            if (l4 < li)
                l4 = li;
            
            if (ri < r4)
                r4 = ri;
            
            sum4[i] = r4 - l4 + 1;
        }
        
        int[] sum3 = new int[N];
        int l3 = in[N-1].l;
        int r3 = in[N-1].r;
        sum3[N-1] = r3 - l3 + 1;
        for (int i = N-2; i >= 0; i--) {
            int li = in[i].l;
            int ri = in[i].r;
            if (ri < l3 || r3 < li)
                break;
            
            if (l3 < li)
                l3 = li;
            
            if (ri < r3)
                r3 = ri;
            
            sum3[i] = r3 - l3 + 1;
        }

        for (int i = 0; i < N-1; i++) {
            ans = Math.max(sum3[i] + sum4[i+1], ans);
        }

        System.out.println(ans);
    }
    static class In {
        int l;
        int r;
        In(int l, int r) {
            this.l = l;
            this.r = r;
        }
        int diff() {return r - l;};
        @Override
        public String toString() {
            return "(" + l + ", " + r + ")";
        }
    }
    
    public static long sum(int[] L, int[] R, int exceptIdx) {
        int l = 0;
        int r = (int) 1E9 + 1;
        
        for (int i = 0; i < L.length; i++) {
            if (i == exceptIdx)
                continue;
            
            if (R[i] < l || r < L[i])
                return 0;
            
            if (l < L[i])
                l = L[i];
            
            if (R[i] < r)
                r = R[i];
        }
        return r - l + 1;
    }
    
    private static long sumN(int n) {
        return (long) n * (n+1) / 2;
    }
    
    private static int nint() {
        return sc.nextInt();
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

    private static long nlong() {
        return sc.nextLong();
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

    private static double ndouble() {
        return sc.nextDouble();
    }

    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }

    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }

    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }

    private static int min(int... is) {
        return Arrays.stream(is).min().getAsInt();
    }

    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }

    private static int max(int... is) {
        return Arrays.stream(is).max().getAsInt();
    }

    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
