import java.io.*;
import java.util.*;
import java.math.*;

public class Main {


    public static void solve() {
        int mod = 1000000000 + 7;

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] grid = new int[n][m];

        for(int i = 0; i < n; i += 1) {
            String s = in.nextLine();
            for(int j = 0; j < m; j += 1){
                grid[i][j] = s.charAt(j) == '.' ? 1 : 0;
            }
        }

        long[][] paths = new long[n][m];

        paths[0][0] = grid[0][0];

        for(int j = 1; j < m; j += 1)
            paths[0][j] = grid[0][j] == 0 ? 0 : paths[0][j-1];

        for(int i = 1; i < n; i += 1)
            paths[i][0] = grid[i][0] == 0 ? 0 : paths[i-1][0];

        for(int i = 1; i < n; i += 1) {
            for(int j = 1; j < m; j += 1){
                if(grid[i][j] == 0)
                    paths[i][j] = 0;
                else
                    paths[i][j] = paths[i-1][j]%mod + paths[i][j-1]%mod;
            }
        }

         out.println(paths[n-1][m-1]%mod);
        
    }


    public static InputReader in = new InputReader();
    public static PrintWriter out;

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        /**
         * When you call next(), that entire line will be skipped.
         * No flushing buffers.
         * Doesn't work when you want to scan the remaining line.
         *
         * @return entire line
         */
        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
                tokenizer = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}