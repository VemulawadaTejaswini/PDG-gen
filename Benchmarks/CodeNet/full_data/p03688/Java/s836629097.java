import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Pavel Mavrin
 */
public class Main {

    private void solve() throws IOException {
        int n = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == min) x++;
        }
        if (max - min > 1) {
            out.println("No");
            return;
        }
        if (max == min) {
            if (max == n - 1 || max <= n / 2) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        } else {
            if (max >= x + 1 && max <= x + (n - x) / 2) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }

    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        solve();
        out.close();
    }

}
