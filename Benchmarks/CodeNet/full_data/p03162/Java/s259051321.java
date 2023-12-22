import java.util.Scanner;
public final class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] day = new int[n][3];
        int[][] dp = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                day[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i=0; i<3; i++){
            dp[0][i] = day[0][i]; 
            if(max < day[0][i])
                max = day[0][i];
        }
        int val = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                if(j==0)
                    val = Math.max(dp[i-1][1],dp[i-1][2]);
                else if(j==1)
                    val = Math.max(dp[i-1][0],dp[i-1][2]);
                else
                    val = Math.max(dp[i-1][0],dp[i-1][1]);
                dp[i][j] = day[i][j] + val; 
                if(dp[i][j]>max)
                    max = dp[i][j];  
            }   
        }
        System.out.println(max);
        sc.close();
    }
}