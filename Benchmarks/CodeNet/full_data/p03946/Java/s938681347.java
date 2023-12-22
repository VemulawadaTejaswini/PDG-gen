import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int townNum = Integer.parseInt(inputs[0]);

		inputs = br.readLine().split(" ");
		int[] pricesByTown = new int[townNum];
		// 入力をintへパース
		for (int i = 0; i < townNum; i++) {
			pricesByTown[i] = Integer.parseInt(inputs[i]);
		}

		int maxProfit = 0;
		int actionNum = 1;
		int maxPrice = 0;

		for (int i = 0; i < townNum; i++) {
			if (maxPrice < pricesByTown[i]) {
				maxPrice = pricesByTown[i];
			}
		}

		// リンゴを買うと最も儲かる街を探す
		for (int i = 0; i < townNum; i++) {
			// 現在の町よりも後の町から売値が最大になる街を探す
			if (maxPrice == pricesByTown[i]) {
				maxPrice = 0;
				for (int j = i + 1; j < townNum; j++) {
					if (maxPrice < pricesByTown[j]) {
						maxPrice = pricesByTown[j];
					}
				}
				continue;
			}
			int maxProfit_temp = maxPrice - pricesByTown[i];

			if (maxProfit < maxProfit_temp) {
				maxProfit = maxProfit_temp;
				actionNum = 1;
				// 最も儲かる街が複数ある場合、「操作」の回数が増える
			} else if (maxProfit == maxProfit_temp) {
				actionNum++;
			}
		}
		System.out.println(actionNum);
	}

}
