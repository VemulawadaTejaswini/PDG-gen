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
        int x = 0;
        int y = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            int tt = nextInt();
            int xx = nextInt();
            int yy = nextInt();
            int d = Math.abs(x - xx) + Math.abs(y - yy);
            if (tt < t + d || (xx + yy) % 2 != tt % 2) {
                out.println("No");
                return;
            }
            x = xx;
            y = yy;
            t = tt;
        }
        out.println("Yes");
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
