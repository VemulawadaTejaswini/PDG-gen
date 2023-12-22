import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input1 = bf.readLine().split(" ");
			int n = Integer.parseInt(input1[0]);
			int m = Integer.parseInt(input1[1]);

			// 電球に紐づくスイッチの番号をbitで保持
			// ※スイッチの数が10、紐づくスイッチが1, 3, 5　→　"0000010101"
			BitSet[] switchConv = new BitSet[m + 1];
			for (int i = 1; i <= m; i++) {
				String[] input2 = bf.readLine().split(" ");
				int k = Integer.parseInt(input2[0]);
				switchConv[i] = new BitSet(n);
				for (int j = 0; j < k; j++) {
					switchConv[i].set(Integer.parseInt(input2[j + 1]) - 1);
				}
			}

			// 各電球ごとの点灯判断となるp値を保持
			int[] p = new int[m + 1];
			String[] input3 = bf.readLine().split(" ");
			for (int i = 1; i <= m; i++) {
				p[i] = Integer.parseInt(input3[i - 1]);
			}

			// スイッチのonoff状況を全件探索して、全点灯する組み合わせを数える
			int cnt = 0;
			double max = Math.pow(2, n);
			for (int i = 0; i < max; i++) {
				BitSet bitS = new BitSet(n);
				String onoff = Integer.toBinaryString(i);
				int bitNum = onoff.length() - 1;
				for (int j = bitNum; j >= 0; j--) {
					int bit = Integer.parseInt(onoff.substring(j, j + 1));
					if (bit == 1) {
						bitS.set(bitNum - j);
					}
				}
				boolean result = true;
				for (int j = 1; j <= m; j++) {
					BitSet clone = (BitSet) switchConv[j].clone();
					clone.and(bitS);
					if (p[j] != clone.cardinality() % 2) {
						result = false;
						break;
					}
				}
				if (result) {
					cnt++;
				}
			}

			System.out.println(cnt);
		} catch (Exception e) {
		}
	}
}
