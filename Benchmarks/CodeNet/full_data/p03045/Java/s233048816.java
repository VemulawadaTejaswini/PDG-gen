import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	private static int[] root;

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input1 = bf.readLine().split(" ");
			int n = Integer.parseInt(input1[0]);
			int m = Integer.parseInt(input1[1]);

			// 計算式で結ばれているものは、Ax、Ayいずれか一つが分かればもう片方も分かる
			// 与えられた計算式からその親子関係をまとめる
			root = new int[n + 1];
			for (int i = 1; i <= m; i++) {
				String[] input2 = bf.readLine().split(" ");
				int ax = Integer.parseInt(input2[0]);
				int ay = Integer.parseInt(input2[1]);
				int z = Integer.parseInt(input2[1]);

				if (root[ay] == 0) {

					// Ax <- Ay
					root[ay] = ax;
				} else if (root[ax] == 0) {

					// (? <- ... <-) Ay <- Ax
					int ayP = findMyRoot(ay);
					if (ayP != ax) {
						root[ax] = ay;
					}
				} else {

					// (? <- ... <-) Ax <- Ay (<- ... <- ?)
					int axP = findMyRoot(ax);
					int ayP = findMyRoot(ay);
					if (axP != ayP) {
						root[ayP] = ax;
					}
				}
			}

			// めくる必要がある回数を数える
			int cnt = 0;
			for (int i = 1; i < root.length; i++) {
				if (root[i] == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		} catch (IOException e1) {
		}
	}

	private static int findMyRoot(int child) {

		if (root[child] == 0) {
			return child;
		} else {
			return findMyRoot(root[child]);
		}
	}
}
