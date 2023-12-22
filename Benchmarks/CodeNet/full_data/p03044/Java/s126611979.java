import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //頂点の数
		int[] ans = new int[N];

		int distmap[][] = new int[N][N];

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if (i == j) {
					distmap[i][j] = 0;
				} else {
					distmap[i][j] = Integer.MAX_VALUE /2;
				}
			}
		}

		for(int i = 0; i < N - 1; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;
			int dist = sc.nextInt();

			distmap[start][end] = distmap[end][start] = dist;
		}

		ans[0] = 0;//1つめは白

		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				if (distmap[i][j] % 2 != 0) { //奇数なら。
					if (ans[i] == 0) {
						ans[j] = 1;
					} else {
						ans[j] = 0;
					}
				} else {
					ans[j] = 0; //どちらでもよい
				}
			}
		}

		//答えの出力
		for (int num : ans) {
			System.out.println(num);
		}
	}
}