import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int n = s1.length();
        int m = s2.length();

        String dp[][] = new String[n+1][m+1];

        for(int i=0;i<=n;i++) dp[i][m] = ""; 
        for(int j=0;j<=m;j++) dp[n][j] = "";

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = s1.charAt(i) + dp[i+1][j+1];
                }
                else{
                    if(dp[i+1][j].length() > dp[i][j+1].length()){
                        dp[i][j] = dp[i+1][j];
                    }
                    else{
                        dp[i][j] = dp[i][j+1];
                    }
                }
            }
        }

        System.out.println(dp[0][0]);
    }
}