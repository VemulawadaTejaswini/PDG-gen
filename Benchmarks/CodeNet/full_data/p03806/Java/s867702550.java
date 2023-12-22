import java.util.*;

public class Main {
	static int MAX_N = 40;
	static int MAX_a = 10;
	static int MAX_b = 10;
	static int MAX_mb = MAX_N*MAX_a;
	static int Big = 400000;
	static int[] a = new int[MAX_N];
	static int[] b = new int[MAX_N];
	static int[] c = new int[MAX_N];
	static int[][][] memo = new int[MAX_N+1][MAX_mb+1][MAX_mb+1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt(); b[i] = sc.nextInt(); c[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<memo.length; i++) {
			for(int j=0; j<memo[i].length; j++) {
				Arrays.fill(memo[i][j], Big);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i=1; i<memo.length; i++) {
			for(int j=1; j<memo[i].length; j++) {
				if(i*Mb == j*Ma && dp(N, i, j) != Big) {
					ans = min(ans, dp(N, i, j));
				}
			}
		}
//		for(int i=0; i<memo.length; i++) {
//			
//		}
		if(ans >= Big)
			ans = -1;
		System.out.println(ans);
	}
	
	static int dp(int i, int ma, int mb) {
		if(memo[i][ma][mb]!=Big) return memo[i][ma][mb];
		if(ma==0&&mb==0) return memo[i][ma][mb] = 0;
		if(i<=0) return Big;
		if(ma-a[i-1]>=0 && mb-b[i-1]>=0) {
			return memo[i][ma][mb] = min(dp(i-1, ma-a[i-1], mb-b[i-1])+c[i-1], dp(i-1, ma, mb));
		} else {
			return memo[i][ma][mb] = dp(i-1, ma, mb);
		}
	}
	
	static int max(int...ls) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.max(ans, ls[i]);
		}
		return ans;
	}
	
	static int min(int...ls) {
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<ls.length; i++) {
			ans = Math.min(ans, ls[i]);
		}
		return ans;
	}
	// end number lib
}