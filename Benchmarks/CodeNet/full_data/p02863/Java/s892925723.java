import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[][] dish = new int[n][2];
		for(int i = 0; i < n; i++){
		    dish[i][0] = sc.nextInt();
		    dish[i][1] = sc.nextInt();
		}
		Arrays.sort(dish, (x, y) -> Integer.compare(x[0], y[0]));
		
		// 計算
		int result = 0;
		int[][] dp = new int[n+1][t];
		for(int i = 0; i < n; i++){
		    int a = dish[i][0];
		    int b = dish[i][1];
		    for(int j = t-1; j > 0; j--){
		        dp[i+1][j] = dp[i][j];
		        if(j >= a){
		            dp[i+1][j] = max(dp[i][j], dp[i][j-a] + b);
		        }
		    }
		    result = max(result, dp[i][t-1] + b);
		}
		
		// 出力
		System.out.println(result);
	}
}
