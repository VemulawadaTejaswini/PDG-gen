import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;

    public static void solve() throws IOException {
        Integer[] nums = nextArray(2);
        Integer[] h = nextArray(nums[0]);

        int n = nums[0];
        int k = nums[1];

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE ;
            for(int j = 1;j<=k && (i-j)>=0;j++){
//                System.out.println("i ran guys");
                dp[i] = Math.min(dp[i-j]+calc(h,i,i-j),dp[i]);
            }
//            System.out.println(dp[i]);
        }

//        System.out.println(Arrays.toString(dp));


        System.out.println(dp[n-1]);




    }

    static int calc(Integer[] arr , int i, int j){
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

