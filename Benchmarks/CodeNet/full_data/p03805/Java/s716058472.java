import java.util.Scanner;

public class Main {

	static boolean[][] connect;
	static boolean[] visited;
	static int total_paths;

	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int[][] lines = new int[M][2];
		for (int i = 0; i < M; i++) {
			int[] temp = new int[2];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			lines[i] = temp;
		}
		// つながりを作成
		connect = new boolean[N][N];
		for (int i = 0; i < M; i++) {
			// 無向グラフだから双方のパスを作成する
			connect[lines[i][0] - 1][lines[i][1] - 1] = true;
			connect[lines[i][1] - 1][lines[i][0] - 1] = true;
		}

		// visitedを初期化
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			visited[i] = false;
		}
		int ret = dfs(0, 0);
		System.out.println(ret);
	}

	public static int dfs(int now, int depth) {
		// 訪問済みならこのルートはあり得ないので返却
		if (visited[now]) {
			return 0;
		}
		// 最深部まで探索した場合
		if (depth == N - 1) {
			return 1;
		}
		// 探索済みにする
		visited[now] = true;
		total_paths = 0;
		// 経路を検索し現在のノードからの道があれば再帰する
		for (int i = 0; i < N; i++) {
			if (connect[now][i]) {
				total_paths += dfs(i, depth + 1);
			}
		}
		// 経路が存在しなければfalseにする
		visited[now] = false;
		// 返却
		return total_paths;
	}

}