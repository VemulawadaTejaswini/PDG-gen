import java.util.*;

public class Main {
	static class Range {
		int size;
		long lv, rv;
		public Range(int size, long lv, long rv) {
			this.size = size;
			this.lv = lv;
			this.rv = rv;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextLong();
		
		int[][] dp = new int[2][];
		
		dp[0] = dp(A);
		long[] B = new long[A.length];
		for(int i=0; i<N; i++)
			B[i] = A[N-1-i];
		dp[1] = dp(B);
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<=N; i++)
			ans = Math.min(ans, dp[0][i]+dp[1][N-i]+i);
		
		System.out.println(ans);
		sc.close();
	}
	
	public static int[] dp(long[] A) {
		int N = A.length;
		int[] ans = new int[N+1];
		
		LinkedList<Range> list = new LinkedList<>();
		ans[N] = 0;
		for(int i=N-1; i>=0; i--) {
			ans[i] = ans[i+1];
			list.push(new Range(1, A[i], A[i]));
			
			while(list.size() > 1) {
				Range cur = list.pop();
				if(cur.rv <= list.peek().lv) {
					list.push(cur);
					break;
				}
				Range next = list.pop();
				while(cur.rv > next.lv) {
					next.lv *= 4;
					next.rv *= 4;
					ans[i] += 2*next.size;
				}
				cur.size += next.size;
				cur.rv = next.rv;
				list.push(cur);
			}
		}

		return ans;
	}
	
}