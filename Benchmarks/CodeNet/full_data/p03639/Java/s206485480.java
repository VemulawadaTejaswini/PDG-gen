import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = ni();
        int c4 = 0;
        int c2 = 0;
        int c0 = 0;
        for (int i = 0; i < N; i++) {
            int a = ni();
            if (a % 4 == 0)
                c4++;
            else if (a % 2 == 0)
                c2++;
            else
                c0++;
        }
        if (c2 > 0) {
            so.println(c0 <= c4 ? "YES" : "NO");
        } else {
            so.println(c0 <= c4 + 1 ? "YES" : "NO");
        }
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
