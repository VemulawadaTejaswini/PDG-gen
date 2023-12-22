import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        int H;
        H = sc.nextInt();
        int W;
        W = sc.nextInt();
        int[][] A = new int[(int)(H)][(int)(W)];
        for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < W ; j++){
                    A[i][j] = sc.nextInt();
                }
        }
        int[][] B = new int[(int)(H)][(int)(W)];
        for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < W ; j++){
                    B[i][j] = sc.nextInt();
                }
        }
        solve(H, W, A, B);
    }

    static void solve(int H, int W, int[][] A, int[][] B){
        int[][] diff = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                diff[i][j] = Math.abs(A[i][j] - B[i][j]);
            }
        }

        int depth = 80 * H * W;
        int[][][] dp = new int[H][W][depth];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                Arrays.fill(dp[i][j], 0);
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(i == 0 && j == 0) dp[i][j][diff[i][j]] = 1;
                else {
                    if(i != 0) {
                        for (int k = 0; k < depth; k++) {
                            if(dp[i-1][j][k] != 0) {
                                dp[i][j][Math.abs(k-diff[i][j])] = 1;
                                dp[i][j][k+diff[i][j]] = 1;
                            }
                        }
                    }
                    if(j != 0) {
                        for (int k = 0; k < depth; k++) {
                            if(dp[i][j-1][k] != 0) {
                                dp[i][j][Math.abs(k-diff[i][j])] = 1;
                                dp[i][j][k+diff[i][j]] = 1;
                            }
                        }
                    }
                }
            }
        }
        int ans = INF;
        for (int i = 0; i < depth; i++) {
            if(dp[H-1][W-1][i] != 0) ans = Math.min(ans, i);
        }

        System.out.println(ans);
    }


    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
