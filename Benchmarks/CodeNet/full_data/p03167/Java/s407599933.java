import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char grid[][]=new char[r][c];
        for(int i=0;i<r;i++){
            String str=sc.next();
            for(int j=0;j<c;j++){
                grid[i][j]=str.charAt(j);
            }
        }
        int dp[][]=new int[r+1][c+1];
        dp[1][1]=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1&&j==1)
                continue;
                if(grid[i-1][j-1]=='#')
                continue;
                else{
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
                }
            }
        }
        System.out.println(dp[r][c]%1000000007);
    }
}