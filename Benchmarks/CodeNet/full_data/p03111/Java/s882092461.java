import java.util.Scanner;

public class Main {
	private static int[] L;
	private static int N, A, B, C;
	private static int INF = 10000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		System.out.println(dfs(0, 0, 0, 0));
	}

	private static int dfs(int i, int a, int b, int c) {
		//停止条件
		if (i == N) {
			if(a == 0 || b == 0 || c == 0) return INF;	//いずれも一本は必ず使わなければならない
			return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;	//合体してできたa, b, cをA, B, Cにするコスト
		}

		//分岐
		//竹を使わないとき
		int res = dfs(i + 1, a, b, c);
		//A, B, Cを使うとき
		res = Math.min(res, dfs(i + 1, a + L[i], b, c) + 10);
		res = Math.min(res, dfs(i + 1, a, b + L[i], c) + 10);
		res = Math.min(res, dfs(i + 1, a, b, c + L[i]) + 10);

		return res;
	}
}