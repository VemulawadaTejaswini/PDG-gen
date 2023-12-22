import java.util.*;

public class Main {
    public static int modulo = (int) Math.pow(10,9) + 7;
    public static int solve(int i,int j,int x,int y,char grid[][],int dp[][]){
        if(i > x || j > y) return 0;
        if(i == x && j == y) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        if(grid[i][j] == '#'){
            return 0;
        }
        int ans = solve(i+1,j,x,y,grid,dp)%modulo + solve(i,j+1,x,y,grid,dp)%modulo;
        return dp[i][j] = ans%modulo;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r = sc.nextInt();
        c = sc.nextInt();
        char grid[][] = new char[r][c];

        for(int i=0;i<r;i++){
                 grid[i] = sc.next().toCharArray();
        }

        int dp[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                dp[i][j] = -1;
            }
        }

        int ans = solve(0,0,r-1,c-1,grid,dp);
        System.out.println(ans);
    }
}
