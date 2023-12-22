import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static long solve(long A[] , int N){
		long dp[][] = new long[N][2];
		for(int i = 0 ; i < N ; ++i){
			Arrays.fill(dp[i], -100000000);
		}
		dp[0][0] = 0;
		for(int i = 0 ; i < N ; ++i){
			long next[][] = new long[N][2];
			for(int j = 0 ; j < N ; ++j){
				Arrays.fill(next[j], -100000000);
			}
			for(int j = 0 ; j < N ; ++j){
				next[j][0] = Math.max(dp[j][0] , dp[j][1]);					

				if(j > 0 && dp[j - 1][0] != -100000000){
					next[j][1] = dp[j - 1][0] + A[i];
				}
			}
			dp = next;
		}
		return Math.max(dp[N/2][0], dp[N/2][1]);
	}
	static long solve2(long A[] , int N){
		Map<Integer, Long> dp = new HashMap<Integer, Long>();
		dp.put(0, 0L);
		int needChoose = N / 2;
		for(int i = 0 ; i < N ; ++i){
			int canChoose = (N - i + 1) / 2;
			int mustChoosen = Math.max(needChoose - canChoose , 0);
			Map<Integer, Long> next = new HashMap<Integer, Long>();
			for(int j = mustChoosen ; j < N ; ++j){
				if(j > 0 && dp.containsKey(2 * j - 2)){
					next.put(2 * j + 1, dp.get(2 * (j - 1)) + A[i]);
				}
				boolean f = false;
				if(dp.containsKey(2 * j)){
					if(dp.containsKey(2 * j + 1)){
						next.put(2 * j, Math.max(dp.get(2 * j), dp.get(2 * j + 1)));
					}else{
						next.put(2 * j, dp.get(2 * j));
					}
					f = true;
				}else if(dp.containsKey(2 * j + 1)){
					if(dp.containsKey(2 * j)){
						next.put(2 * j, Math.max(dp.get(2 * j), dp.get(2 * j + 1)));
					}else{
						next.put(2 * j, dp.get(2 * j + 1));
					}
					f = true;
				}
				if(!f){
					break;
				}
			}
			dp = next;
		}
		long ret = 0;
		if(dp.containsKey(needChoose * 2)){
			ret = dp.get(needChoose * 2);
			if(dp.containsKey(needChoose * 2 + 1)){
				ret = Math.max(ret, dp.get(needChoose * 2 + 1));
			}
			return ret;
		}
		if(dp.containsKey(needChoose * 2 + 1)){
			ret = dp.get(needChoose * 2 + 1);
			if(dp.containsKey(needChoose * 2)){
				ret = Math.max(ret, dp.get(needChoose * 2));
			}
			return ret;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		System.out.println(solve2(A, N));
	}
}
