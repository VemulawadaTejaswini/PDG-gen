import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = ni();
        String s = ns();
        String t = ns();
        
        int i_max = 0;
        for (int i = 1; i <= N; i++)
            if (s.substring(N-i, N).equals(t.substring(0, i)))
                i_max = i;
        
        so.println(N*2 - i_max);
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static String ns() {
        return sc.next();
    }
}
