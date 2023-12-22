import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc073/tasks/abc073_d
 */
public class Main {
	
	static int[][] dp;
	static int[] r;
	static int R;
	static long ans = Long.MAX_VALUE;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		R = sc.nextInt();
		r = new int[R];
		for(int i=0; i<R; i++) r[i] = sc.nextInt()-1;
		dp = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				dp[i][j] = i==j ? 0 : Integer.MAX_VALUE/2;
			}
		}
		for(int i=0; i<M; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			dp[a][b] = dp[b][a] = sc.nextInt();
		}
		sc.close();
		
		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]);
				}
			}
		}
		
		dfs(new ArrayList<Integer>(), 0);
		
		System.out.println(ans);
		
	}

	private static void dfs(List<Integer> list, int current) {
		if(list.size()==R){
			ans = Math.min(ans, current);
			return;
		}
		
		for(int next:r){
			if(list.contains(next)) continue;
			List<Integer> newList = new ArrayList<>();
			for(int l:list) newList.add(l);
			int nextCost = current;
			if(list.size()>0){
				nextCost += dp[list.get(list.size()-1)][next];
			}
			newList.add(next);
			dfs(newList, nextCost);
		}
		
	}


}
