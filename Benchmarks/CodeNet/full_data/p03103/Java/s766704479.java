import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), m = in.ni();
            Store[] stores = new Store[n];
            for (int i = 0; i < n; i++) {
                stores[i] = new Store(in.ni(), in.ni());
            }
            Arrays.sort(stores, Comparator.comparingLong(o -> o.price));
            long ans = 0;
            for (Store store : stores) {
                if (store.cnt < m) {
                    ans += store.cnt * store.price;
                    m -= store.cnt;
                } else {
                    ans += m * store.price;
                    m = 0;
                    break;
                }
            }
            if (m > 0)
                throw new RuntimeException("not enough minerals");
            out.println(ans);

        }

        class Store {
            long cnt;
            long price;

            public Store(int price, int cnt) {
                this.cnt = cnt;
                this.price = price;
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

