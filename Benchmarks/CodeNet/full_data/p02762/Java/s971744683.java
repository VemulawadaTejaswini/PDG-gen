import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	static int n;
	static int m;
	static int k;
	static int[][] f;
	static int[][] b;
	static int[] g;
	static int[] v;
	static int[] cnt;
	static int[] subCnt;


	static int label = 0;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		k = scan.nextInt();

		f = new int[n][n];
		b = new int[n][n];
		g = new int[n];
		v = new int[n];
		cnt = new int[n + 1];
		subCnt = new int[n + 1];



		int i,j,tempA,tempB;
		for(i = 0; i < m; i++) {
			tempA = scan.nextInt() - 1;
			tempB = scan.nextInt() - 1;
			f[tempA][tempB] = 1;
			f[tempB][tempA] = 1;
		}

		for(i = 0; i < k; i++) {
			tempA = scan.nextInt() - 1;
			tempB = scan.nextInt() - 1;
			b[tempA][tempB] = 1;
			b[tempB][tempA] = 1;
		}

		for(i = 0; i < n; i++) {
			if(g[i] == 0) {
				label++;
				bfs(i);
			}
		}

		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(i == j)
					continue;

				if((g[i] == g[j] && f[i][j] == 1)
						|| (g[i] == g[j] && b[i][j] == 1))
					subCnt[i]++;

			}
		}
		long ans;
		for(i = 0; i < n; i++) {
			ans = cnt[g[i]] - subCnt[i] - 1;
			System.out.print(ans);
			if(i != n - 1)
				System.out.print(" ");
		}

	}
	public static void bfs(int a) {
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.addFirst(a);
		int i, temp;
		while(!que.isEmpty()) {
			temp = que.pollLast();
			v[temp] = 2;
			g[temp] = label;
			cnt[label]++;
			for(i = 0; i < n; i++) {
				if(f[temp][i] == 1 && v[i] == 0) {
					que.addFirst(i);
					v[i] = 1;
				}
			}
		}
	}
}