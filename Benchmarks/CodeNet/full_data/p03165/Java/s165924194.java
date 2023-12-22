import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int m = S.length(), n = T.length();

        int[][] DP = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
                }
            }
        }

        int counter = DP[m][n];

        char[] LCS = new char[counter + 1];
        LCS[counter] = ' ';

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (S.charAt(i - 1) == T.charAt(j - 1)) {
                LCS[counter - 1] = S.charAt(i - 1);
                i--;
                j--;
                counter--;
            } else if (DP[i - 1][j] > DP[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        for (int k = 0; k < DP[m][n]; k++) {
            System.out.print(LCS[k]);
        }
    }

}