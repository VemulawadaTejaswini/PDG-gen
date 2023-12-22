import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        CGeTAC solver = new CGeTAC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGeTAC {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.nextLine();
            TreeSet<CGeTAC.Pair> set = new TreeSet<>(new Comparator<CGeTAC.Pair>() {

                public int compare(CGeTAC.Pair a, CGeTAC.Pair b) {
                    return Integer.compare(a.x, b.x);
                }
            });
            int cnt = 1;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                    set.add(new CGeTAC.Pair(i, cnt));
                    cnt++;
                }
            }
            int l, r;
            CGeTAC.Pair x, y;
            for (int i = 0; i < q; i++) {
                l = sc.nextInt() - 1;
                r = sc.nextInt() - 1;
                x = set.lower(new CGeTAC.Pair(r, 0));
                y = set.lower(new CGeTAC.Pair(l, 0));
                if (x == null) {
                    out.println(0);
                } else if (y == null) {
                    out.println(x.y);
                } else {
                    out.println(x.y - y.y);
                }
            }
        }

        static class Pair {
            int x;
            int y;

            Pair(int a, int b) {
                x = a;
                y = b;
            }

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

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

