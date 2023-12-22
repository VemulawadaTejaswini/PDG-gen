import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Omar Yasser
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner sc, PrintWriter out) {
            int n = sc.nextInt();
            int mask = 0;
            boolean ok = false;
            int num = 0;
            while (n-- > 0) {
                int rating = sc.nextInt();
                if (rating >= 1 && rating <= 399) {
                    mask |= 1;
                } else if (rating >= 400 && rating <= 799) {
                    mask |= 2;
                } else if (rating >= 800 && rating <= 1199) {
                    mask |= 4;
                } else if (rating >= 1200 && rating <= 1599) {
                    mask |= 8;
                } else if (rating >= 1600 && rating <= 1999) {
                    mask |= 16;
                } else if (rating >= 2000 && rating <= 2399) {
                    mask |= 32;
                } else if (rating >= 2400 && rating <= 2799) {
                    mask |= 64;
                } else if (rating >= 2800 && rating <= 3199) {
                    mask |= 128;
                } else {
                    num++;
                    ok = true;
                }
            }
            int res = 0;
            for (int i = 0; i <= 7; i++)
                if ((mask & (1 << i)) != 0) res++;
            out.print(ok ? Math.max(1, res) : res);
            out.println(" " + (res + num));
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

