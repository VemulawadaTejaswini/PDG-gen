import java.io.*;
import java.util.*;

public class Main {
    //  ...#
    //  .#..
    //  ....
    static int R, C;
    static char[][] grid;
    static boolean[][] visGrid;
    static int[][] dp;
    public static boolean validMove(int r, int c){
        if(r < R && c < C)
            return grid[r][c] == '.';
        else return false;
    }

    public static int explore(int row, int col){
        if(!validMove(row, col))
            return 0;
        if(row == R - 1 && col == C - 1)
            return 1;
        if(visGrid[row][col])
            return dp[row][col];
        dp[row][col] = (explore(row + 1, col) + explore(row, col + 1)) % ((int)1e9 + 7);
        visGrid[row][col] = true;
        return dp[row][col] % ((int)1e9 + 7);
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        R = sc.nextInt(); C = sc.nextInt();
        grid = new char[R][C];
        visGrid = new boolean[R][C];
        dp = new int[R][C];
        for (int i = 0; i < R; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
        pw.println(explore(0,0));
//        for(int[] x : dp)
//            pw.println(Arrays.toString(x));
        pw.close();
    }


    static class Scanner {
            StringTokenizer st;
            BufferedReader br;

            public Scanner(InputStream s) {
                br = new BufferedReader(new InputStreamReader(s));
            }

            public String next() throws IOException {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine());
                return st.nextToken();
            }

            public int nextInt() throws IOException {
                return Integer.parseInt(next());
            }

            public long nextLong() throws IOException {
                return Long.parseLong(next());
            }

            public String nextLine() throws IOException {
                return br.readLine();
            }

            public double nextDouble() throws IOException {
                String x = next();
                StringBuilder sb = new StringBuilder("0");
                double res = 0, f = 1;
                boolean dec = false, neg = false;
                int start = 0;
                if (x.charAt(0) == '-') {
                    neg = true;
                    start++;
                }
                for (int i = start; i < x.length(); i++)
                    if (x.charAt(i) == '.') {
                        res = Long.parseLong(sb.toString());
                        sb = new StringBuilder("0");
                        dec = true;
                    } else {
                        sb.append(x.charAt(i));
                        if (dec)
                            f *= 10;
                    }
                res += Long.parseLong(sb.toString()) / f;
                return res * (neg ? -1 : 1);
            }

            public boolean ready() throws IOException {
                return br.ready();
            }
            public int[] nextIntArr(int n) throws IOException {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(next());
                }
                return arr;
            }
        }
    static class Pair {
            int x, y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return "(" + x + "," + y + ")";
            }
        }
}