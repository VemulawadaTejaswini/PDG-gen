
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int arr[][]=new int[n][3];
        int dp[][] = new int[n+1][3];
        for(int i=0;i<n;i++){
            in = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(in[0]);
            arr[i][1] = Integer.parseInt(in[1]);
            arr[i][2] = Integer.parseInt(in[2]);
        }
        for(int i=1;i<=n;i++){
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2])+arr[i-1][0];
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2])+arr[i-1][1];
            dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0])+arr[i-1][2];
        }
        System.out.println(Math.max(Math.max(dp[n][0],dp[n][1]), dp[n][2]));
    }
}

