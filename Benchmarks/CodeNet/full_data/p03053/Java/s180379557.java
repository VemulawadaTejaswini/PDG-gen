import java.util.Scanner;

public class Main {
	static int H, W;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		String[][] A = new String[H][W];
		for (int i = 0; i < H; i++) {
			String a = sc.next();
			String[] array = a.split("");
			for (int j = 0; j < W; j++) {
				A[i][j] =  array[j];
			}
		}
		int count = 0;
		// arrayのコピーを作成
		String[][] copy = new String[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				copy[i][j] = A[i][j];
			}
		}

		boolean check = true;
		while (true) {
			// if (check(A)) {
			if (check) {
				check = false;
				count++;
				// 黒を見つける
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (A[i][j].equals("#")) {
							// 入れ替える要素の数iとかをだす(配列ないか見る）
							int a = i-1;
							int a2 = i+1;
							int b = j-1;
							int b2 = j+1;

							// 入れ替える
							if (hight(a) && A[a][j].equals(".")) { // 上
								check = true;
								copy[a][j] = "#";
							}
							if (hight(a2) && A[a2][j].equals(".")) { // 下
								check = true;
								copy[a2][j] = "#";
							}
							if (weight(b) && A[i][b].equals(".")) { // 左
								check = true;
								copy[i][b] = "#";
							}
							if (weight(b2) && A[i][b2].equals(".")) {
								check = true;
								copy[i][b2] = "#";
							}
						}
					}
				}
				// A配列をコピー配列に
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						A[i][j] = copy[i][j];
					}
				}

			} else {
				break;
			}
		}
		count--;
		System.out.println(count);

	}
	private static boolean check(String[][] array) {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				String a = array[i][j];
				if (a.equals(".")) {
					return true;
				}
			}
		}
		return false;
	}
	private static boolean hight(int a) {
		if (a < 0 || a >= H) {
			return false;
		} else {
			return true;
		}
	}
	private static boolean weight(int b) {
		if (b < 0 || b >= W) {
			return false;
		} else {
			return true;
		}
	}
}