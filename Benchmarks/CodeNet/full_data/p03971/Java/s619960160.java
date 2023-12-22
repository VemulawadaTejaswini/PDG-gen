import java.io.*;
import java.util.*;

public class Main {

    public void solve() {
        int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        char[] c = in.nextToken().toCharArray();

        int curA = 0, curB = 0;
        int passed = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 'c') {
                out.println("No");
                continue;
            }
            if (c[i] == 'a') {
                if (passed < a + b) {
                    passed++;
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else {
                curB++;
                if (passed < a + b && curB <= b) {
                    passed++;
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }
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
