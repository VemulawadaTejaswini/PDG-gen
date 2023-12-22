import java.util.*;

public class Main {
	
	static class pair implements Comparable<pair>{
		final int l;
		final int r;
		public pair(int left, int right) {
			l = left;
			r = right;
		}
		
		public int compareTo(pair o) {
			if(l > o.l)return -1;
			else if(l < o.l)return 1;
			else {
				if(r > o.r)return 1;
				else if(r < o.r)return -1;
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
		pair p[] = new pair[m];
		for(int i = 0; i < m; ++i) {
			p[i] = new pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(p);
		int ans[][] = new int[n + 1][n + 1];
		for(int i = 1; i <= n; ++i) {
			for(int j = 1; j <= n; ++j) {
				for(int k = 0; k < m; ++k) {
					if(p[k].l < i)break;
					else {
						if(p[k].r <= j)ans[i][j]++;
					}
				}
			}
		}
		for(int i = 0; i < q; ++i) {
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();
			System.out.println(ans[p1][q1]);
		}
		
		sc.close();

		System.out.println();
	}

}
