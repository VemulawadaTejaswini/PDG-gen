import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            LinkedList<Integer> b = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                b.addLast(in.ni());
            }
            LinkedList<Integer> ans = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int ind = b.size();
                ListIterator<Integer> it = b.listIterator(ind);
                while (it.hasPrevious()) {
                    Integer num = it.previous();
                    if (num == ind) {
                        ans.addFirst(num);
                        it.remove();
                        break;
                    }
                    ind--;
                }
                if (ind == 0 && b.size() != 0) {
                    out.println(-1);
                    return;
                }
            }
            for (Integer num : ans) {
                out.println(num);
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

