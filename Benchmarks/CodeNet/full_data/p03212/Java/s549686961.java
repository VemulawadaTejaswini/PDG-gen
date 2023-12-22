import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        static int n;
        static int ans;

        static void dfs(int now, long act) {
            long a = act * 10 + now;
            String s = String.valueOf(a);
            boolean b3 = false, b5 = false, b7 = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '3') {
                    b3 = true;
                } else if (s.charAt(i) == '5') {
                    b5 = true;
                } else if (s.charAt(i) == '7') {
                    b7 = true;
                }
            }
            if (b3 && b5 && b7 && a <= n) {
                ans++;
            }
            if (a <= n) {
                dfs(3, a);
                dfs(5, a);
                dfs(7, a);
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            n = sc.nextInt();
            ans = 0;
            dfs(3, 0);
            dfs(5, 0);
            dfs(7, 0);
            out.println(ans);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

