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
        String s = next();
        z = true;
        out.println(solve(s));
//        Random random = new Random();
//        while (true) {
//            String s = "" + Math.abs(random.nextLong()) + Math.abs(random.nextLong()) + Math.abs(random.nextLong());
//            System.out.println(s);
//            z = false;
//            int s1 = solve(s);
//            z = true;
//            int s2 = solve(s);
//            if (s1 != s2) {
//                System.out.println(s + " " + s1 + " " + s2);
//                return;
//            }
//        }
    }

    private int solve(String s) {
        long l = 0;
        long r = 1;
        while (!can(s, r)) r *= 2;
        while (r > l + 1) {
            long m = (l + r) / 2;
            if (can(s, m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return (int) r;
    }

    boolean z = false;

    private boolean can(String s, long q) {
        q *= 9;
        long ss = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            // d - (q / 10) + 10 * k <= q
            // k <= (q - d + (q / 10)) / 10
            long max = q;
            if (z) {
                if (i < 18) {
                    max = Math.min(max, Long.parseLong(s.substring(0, i + 1)) - ss);
                }
            }
            if (max - d + ss < 0) return false;
            long k = (max - d + ss) / 10;
            long qq = d + k * 10 - ss;
            if (qq > max) throw new RuntimeException();
            q = qq;
            ss = q / 10;
        }
        return true;
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
