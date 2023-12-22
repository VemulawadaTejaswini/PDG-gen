import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        StringTokenizer tok = new StringTokenizer("");

        String next() throws IOException {
            if (!tok.hasMoreTokens()) {
                tok = new StringTokenizer(in.readLine());
            }
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    class Writer {
        PrintWriter out;

        Writer() throws IOException {
            out = new PrintWriter(System.out);
        }


        StringBuilder str = new StringBuilder();

        void print(Object o) {
            str.append(o);
        }

        void close() {
            out.append(str);
            out.close();
        }
    }

    void run() throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        int h = in.nextInt();
        int w = in.nextInt();
        //int field[][] = new int[h][w];
        int dp[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < h; i++) {
            String s = in.next();
            for (int j = 0; j < w; j++) {
                if (i > 0) {
                    dp[i][j] = min(dp[i - 1][j], dp[i][j]);
                }
                if (j > 0) {
                    dp[i][j] = min(dp[i][j - 1], dp[i][j]);
                }
                if (s.charAt(j) == '#') {
                    dp[i][j] += 1;
                }
            }
        }
        out.print(dp[h - 1][w - 1]);
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }
}
