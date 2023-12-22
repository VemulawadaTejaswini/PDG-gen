import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// N, Mを取得
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n_m = in.readLine();

		// 半角スペースで区切られたn, mを取得
		int spaceIndex = n_m.indexOf(" ");
		int m = Integer.parseInt(n_m.substring(spaceIndex + 1));

		// 各パワーを取得
		String powers = in.readLine();
		String[] powerArray = powers.split(" ");

		// 取得したパワーを昇順にソート
		List<Integer> powerListAsc = new ArrayList<>();
		for (String power : powerArray) {
			powerListAsc.add(Integer.parseInt(power));
		}
		Collections.sort(powerListAsc);

		// 取得したパワーを降順にソート
		List<Integer> powerList = new ArrayList<>();
		for (int i = 0; i < powerListAsc.size(); i++) {
			powerList.add(powerListAsc.get(powerListAsc.size() - (i + 1)));
		}

		/*
		 * 幸福度を最大にするため、握手は下記の順序で行う
		 * (1)両手でパワーが一番大きい人とする
		 * (2)右手でパワーが一番大きい人、左手でパワーが二番目に大きい人とする
		 * (3)左手でパワーが一番大きい人、右手でパワーが二番目に大きい人とする
		 * (4)両手でパワーが二番目に大きい人とする
		 * (5)右手でパワーが二番目に大きい人、左手でパワーが三番目に大きい人とする
		 * (6)左手でパワーが二番目に大きい人、右手でパワーが三番目に大きい人とする
		 *
		 */
		int happiness = 0;

		// 3セットをカウントする
		int counter = 1;
		// 握手をm回行い幸福度を上げる
		for (int i = 0; i < m;) {

			// 両手で握手したことがない一番強い人とその次に強い人のパワーを取得
			int power1 = powerList.get(i);
			int power2 = powerList.get(i + 1);

			// 1セット目は両手でパワーが一番大きい人とする
			if (counter == 1) {

				happiness += power1 + power1;
				i++;

				// 2セット目は右手でパワーが一番大きい人、左手でパワーが二番目に大きい人とする
			} else if (counter == 2) {

				happiness += power1 + power2;
				i++;

				// 3セット目は左手でパワーが一番大きい人、右手でパワーが二番目に大きい人とする
			} else if (counter == 3) {

				happiness += power2 + power1;
				i++;

			} else {
				counter = 1;
				i++;
				break;
			}
		}

		// 最終的な幸福度の最大値を出力
		System.out.println(happiness);
	}

}
