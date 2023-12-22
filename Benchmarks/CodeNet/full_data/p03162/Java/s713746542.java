import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }



    public static void main(String[] args) {

    FastReader sc = new FastReader();

    int n = sc.nextInt();
    int dp[][] = new int[n][3];
    int cost[][] = new int[n][3];
    for(int i=0; i<n; i++){
        for(int j=0; j<3; j++){
            dp[i][j] = sc.nextInt();
        }
    }
    cost[n-1][0] = dp[n-1][0];
    cost[n-1][1] = dp[n-1][1];
    cost[n-1][2] = dp[n-1][2];
    for(int i= n-2;i>=0; i--){
        cost[i][0] = dp[i][0] + Math.max(cost[i+1][1],cost[i+1][2]);
        cost[i][1] = dp[i][1] + Math.max(cost[i+1][0],cost[i+1][2]);
        cost[i][2] = dp[i][2] + Math.max(cost[i+1][1],cost[i+1][0]);
    }
    System.out.println(Math.max(cost[0][0],Math.max(cost[0][1],cost[0][2])));
    }

}
