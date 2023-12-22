import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
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
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DCake123 solver = new DCake123();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCake123 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int k = in.nextInt();
            List<Long> a = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                a.add(in.nextLong());
            }
            List<Long> b = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                b.add(in.nextLong());
            }
            List<Long> c = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                c.add(in.nextLong());
            }
            List<Long> bc = new ArrayList<>();
            for (long clong : c) {
                for (long blong : b) {
                    bc.add(clong + blong);
                }
            }
            Collections.sort(bc);
            List<Long> fin = new ArrayList<>();
            for (long along : a) {
                for (int i = 0; i < Math.min(3000, bc.size()); i++) {
                    fin.add(along + bc.get(i));
                }
            }
            Collections.sort(fin);
            for (int i = 0; i < k; i++) {
                out.println(fin.get(fin.size() - i - 1));
            }
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

