import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;
    static StringTokenizer st;

    public static void solve() throws IOException {
        int n = nextInt();
        double[] arr = new double[n];
        st = new StringTokenizer(in.readLine());
        for(int i = 0;i<n;i++)
            arr[i] = Double.parseDouble(st.nextToken());

        double[] dp = new double[n+1];

        dp[0] = 1;
        for(int coin = 0; coin < n; coin++){

            for(int i = coin+1;i>=0;i--){
                dp[i] = (i ==0?0 : dp[i-1]*arr[coin]) + dp[i]*(1-arr[coin]);
//                System.out.println(Arrays.toString(dp));
            }
//            System.out.println("A bout ends here");
        }

        double answer=  0;

        for(int i = (n+1)/2;i<=n;i++){
            answer+=dp[i];
        }

        System.out.println(answer);

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

