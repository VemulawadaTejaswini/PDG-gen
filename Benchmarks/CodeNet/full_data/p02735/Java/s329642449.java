import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        char[][] mat  = new char[h][w];
        for(int i=0; i<h; i++) {
            mat[i] = br.readLine().toCharArray();
        }
        int[][] dp = new int[h][w];
        if(mat[h-1][w-1] == '#')
            dp[h-1][w-1] = 1;
        for(int i=w-2; i>=0; i--) {
            if(mat[h-1][i] == '.')
                dp[h-1][i] = dp[h-1][i+1];
            else
                dp[h-1][i] = dp[h-1][i+1] + 1;
        }
        for(int i=h-2; i>=0; i--) {
            if(mat[i][w-1] == '.')
                dp[i][w-1] = dp[i+1][w-1];
            else
                dp[i][w-1] = dp[i+1][w-1] + 1;
        }
        for(int i=h-2; i>=0; i--) {
            for(int j=w-2; j>=0; j--) {
                dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]);
                if(mat[i][j] == '#')
                    dp[i][j]++;
            }
        }
        System.out.println(dp[0][0]);
        br.close();
    }
}
