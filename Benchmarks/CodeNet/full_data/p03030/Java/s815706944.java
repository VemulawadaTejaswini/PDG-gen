import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        int n = ni();
        R[] rs = new R[n];
        for (int i = 0; i < n; i++) {
            rs[i] = new R(ns(), ni(), i+1);
        }
        Arrays.sort(rs);
        for (R r: rs) {
            so.println(r.num);
        }
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
