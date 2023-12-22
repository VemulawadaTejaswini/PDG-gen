import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.*;

public class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private void solve() {
        try {

            int n = sc.nextInt();
            int m = sc.nextInt();
            // long[] x = new long[n];
            // long[] y = new long[n];
            // long[] z = new long[n];
            // for (int i = 0; i < n; i++) {
            // x[i] = sc.nextLong();
            // y[i] = sc.nextLong();
            // z[i] = sc.nextLong();
            // }
            long[][] input = new long[n][3];
            for (int i = 0; i < n; i++) {
                input[i][0] = sc.nextLong();
                input[i][1] = sc.nextLong();
                input[i][2] = sc.nextLong();
            }
            Arrays.sort(input, (a, b) -> Long.compare(a[0], b[0]));
            long ans = 0;

            long sum[] = new long[n];
            long tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = input[i][0] + input[i][1] + input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = input[i][0] + input[i][1] - input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = input[i][0] - input[i][1] + input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = input[i][0] - input[i][1] - input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = -input[i][0] + input[i][1] + input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = -input[i][0] + input[i][1] - input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = -input[i][0] - input[i][1] - input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            tmp = 0;
            for (int i = 0; i < n; i++) {
                sum[i] = -input[i][0] - input[i][1] + input[i][2];
            }
            Arrays.sort(sum);
            for (int i = n - 1; i >= n - m; i--) {
                tmp += sum[i];
            }
            ans = Math.max(ans, tmp);
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
