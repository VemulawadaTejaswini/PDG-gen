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

				findMyRoot(ax, ay);
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

	private static void findMyRoot(int ax, int ay) {

		if (root[ay] == 0) {

			// まだ親が決まっていなければとりあえずaxを親にする
			// ax <- ay
			root[ay] = ax;
		} else if (root[ax] == 0) {

			// ayには親がいる＋axに親がいない場合、ayがaxの親になれるか調べる
			// →　ayの親の系列を辿る中でaxがいなければ親になれる
			// ay <- XX <- XX <- ... <- ax
			boolean isParent = true;
			int child = ay;
			while (root[child] != ax) {
				if (root[child] == 0) {
					isParent = false;
					break;
				}
				child = root[child];
			}
			if (!isParent) {
				root[ax] = ay;
			}
		}
	}
}
