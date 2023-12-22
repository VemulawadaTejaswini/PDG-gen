import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n+1];
		for(int i=0;i<n;i++) {
			d[i+1] = sc.nextInt();
		}
		d[0] = 0;
		for(int i=12;i>=0;i--) {
			if (check(n+1,d,i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	public static boolean check(int n,int[] d, int k) {
		int[][] m = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i == j) continue;
				boolean same = Math.abs(d[i]-d[j]) >= k;
				boolean diff = Math.min(d[i] + d[j], 24 - d[i] - d[j]) >= k;
				if (!same && !diff) {
					return false;
				}
				if (same && diff) {

				}else if(same){
					m[i][j] = m[j][i] = 1;
				}else{
					m[i][j] = m[j][i] = -1;
				}
			}
		}
//		System.out.println(Arrays.deepToString(m));
		int[] sgn = new int[n];
		boolean ok = true;
		try {
			for(int i=0;i<n;i++) {
				if (sgn[i] == 0) {
					sgn[i] = 1;
					dfs(i,n,m,sgn);
				}
			}
		}catch (RuntimeException e) {
			ok = false;
		}
		return ok;

		//return (a <= i && i < b) || (a <= i + 24 && i + 24 < b);
	}

	public static void dfs(int v, int n, int[][] m, int[] sgn) {
		for(int u=0;u<n;u++) {
			if (v==u || m[v][u] == 0) continue;
			int sgn2 = sgn[v] * m[v][u];
			if (sgn[u] != 0) {
				if (sgn[u] != sgn2) {
					//fail
					throw new RuntimeException();
				}
			}else{
				sgn[u] = sgn2;
				dfs(u,n,m,sgn);
			}
		}
	}


}