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
import java.io.FileReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Li Hong Sheng Gabriel
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIslandsWar solver = new DIslandsWar();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIslandsWar {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            List<DIslandsWar.Point> arr = new ArrayList<>(m);

            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                arr.add(new DIslandsWar.Point(a, b));
            }

            arr.add(new DIslandsWar.Point((int) 1e9, (int) 2e9));

            Collections.sort(arr);

            int ans = 0;
//        out.println(arr);
            for (int i = 1, lo = arr.get(0).x, hi = arr.get(0).y; i < arr.size(); i++) {
                DIslandsWar.Point cur = arr.get(i);
                if (cur.x >= hi) {
                    ans++;
                    lo = cur.x;
                    hi = cur.y;
                } else {
                    lo = cur.x;
                    hi = Math.min(hi, cur.y);
                }
//            out.println("the current bounds are " + lo + " " + hi);
            }
            out.println(ans);
        }

        static class Point implements Comparable<DIslandsWar.Point> {
            int x;
            int y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(DIslandsWar.Point other) {
                if (x > other.x) {
                    return 1;
                } else if (x < other.x) {
                    return -1;
                } else if (y > other.y) {
                    return 1;
                } else if (y < other.y) {
                    return -1;
                }
                return 0;
            }


            public String toString() {
                return new String("(" + x + "," + y + ")");
            }

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public FastReader(String name) throws IOException {
            br = new BufferedReader(new FileReader(name));
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

