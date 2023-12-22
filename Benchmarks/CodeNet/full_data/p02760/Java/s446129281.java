import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Bingo {
        private int[][] a;

        Bingo(int[][] a) {
            this.a = a;
        }

        private void test(int num) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == num) {
                        a[i][j] = -1;
                    }
                }
            }
        }

        private boolean isBingo() {
            // row
            for (int i = 0; i < 3; i++) {
                if (isRowBingo(i)) {
                    return true;
                }
            }
            // col
            for (int j = 0; j < 3; j++) {
                if (isColumnBing(j)) {
                    return true;
                }
            }
            return isCrossBingo() || isCrossBingo2();
        }

        private boolean isRowBingo(int row) {
            for (int j = 0; j < 3; j++) {
                if (a[row][j] != -1) {
                    return false;
                }
            }
            return true;
        }

        private boolean isColumnBing(int col) {
            for (int i = 0; i < 3; i++) {
                if (a[i][col] != -1) {
                    return false;
                }
            }
            return true;
        }

        private boolean isCrossBingo() {
            for (int i = 0; i < 3; i++) {
                if (a[i][i] != -1) {
                    return false;
                }
            }
            return true;
        }

        private boolean isCrossBingo2() {
            return a[2][0] == -1 && a[1][1] == -1 && a[0][2] == -1;
        }
    }

    private static void solve() {
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            a[i] = in.nextIntArray(3);
        }

        int n = in.nextInt();
        Bingo b = new Bingo(a);
        for (int i = 0; i < n; i++) {
            int next = in.nextInt();
            b.test(next);
        }

        out.println(b.isBingo() ? "Yes" : "No");
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
