import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final int MOD = 2019;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i=0; i < n-1; i++) {
            if (i % 2 == 0) {
                a[n-1] -= a[i];
            } else {
                a[n-1] += a[i];
            }
        } // Row N = (0, 0, ... , 1)

        for (int i=0; i < n-1; i++) {
            a[i] *= 2;
        }

        for (int i=n-2; i >= 0; i--) {
            a[i] -= a[i+1];
        }

        StringBuilder o = new StringBuilder();
        for (int ans : a) {
            o.append(ans).append(" ");
        }
        out.println(o.substring(0, o.length()-1));
    }
}
