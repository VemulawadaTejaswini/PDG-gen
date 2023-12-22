import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Operation {
		public int srcX, srcY, dstX, dstY;

		public Operation(int srcY, int srcX, int dstY, int dstX) {
			this.srcX = srcX;
			this.srcY = srcY;
			this.dstX = dstX;
			this.dstY = dstY;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		int[][] a = new int[H][W];
		int oddNum = 0;
		for (int i = 0; i < H; ++i) {
			tokens = in.nextLine().split(" ");
			for (int j = 0; j < W; ++j) {
				a[i][j] = Integer.parseInt(tokens[j]);
				if (a[i][j] % 2 == 1) {
					oddNum++;
				}
			}
		}
		List<Operation> operations = new ArrayList<>();
		// 奇数の数が奇数個 -> 1つ残る，偶数個 -> 全部偶数になる
		// でも，全部片寄するのでもいい気がする
		for (int i = 0; i + 1 < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (a[i][j] % 2 != 0) {
					// 下に1つ移動する
					operations.add(new Operation(i, j, i + 1, j));
					a[i][j]--;
					a[i + 1][j]++;
				}
			}
		}
		for (int j = 0; j + 1 < W; ++j) {
			if (a[H - 1][j] % 2 != 0) {
				// 右に1つ移動する
				operations.add(new Operation(H - 1, j, H - 1, j + 1));
				a[H - 1][j]--;
				a[H - 1][j + 1]++;
			}
		}
		System.out.println(operations.size());
		for (int i = 0; i < operations.size(); ++i) {
			Operation op = operations.get(i);
			System.out.println((op.srcY + 1) + " " + (op.srcX + 1) + " " + (op.dstY + 1) + " " + (op.dstX + 1));
		}

		in.close();
	}
}