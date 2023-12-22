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
import java.util.Comparator;
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
            List<B.Robot> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int X = in.nextInt();
                int L = in.nextInt();
                int d = Math.max(0, X - L);
                L += X - d;
                X = d;
                list.add(new B.Robot(X, L));
            }
            list.sort(Comparator.naturalOrder());

            List<B.Robot> ans = new ArrayList<>();
            B.Robot temp = list.get(0);
            ans.add(temp);
            for (int i = 1; i < N; i++) {
                B.Robot robot = list.get(i);

                int l = 0, r = ans.size();
                while (l + 1 < r) {
                    int index = (l + r) / 2;
                    temp = ans.get(index);
                    if (temp.x >= robot.x) {
                        r = index;
                    } else {
                        l = index;
                    }
                }
                temp = ans.get(l);
                if (temp.x <= robot.x && robot.x < temp.x + temp.l) {
                    continue;
                }
                if (l + 1 < ans.size() && robot.x + robot.l >= ans.get(l + 1).x) {
                    continue;
                }
                ans.add(robot);
            }
            out.println(ans.size());
        }

        static class Robot implements Comparable<B.Robot> {
            int x;
            int l;

            Robot(int x, int l) {
                this.x = x;
                this.l = l;
            }

            public int compareTo(B.Robot o) {
                int comp;
                comp = Integer.compare(l, o.l);
                if (comp == 0) {
                    comp = Integer.compare(x, o.x);
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

