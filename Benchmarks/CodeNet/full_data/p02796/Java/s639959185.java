import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] X = new int[N];
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
                L[i] = in.nextInt();
                int d = Math.max(0, X[i] - L[i]);
                L[i] += X[i] - d;
                X[i] = d;
            }

            int ans = 0;
            for (int i = 0; i < N; i++) {
                List<B.Point> list = new ArrayList<>();
                list.add(new B.Point(X[i], L[i]));
                ans = Math.max(ans, calc(list, i, X, L));
            }
            out.println(ans);
        }

        private int calc(List<B.Point> list, int idx, int[] X, int[] L) {
            int ans = list.size();
            int N = X.length;
            for (int i = idx + 1; i < N; i++) {
                int x = X[i];
                int l = L[i];

                int li = 0, ri = list.size();
                while (li + 1 < ri) {
                    int index = (li + ri) / 2;
                    B.Point p = list.get(index);
                    if (p.x == x) {
                        // exist
                        li = -1;
                        break;
                    }
                    if (p.x >= x) {
                        ri = index;
                    } else {
                        li = index;
                    }
                }
                if (li == -1) {
                    continue;
                }
                B.Point p = list.get(li);
                if (p.x <= x && x < p.x + p.l) {
                    continue;
                }
                List<B.Point> tempList = new ArrayList<>(list);
                tempList.add(new B.Point(x, l));
                ans = Math.max(ans, calc(tempList, i, X, L));
            }
            return ans;
        }

        static class Point implements Comparable<B.Point> {
            int x;
            int l;

            Point(int x, int l) {
                this.x = x;
                this.l = l;
            }

            public int compareTo(B.Point o) {
                int comp = Integer.compare(x, o.x);
                if (comp == 0) {
                    comp = Integer.compare(l, o.l);
                }
                return comp;
            }

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

