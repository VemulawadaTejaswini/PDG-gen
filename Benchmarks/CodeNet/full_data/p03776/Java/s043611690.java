import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://abc057.contest.atcoder.jp/tasks/abc057_d
 */
public class Main {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long[] v = new long[N];
		for(int i=0; i<N; i++) v[i] = sc.nextLong();
		sc.close();
		
	 	Arrays.sort(v);
		long[] dp = new long[N];
		dp[0] = v[N-1];
		for(int i=1; i<N; i++){ 
			dp[i] = dp[i-1]+v[N-1-i];
		}
		Map<Long, Integer> countDp = new HashMap<Long, Integer>();
		Map<Long, Integer> startDp = new HashMap<Long, Integer>();
		for(int i=0; i<N; i++){ 
			if(countDp.containsKey(v[i])){
				countDp.put(v[i], countDp.get(v[i])+1);
			}else{
				countDp.put(v[i], 1);
				startDp.put(v[i], i);
			}
		}
		
		double max = 0;
		long ans = 0;
		for(int n=A; n<=B; n++){
			double value = (double)dp[n-1]/(double)n;
			if(value<max) continue;
			long min = v[N-1-n+1];
			long count = getCombination(countDp.get(min), countDp.get(min)+startDp.get(min)-(N-1-n+1));
			if(max==value){
				ans = ans + count;
			}else{
				max = value;
				ans = count;
			}
			System.out.println(ans);
		}
 
		System.out.println(max);
		System.out.println(ans);
		

	}
	
	static long getCombination(int n, int r){
		if (r == 1) {
	        return n;
	    }
	    long sum = 1;
	    for (int i = 1; i <= r; i++) {
	    	sum = sum * (n - i + 1) / i;
	    }
	    return sum;
	}
	
}