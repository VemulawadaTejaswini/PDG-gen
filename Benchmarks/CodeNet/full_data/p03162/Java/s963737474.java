import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[][] = new long[100100][3];
        int a[][] = new int[n][3];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(k==j) continue;
                    dp[i][k] = Math.max(dp[i][k], dp[i-1][j]+a[i-1][k]);
                }
            }
        }
        long ans = 0;
        for(int j=0; j<3; j++){
            ans = Math.max(dp[n][j], ans);
        }
        System.out.println(ans);
    }
}
