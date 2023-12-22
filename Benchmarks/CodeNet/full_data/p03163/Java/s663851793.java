import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        long dp[][] = new long[110][100100];
        for(int i=0; i<n; i++){
            for(int sum_w=0; sum_w<=w; sum_w++){
                if(sum_w - weight[i]>=0){
                    dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w - weight[i]] + value[i]);
                }
                dp[i+1][sum_w] = Math.max(dp[i+1][sum_w], dp[i][sum_w]);
            }
        }
        System.out.println(dp[n][w]);
    }
}
