import java.io.*;
import java.util.*;

class Prob {
    static BufferedReader in;

    public static void solve() throws IOException {
        int n = nextInt();
        Integer[] h = nextArray(n);

        int[] dp = new int[n];

        dp[0] = 0;
        dp[1] = calc(h,1,0);

        for(int i = 2;i<n;i++){
            dp[i] = Math.min(dp[i-1]+calc(h,i,i-1), dp[i-2]+calc(h,i,i-2));
        }

//        System.out.println(Arrays.toString(dp));

        System.out.println(dp[n-1]);



    }
    static int calc(Integer[] arr, int i , int j){
        return Math.abs(arr[i] - arr[j]);
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

