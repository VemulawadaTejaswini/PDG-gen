import java.util.*;

public class Main {

	static int H;
	static int W;
	static boolean[][] obs;

	// 移動4方向のベクトル
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		obs = new boolean[H][W]; // 障害物
		for (int i = 0; i < H; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (c[j] == '#') {
					obs[i][j] = true;
				} else {
					obs[i][j] = false;
				}
			}
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				// 障害物がなかったら探索
				if (!obs[i][j]) {
					max = Math.max(max, countLamp(i, j));
				}
			}
		}
		System.out.println(max);
	}

	public static int countLamp(int h, int w) {
		int cnt = 1; // 自分の点
		// 4方向をループする
		for (int i = 0; i < 4; i++) {
			// 移動先の点
			int nx = h + dx[i];
			int ny = w + dy[i];
			// 行けるところまで行く
			while (true) {
				if (nx < 0 || ny < 0 || nx >= H || ny >= W || obs[nx][ny]) {
					break;
				}
				cnt++;
				if (i == 0) {
					nx++;
				} else if (i == 1) {
					ny++;
				} else if (i == 2) {
					nx--;
				} else {
					ny--;
				}
			}
		}
		return cnt;
	}
}
