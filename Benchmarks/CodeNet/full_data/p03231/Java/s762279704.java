import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        long lcm = lcm(n, m);
        
        int dn = (int) (lcm / m);
        int dm = (int) (lcm / n);
        for (long i = 0; i < lcm; i++) {
            if (i % dn == 0 && i % dm == 0) {
                if (s.charAt((int) (i / dm)) != t.charAt((int) (i / dn))) {
                    so.println(-1);
                    return;
                }
            }
        }
        so.println(lcm);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        
        return gcd(n, m % n);
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}
