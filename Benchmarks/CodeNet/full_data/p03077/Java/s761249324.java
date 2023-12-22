import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    static final int INF = Integer.MAX_VALUE;

    static int[] mh = {0, 1, 0, -1};
    static int[] mw = {1, 0, -1, 0};
    
    public static void main(String[] args) {
        long N = nl();
        long[] p = new long[5];
        for (int i = 0; i < 5; i++) {
            p[i] = nl();
        }
        
        long min = LongStream.of(p).min().getAsLong();
        so.println(5L + N/min);
    } 

    static int ni() {
        return sc.nextInt();
    }
    
    static long nl() {
        return sc.nextLong();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }
}
