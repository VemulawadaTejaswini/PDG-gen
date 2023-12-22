import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        long a = nl();
        long b = nl();
        int c = ni();
        int d = ni();
        long lcm = lcm(c, d);
        long countC = b/c - (a-1)/c;
        long countD = b/d - (a-1)/d;
        long countLcm = b/lcm - (a-1)/lcm;
        long countCOrD = countC + countD - countLcm;
        
        so.println((b-a+1) - (countCOrD));
    }
    
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    static long lcm(int m, int n) {
        return (long) m * (long) n / gcd(m, n);
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
