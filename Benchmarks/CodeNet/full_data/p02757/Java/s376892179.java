import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            long P = in.nextInt();
            String S = in.next();
            List<String> col = new ArrayList<>();
            gen(S, col);
//        System.err.println(col.stream().collect(Collectors.joining(" ")));
            int cnt = 0;
            BigInteger p = BigInteger.valueOf(P);
            for (String s : col) {
                BigInteger n = new BigInteger(s);
                if (n.mod(p).equals(BigInteger.ZERO)) {
                    cnt++;
                }
            }
            out.println(cnt);
        }

        private List<String> gen(String s, List<String> col) {
            if (s.length() == 1) {
                List<String> ret = new ArrayList<>();
                ret.add(s);
                col.add(s);
                return ret;
            }
            String s1 = s.substring(0, 1);
            String s2 = s.substring(1);
            List<String> set = gen(s2, col);
            List<String> set2 = new ArrayList<>();
            for (String ss : set) {
                set2.add(s1 + ss);
            }
            set2.add(s1);
            col.addAll(set2);
            return set2;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

