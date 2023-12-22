import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int tmp = 1;
		while(tmp <= n){
		    ts.add(tmp);
		    tmp *= 6;
		}
		tmp = 1;
		while(tmp <= n){
		    ts.add(tmp);
		    tmp *= 9;
		}
		System.out.println(ts.toString());
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0; i < n+1; i++){
		    for(Integer j : ts){
		        if(i + j > n) break;
		        dp[i + j] = min(dp[i] + 1, dp[i + j]);
		    }
		}
		result = dp[n];
		
		// 出力
		System.out.println(result);
	}
}
