import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        int[][][] precompute;
        int[][] dp;
        boolean[][] wasInState;
        int h,w;
        String[] painting;

        int r(int position, int shift1, int shift2) {
            if (position == w - 1) {
                return 0;
            }
            if (wasInState[shift1][shift2]) {
                return dp[shift1][shift2];
            }
            wasInState[shift1][shift2] = true;
            int res = Integer.MAX_VALUE;
            if ((shift1 == h) || (shift2 == h)) {
                return 0;
            } else {
                int add = precompute[position][shift1][shift2];
                res = Math.min(res, add + r(position, shift1 + 1, shift2));
                res = Math.min(res, add + r(position, shift1, shift2 + 1));
            }
            dp[shift1][shift2] = res;
            return res;
        }

        public void solve(InputReader in, PrintWriter out) {

            h = in.nextInt();
            w = in.nextInt();
            painting = new String[h];
            for (int i = 0; i < h; ++i) {
                painting[i] = in.next();
            }
            precompute = new int[w - 1][h + h + 1][h +h + 1];
            for (int position = 0; position + 1 < w; ++position) {
                for (int shift1 = 0; shift1 <= h; ++shift1) {
                    for (int shift2 = 0; shift2 <= h; ++shift2) {
                        if ((shift1 == 0) || (shift2 == 0)) {
                            for (int i = 0; i < h - shift1; ++i) {
                                int j = i + shift1 - shift2;
                                if ((j >= 0) && (j < h) && (painting[i].charAt(position) == painting[j].charAt(position + 1))) {
                                    precompute[position][shift1][shift2]++;
                                }
                            }
                        } else {
                            precompute[position][shift1][shift2] = precompute[position][shift1 - 1][shift2 - 1];
                            int last1 = h - shift1;
                            int last2 = h - shift2;
                            if ((last1 >= 0) && (last1 < h) && (last2 >= 0) && (last2 < h) && (painting[last1].charAt(position) == painting[last2].charAt(position + 1))) {
                                precompute[position][shift1][shift2]--;
                            }
                        }
                    }
                }
            }

            dp = new int[h + 1][h + 1];
            wasInState = new boolean[h + 1][h + 1];
            int res = 0;
            for (int i = 0; i + 1 < w; ++i) {
                for (int i1 = 0; i1 < wasInState.length; ++i1) {
                    for (int j1 = 0; j1 < wasInState.length; ++j1) {
                        wasInState[i1][j1] = false;
                    }
                }
                res += r(i,0,0);
            }
            out.println(res);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}
