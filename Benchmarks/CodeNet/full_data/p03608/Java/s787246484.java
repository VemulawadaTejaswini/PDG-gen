import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int R;
	static int r[] = new int[8];
	static int res = (int) Float.POSITIVE_INFINITY;
	static int d[][] = new int[200][200];
	static boolean used[] = new boolean[8];

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					d[i][j] =100000;
				}
			}
		}

		int A[] = new int[M];
		int B[] = new int[M];
		int C[] = new int[M];

		for (int i = 0; i < R; i++) {
			r[i] = sc.nextInt()-1;
		}
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			C[i] = sc.nextInt();

			if (d[A[i]][B[i]] > C[i]) {
				d[A[i]][B[i]] = C[i];
				d[B[i]][A[i]] = C[i];
			}
		}

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}
				}
			}
		}

		dfs(0, -1, 0);

		System.out.println(res);

	}

	static void dfs(int c, int las, int dist) {
		if (c == R) {// c=通った目的地の数
			if (res > dist)res = dist;// res=出力、dist=ある経路での距離
			return;
		}
		for (int i = 0; i < R; i++) {
			if (!used[i]) {// すでに通った目的地は除く
				used[i] = true;// 今から通る目的地にフラグ
				if (las == -1)
					dfs(c + 1, i, 0);// 次の目的地へ、一つ目を選んだ時点ではdist=0
				else
					dfs(c + 1, i, dist + d[r[las]][r[i]]);// 次の目的地へ、dist=ここまでの距離
				used[i] = false;
			}
		}
	}

}
