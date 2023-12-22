import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++){
		    list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++){
		    int from  = sc.nextInt();
		    int to = sc.nextInt();
		    list[from].add(to);
		}
		
		// 計算
		double result = Double.MAX_VALUE;
		for(int k = 0; k <= n-1; k++){
		    double[] dp = new double[n+1];
		    for(int i = n-1; i >= 1; i--){
		        if(i == k && list[i].size() <= 1){
		            dp[i] = 0;
		            continue;
		        }
		        int cnt = list[i].size();
		        if(i == k) cnt--;
		        double q = (double)1/cnt;
		        double max = 0;
		        for(int to : list[i]){
		            if(dp[to] == 0 && to != n){
		                dp[i] = 0;
		                break;
		            }else{
		                dp[i] += (1 + dp[to]) * q;
		                max = max(max, dp[to]);
		            }
		        }
		        if(i == k) dp[i] -= (1 + max) * q;
		        //System.out.println("k:" + k + " " + Arrays.toString(dp));
		    }
		    //System.out.println("k:" + k + " " + Arrays.toString(dp));
		    if(dp[1] != 0) result = min(result, dp[1]);
		}
		// 出力
		System.out.println(result);
		
	}
}