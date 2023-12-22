import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        CAverageLength solver = new CAverageLength();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAverageLength {
        public double a[][];
        public double ans;
        public double distance[][];

        private void permute(String str, int l, int r) {
            if (l == r)
                ans += calc(str);
            else {
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    permute(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }

        public String swap(String a, int i, int j) {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }

        public double calc(String x) {
            double dista = 0;
//        System.out.print(x);
            for (int i = 0; i < x.length() - 1; i++) {
                dista += distance[Character.getNumericValue(x.charAt(i))][Character.getNumericValue(x.charAt(i + 1))];
            }
            return dista;
        }

        public double dist(int i, int j) {
            double dist = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + ((a[i][1] - a[j][1])) * (a[i][1] - a[j][1]));
            return dist;
        }

        public long fact(long n) {
            long ans = 1;
            for (int i = 1; i <= n; i++) ans *= i;
            return ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            a = new double[n][n];
            distance = new double[n][n];
            for (int i = 0; i < n; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    double l = dist(i, j);
                    distance[i][j] = l;
                    distance[j][i] = l;
                }
            }
            StringBuilder p = new StringBuilder("");
            for (int i = 0; i < n; i++) p.append(Integer.toString(i));
            permute(p.toString(), 0, n - 1);

            out.println(ans / fact(n));


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

