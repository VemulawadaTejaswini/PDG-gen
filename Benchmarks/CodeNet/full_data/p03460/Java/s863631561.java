import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author amotoma3
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[][] bCnt = new int[2 * k][2 * k];
            int[][] wCnt = new int[2 * k][2 * k];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                boolean isBlack = in.nextString().charAt(0) == 'B';

                if (isBlack) {
                    bCnt[x % (2 * k)][y % (2 * k)]++;
                } else {
                    wCnt[x % (2 * k)][y % (2 * k)]++;
                }
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    bCnt[i][j] += bCnt[i + k][j + k];
                    bCnt[i][j] += wCnt[i][j + k];
                    bCnt[i][j] += wCnt[i + k][j];
                    wCnt[i][j] += wCnt[i + k][j + k];
                    wCnt[i][j] += bCnt[i][j + k];
                    wCnt[i][j] += bCnt[i + k][j];
                }
            }

            int[][] bSum = new int[k + 1][k + 1];
            int[][] wSum = new int[k + 1][k + 1];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    bSum[i + 1][j + 1] = bCnt[i][j];
                    wSum[i + 1][j + 1] = wCnt[i][j];
                }
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    bSum[i][j] += bSum[i - 1][j];
                    wSum[i][j] += wSum[i - 1][j];
                }
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    bSum[i][j] += bSum[i][j - 1];
                    wSum[i][j] += wSum[i][j - 1];
                }
            }

//        for (int i = 0; i <= k; i++) {
//            for (int j = 0; j <= k; j++) {
//                out.print(bSum[i][j] + " ");
//            }
//            out.println();
//        }
//
//        for (int i = 0; i <= k; i++) {
//            for (int j = 0; j <= k; j++) {
//                out.print(wSum[i][j] + " ");
//            }
//            out.println();
//        }

            int ans = 0;
            for (int i = 0; i <= k; i++) {
                for (int j = 0; j <= k; j++) {
                    int tmp = 0;
                    tmp += bSum[k][k] - bSum[k][j] - bSum[i][k] + 2 * bSum[i][j];
                    tmp += wSum[k][j] + wSum[i][k] - 2 * wSum[i][j];

                    ans = Math.max(ans, tmp);

                    tmp = 0;
                    tmp += wSum[k][k] - wSum[k][j] - wSum[i][k] + 2 * wSum[i][j];
                    tmp += bSum[k][j] + bSum[i][k] - 2 * bSum[i][j];

                    ans = Math.max(ans, tmp);
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

