import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        CBuyanInteger solver = new CBuyanInteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBuyanInteger {
        static int[] x;
        static int[] y;
        static int n;
        static double sum;

        static void bt(ArrayList<Integer> p, int a, int b, int o, double now) {
            ArrayList<Integer> act = new ArrayList<>(p);
            if (o == -1) {
                for (int i = 0; i < act.size(); i++) {
                    bt(act, x[i], y[i], i, 0);
                }
                return;
            }
            if (o >= 0) {
                act.remove(o);
            }
            if (act.size() == 0) {
                sum += now;
                return;
            }
            for (int i = 0; i < act.size(); i++) {
                double t = Math.sqrt((x[act.get(i)] - a) * (x[act.get(i)] - a) + (y[act.get(i)] - b) * (y[act.get(i)] - b));
                bt(act, x[act.get(i)], y[act.get(i)], i, now + t);
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            n = sc.nextInt();
            x = new int[n];
            y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            ArrayList<Integer> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                p.add(i);
            }
            bt(p, 0, 0, -1, 0);
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            out.println(sum / fact);

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

    }
}

