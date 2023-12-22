import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int findNumPaths(char[][] grid, int m, int n) {
        int mod = 1000000007;
        int[][] dp =new int[m][n];
        dp[0][0]=1;
        for(int i=1;i<n;++i) {
            if(grid[0][i]!='#') {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for(int j=1;j<m;++j) {
            if(grid[j][0]!='#') {
                dp[j][0] = dp[j - 1][0];
            }
        }

        for(int i=1;i<m;++i) {
            for(int j=1;j<n;++j) {
                if(grid[i][j]!='#') {
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%mod;
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        Main h = new Main();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        try {
            String[] line1 = reader.readLine().split(" ");
            int m = Integer.parseInt(line1[0]),n = Integer.parseInt(line1[1]);
            char[][] grid = new char[m][n];
            for(int i=0;i<m;++i) {
                grid[i]=reader.readLine().toCharArray();
            }
            System.out.println(h.findNumPaths(grid,m,n));
        } catch (IOException e) {

        }
    }
}
