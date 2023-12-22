import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class P implements Comparable<P>{
		int time;
		int value;
		P(int a , int b){
			time = a;
			value = b;
		}
		@Override
		public int compareTo(P o) {
			return time - o.time;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		List<P> lst = new ArrayList<P>();
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			lst.add(new P(A[i] , B[i]));
		}
		Collections.sort(lst);
		int ans = 0;
		int dp[] = new int[T + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(P p : lst){			
			int next[] = dp.clone();
			int a = p.time;
			int b = p.value;
			for(int j = 0 ; j < T ; ++j){
				if(dp[j] < 0){
					continue;
				}
				if(j + a >= T){
					ans = Math.max(ans, dp[j] + b);
				}else{
					next[j + a] = Math.max(next[j + a], dp[j] + b);
				}
			}
			dp = next;
		}
		for(int d : dp){
			ans = Math.max(ans, d);
		}
//		System.out.println(Arrays.toString(dp));
		System.out.println(ans);
	}	
}
