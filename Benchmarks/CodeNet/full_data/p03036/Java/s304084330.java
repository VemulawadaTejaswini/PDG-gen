import java.io.PrintStream;
import java.util.Scanner;


public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    
    public static void main(String[] args) {
        long r = ni();
        long D = ni();
        long x = ni();
        
        for (int i = 0; i < 10; i++) {
            x = r*x - D;
            so.println(x);
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

    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static int[] nints(int n, int padding) {
        int[] a = new int[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
