import java.io.*;
import java.util.*;

public class Main {

    public void solve() {
        char[] c = in.nextToken().toCharArray();
        int k = in.nextInt();

        for (int i = 0; i < c.length; i++) {
            int code = c[i] - 'a';
            if (26 - code <= k) {
                k -= 26 - code;

                c[i] = 'a';
            }
        }
        int last  = (c[c.length - 1] - 'a' + k) % 26;
        c[c.length - 1] = (char) ('a' + last);
        out.println(new String(c));
    }

    public void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    FastScanner in;
    PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
