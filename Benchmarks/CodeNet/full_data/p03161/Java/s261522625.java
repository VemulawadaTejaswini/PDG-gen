import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        s = br.readLine().trim().split("\\s+");
        for(int i=0 ; i<n ; i++)
            arr[i] = Integer.parseInt(s[i]);

        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1 ; i<n ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=1 ; j<=k && (i-j)>= 0; j++)
            {
                int temp = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                min = Math.min(temp, min);
            }

            dp[i] = min;
        }

        System.out.println(dp[n-1]);
    }
}
