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
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FManySlimes solver = new FManySlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class FManySlimes {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            Integer[] a = new Integer[(1 << n)];
            for (int i = 0; i < (1 << n); i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Comparator.reverseOrder());
            for (int i = 1; i <= n; i++) {
                for (int j = (1 << i) / 2; j < (1 << i); j++) {
                    if (a[j] >= a[j - (1 << i) / 2]) {
                        out.println("No");
                        return;
                    }
                }
            }
            out.println("Yes");
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

