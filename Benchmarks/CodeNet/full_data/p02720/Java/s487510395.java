import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        long next(long act) {
            StringBuilder s = new StringBuilder(String.valueOf(act));
            for (int i = s.length() - 1; i > 0; i--) {
                if (s.charAt(i) <= s.charAt(i - 1) && s.charAt(i) < '9') {
                    int a = (s.charAt(i) - '0') + 1;
                    s.setCharAt(i, (char) (a + '0'));
                    for (int j = i + 1; j < s.length(); j++) {
                        a--;
                        s.setCharAt(j, (char) (Math.max(0, a) + '0'));
                    }
                    return Long.valueOf(s.toString());
                }
            }
            if (s.charAt(0) == '9') {
                return act + 1;
            } else {
                StringBuilder ret = new StringBuilder();
                int a = (s.charAt(0) - '0') + 1;
                ret.append(a);
                for (int j = 1; j < s.length(); j++) {
                    a--;
                    ret.append((char) (Math.max(a, 0) + '0'));
                }
                return Long.valueOf(ret.toString());
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int k = sc.nextInt();
            long ans = 1;
            for (int i = 1; i < k; i++) {
                ans = next(ans);
            }
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

