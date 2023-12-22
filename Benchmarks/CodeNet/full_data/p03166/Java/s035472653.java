import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges = sc.nextInt();
        int dp[] = new int[n+1];
        int ans = 0;
        for(int i=0;i<edges;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            dp[b] = Math.max(dp[b],dp[a]+1);
            ans = Math.max(ans,dp[b]);
        }
        System.out.println(ans);
    }
}