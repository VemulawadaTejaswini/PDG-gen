import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        out.println(a - b >= c ? 0 : c - (a - b));
    }

}
