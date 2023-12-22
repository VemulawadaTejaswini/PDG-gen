import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        char BLACK = '#';
        char WHITE = '.';
        int N = ni();
        char[] c = ns().toCharArray();
        
        int left = N;
        
        for (int i = 0; i < N; i++) {
            if (c[i] == BLACK) {
                left = i;
                break;
            }
        }
        
        int numB = 0;
        int numW = 0;
        
        for (int i = left; i < N; i++) {
            if (c[i] == BLACK)
                numB++;
            else
                numW++;
        }
        
        so.println(Math.min(numB, numW));
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
