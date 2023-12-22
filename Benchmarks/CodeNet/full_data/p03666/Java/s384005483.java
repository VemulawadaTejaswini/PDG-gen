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
        long a = nextInt();
        long b = nextInt();
        long c = nextInt();
        long d = nextInt();
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            long max = Math.min(a + d * i, b + d * j);
            long min = Math.max(a + c * i, b + c * j);
            if (max >= min) {
                out.println("YES");
                return;
            }
        }
        out.println("NO");
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
