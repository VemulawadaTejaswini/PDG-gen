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
        int m = nextInt();
        int[] c = new int[26];
        for (int i = 0; i < n; i++) {
            String s = next();
            for (int j = 0; j < m; j++) {
                c[s.charAt(j) - 'a']++;
            }
        }
        int[] k = new int[4];
        for (int i = 0; i < c.length; i++) {
            k[c[i] % 4]++;
        }
        if (n % 2 == 1 && m % 2 == 1) {
            if (k[1] > 0) {
                k[1]--;
                k[0]++;
            } else if (c[3] > 0) {
                k[3]--;
                k[2]++;
            } else {
                out.println("No");
                return;
            }
        }
        int kk = 0;
        if (n % 2 == 1) {
            kk += m / 2;
        }
        if (m % 2 == 1) {
            kk += n / 2;
        }
//        System.out.println(kk + " " + Arrays.toString(k));
        for (int i = 0; i < kk; i++) {
            if (k[2] > 0) {
                k[2]--;
                k[0]++;
            } else if (c[0] > 0) {
                k[0]--;
                k[2]++;
            } else {
                out.println("No");
                return;
            }
        }
        if (k[0] != 26) {
            out.println("No");
            return;
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
