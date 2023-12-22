import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[][] magic = new int[n][2];
		for(int i = 0; i < n; i++){
		    magic[i][0] = sc.nextInt();
		    magic[i][1] = sc.nextInt();
		}
		/*
		int[] d = new int[100001];
		for(int i = 0; i < d.length; i++){
		    magic[i][0] = sc.nextInt();
		    magic[i][1] = sc.nextInt();
		}
		Arrays.sort(magic, (x, y) -> {
		    double d = (double)y[0]/y[1] - (double)x[0]/x[1];
		    if(d != 0) return d;
		    else return x[1] - y[1];
		});*/

		// 計算
		int result = 0;
		int[] dp = new int[10001]; // dp[ダメージ] = 最小魔力
		Arrays.fill(dp, 10000000);
		for(int i = 0; i < dp.length; i++){
		    for(int j = 0; j < n; j++){
		        if(magic[j][0] >= i) dp[i] = min(dp[i], magic[j][1]);
		        if(i+magic[j][0] < dp.length) dp[i+magic[j][0]] = min(dp[i+magic[j][0]], dp[i] + magic[j][1]);
		    }
		}
		//System.out.println(Arrays.toString(dp));
		
		// 出力
		System.out.println(dp[h]);
	}
}
