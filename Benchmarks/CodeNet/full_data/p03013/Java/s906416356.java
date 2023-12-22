import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		long[] dp = new long[N+1];
		boolean[] hole = new boolean[N+1];
		Arrays.fill(hole, false);
		for(int i=0; i<M; i++){
			int m = Integer.parseInt(sc.next());
			hole[m] = true;
		}
		
		if(N==1){
			ans = 1;
		}
		dp[0] = 1;
	
		if(!hole[1]){
			dp[1] = 1;
		}
		
		for(int i=2;i<=N;i++){
			if(!hole[i-1])dp[i] += dp[i-1];
			dp[i] %= MOD;
			if(!hole[i-2])dp[i] += dp[i-2];
			dp[i] %= MOD;
			if(hole[i])dp[i] = 0;
			dp[i] %= MOD;
		}
		
		//Arrays.sort(W);
		
		ans = dp[N];
		System.out.println(ans);
		
	}
	
	
}

