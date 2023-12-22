import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        Integer[] nw = nextArray(2);
        int n = nw[0];
        int w = nw[1];

        Integer[] weights = new Integer[n];
        Integer[] values = new Integer[n];

        Long[][] dp = new Long[n][w+1];

        for(int index = 0;index<n;index++){
            nw = nextArray(2);
            weights[index] = nw[0];
            values[index] = nw[1];
        }

//        for (int i = 0;i<=w;i++){
//            dp[0][i] = i >= weights[0]?values[0]:0L;
//        }

//        System.out.println(Arrays.toString(dp[0]));

        for(int i = 1;i<n;i++){
            for(int j = 0;j<=w;j++){
                dp[i][j] = dp[i-1][j];
                if( j >= weights[i]){
                    dp[i][j] = Math.max(dp[i][j], values[i] + dp[i-1][j - weights[i]]);
                }
            }
        }

        for(Long[] arr : dp){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(dp[n-1][w]);




    }




    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

