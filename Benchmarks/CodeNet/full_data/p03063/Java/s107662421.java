import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        char BLACK = '#';
        char WHITE = '.';
        int N = ni();
        char[] c = ns().toCharArray();
        
        int[] count = new int[N+1];
        
        // all while
        for (int i = 0; i < N; i++) {
            if (c[i] == BLACK)
                count[N]++;
        }
        
        for (int i = N-1; i >= 0; i--) {
            if (c[i] == BLACK) {
                count[i] = count[i+1] - 1;
            } else {
                count[i] = count[i+1] + 1;
            }
        }
        
        so.println(IntStream.of(count).min().getAsInt());
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
