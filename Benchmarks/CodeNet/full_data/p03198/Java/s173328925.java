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
		
		int[][] dp = new int[2][N+1];
		
		LinkedList<Range> list = new LinkedList<>();
		dp[0][N] = 0;
		for(int i=N-1; i>=0; i--) {
			dp[0][i] = dp[0][i+1];
			list.push(new Range(1,A[i],A[i]));
			
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
					dp[0][i] += 2*next.size;
				}
				cur.size += next.size;
				cur.rv = next.rv;
				list.push(cur);
			}
		}
		
		list.clear();
		dp[1][0] = 0;
		for(int i=1; i<=N; i++) {
			dp[1][i] = dp[1][i-1]+1;
			list.push(new Range(1,-2*A[i-1],-2*A[i-1]));
			
			while(list.size() > 1) {
				Range cur = list.pop();
				if(list.peek().rv <= cur.lv) {
					list.push(cur);
					break;
				}
				Range next = list.pop();
				while(next.rv > cur.lv) {
					next.lv *= 4;
					next.rv *= 4;
					dp[1][i] += 2*next.size;
				}
				cur.size += next.size;
				cur.lv = next.lv;
				list.push(cur);
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<=N; i++)
			ans = Math.min(ans, dp[0][i]+dp[1][i]);
		
		System.out.println(ans);
		sc.close();
	}
	
}