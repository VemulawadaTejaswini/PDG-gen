import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        public int llt(ArrayList<Long> a, int l, int r, long x) {
            int temp = r;
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
            while (l >= temp) l--;
            while (l > 0 && a.get(l) >= x) l--;
            return l;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long D = in.nextInt();
            long A = in.nextInt();
            ArrayList<node> a = new ArrayList<node>();
            for (int i = 0; i < n; i++) {
                a.add(new node(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return (int) (o1.x - o2.x);
                }
            });
            long pre[] = new long[n + 1];
            ArrayList<Long> d = new ArrayList<>();
            d.add(-1L);
            int c = 0;
            c++;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long x = a.get(i).x;
                long y = a.get(i).x - 2 * D;
                int q = llt(d, 0, c, y);
                long t = pre[c - 1] - pre[q];
                a.get(i).y = a.get(i).y - t > 0 ? a.get(i).y - t : 0;
                long an = (long) Math.ceil((float) a.get(i).y / A);
                ans += an;
                pre[c] = pre[c - 1] + an * A;
                d.add(a.get(i).x);
                c++;
            }
            out.println(ans);
        }

        class node {
            long x;
            long y;

            node(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

