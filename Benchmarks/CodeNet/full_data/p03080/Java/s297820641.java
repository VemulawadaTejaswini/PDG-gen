
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int n = ni();
        char[] a = ns().toCharArray();
        int r = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 'R') r++;
            else b++;
        }
        so.println(r > b ? "Yes" : "No");
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] nints(int n) {
        return nints(n, 0);
    }

    static int[] nints(int n, int padding) {
        int[] a = new int[padding + n];
        for (int i = 0; i < n; i++)
            a[padding + i] = ni();
        return a;
    }
}
