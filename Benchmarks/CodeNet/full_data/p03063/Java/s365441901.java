import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = ni();
        char[] c = ns().toCharArray();
        int count = 0;
        
        for (int i = 0; i < N-1; i++) {
           if (c[i] == '#' && c[i+1] == '.')
               count++;
        }
        
        so.println(count);
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

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    static int[] nints(int n, int padHead, int padTail) {
        int[] a = new int[padHead + n + padTail];
        for (int i = 0; i < n; i++)
            a[padHead + i] = ni();
        return a;
    }
}
