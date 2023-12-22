import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import library.search.LowerBound;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int     MOD = (int) 1E9 + 7;
    
    public static void main(String[] args) {
        int N = nint();
        int[] L = nints(N);
        Arrays.sort(L);
        Set<T3> set = new HashSet<>();
        
        int ans = 0;
        
        for (int i = N-1; i >= 2; i--) {
            for (int j = i-1; j >= 1; j--) {
                if (L[i] >= L[j] + L[j-1]) {
                    continue;
                }
                
                for (int k = j-1; k >= 0; k--) {
                    if (L[i] >= L[j] + L[k]) {
                        break;
                    }
                    T3 t = new T3(L[i], L[j], L[k]);
                    if (!set.contains(t)) {
                        set.add(t);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
    static class T3 {
        int a;
        int b;
        int c;
        
        public T3(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + a;
            result = prime * result + b;
            result = prime * result + c;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            T3 that = (T3) obj;
            return this.a == that.a && this.b == that.b && this.c == that.c;
        }
        
        @Override
        public String toString() {
            return "(" + a + ", " + b + ", " + c + ")";
        }
    }
    
    public static int upperBound(int[] a, int obj) {
        Integer[] a2 = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            a2[i] = a[i];
        }
        return ~Arrays.binarySearch(a2, obj, (x,y)->x.compareTo(y)>0?1:-1);
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
