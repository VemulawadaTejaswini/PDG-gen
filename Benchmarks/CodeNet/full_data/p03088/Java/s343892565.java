
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    int n;
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private boolean ng (int a, int b, int c) {
        return (a == 1 && b == 2 && c == 3);
    }

    private void solve() {
        try {
            long seven = (long) Math.pow(10, 9) + 7;
            n = sc.nextInt();
            long ans = 0;
            long[][][][] dp = new long[n+1][4][4][4];

            dp[0][0][0][0] = 1;

            for (int i = 0; i < n; i++) {
                for (int a = 0; a < 4; a++) {
                    for (int b = 0; b < 4; b++) {
                        for (int c = 0; c < 4; c++) {
                            for (int d = 0; d < 4; d++) {
                                if(ng(b, c, d) || ng(c, b, d) || ng(b, d, c))
                                    continue;
                                if(ng(a, c, d) || ng(a, b, d))
                                    continue;
                                dp[i+1][b][c][d] += dp[i][a][b][c];
                                dp[i+1][b][c][d] %= seven;
                            }
                        }
                    }
                }
            }

            for(int a=0; a<4; a++)
                for(int b=0; b<4; b++)
                    for(int c=0; c<4; c++)
                        ans = (ans + dp[n][a][b][c]) % seven;

            System.out.println(ans);

        } catch (Exception e) {
            e.printStackTrace();
        }
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
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
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
}