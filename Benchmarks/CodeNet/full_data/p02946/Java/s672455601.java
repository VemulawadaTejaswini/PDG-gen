import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int k = in.nextInt();
        int x = in.nextInt();

        int MIN = -1000000;
        int MAX = 1000000;

        for (int i=Math.max(x - k + 1, MIN); i < Math.min(x + k - 1, MAX); i++)
            out.print(i + " ");
        out.println(Math.min(x + k - 1, MAX));
    }

}
