import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temp {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split("\\s+");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int mod = (int) Math.pow(10, 9) + 7;
        char[][] arr = new char[h][w];
        for(int i = 0 ; i<h ; i++) {
            String temp = br.readLine().trim();
            for(int j=0 ; j<w ; j++)
                arr[i][j] = temp.charAt(j);
        }

        int[][] dp = new int[h][w];

        dp[h-1][w-1] = 1;

        for(int i=w-2 ; i>=0 ; i--)
        {
            if(arr[h-1][i] == '#')
                dp[h-1][i] = 0;
            else
                dp[h-1][i] = dp[h-1][i+1];
        }

        for(int i=h-2 ; i>=0 ; i--)
        {
            if(arr[i][w-1] == '#')
                dp[i][w-1] = 0;
            else
                dp[i][w-1] = dp[i+1][w-1];
        }

        for(int i=h-2 ; i>=0 ; i--)
        {
            for(int j=w-2 ; j>=0 ; j--)
            {
                if(arr[i][j] == '#')
                {
                    dp[i][j] = 0;
                    continue;
                }

                long temp = (long) dp[i+1][j] + dp[i][j+1];
                dp[i][j] = (int) (temp % mod);
            }
        }

        System.out.println(dp[0][0]);
    }
}