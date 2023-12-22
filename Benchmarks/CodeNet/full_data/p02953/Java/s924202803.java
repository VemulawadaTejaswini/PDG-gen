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
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i=0; i < n; i++)
            h[i] = in.nextInt();

        int highest = h[0];
        boolean ans = true;
        for (int i=1; i < n; i++) {
            if (highest-1 > h[i]) {
                ans = false;
                break;
            }
            highest = Math.max(highest, h[i]);
        }
        out.println(ans ? "Yes" : "No");
    }

}
