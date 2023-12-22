import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// クソコード

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(7);
		nums.add(11);

		int so = 12;

		for (int i = 5; i < n; i++) {
			while (true) {
				so++;
				boolean sosuflag = true;
				for (int j = 2; j < so; j++) {
					if (so % j == 0) {
						sosuflag = false;
						break;
					}
				}
				if (sosuflag) {
					nums.add(so);
					break;
				}
			}

		}

		// シャッフル
		Collections.shuffle(nums);

		label: while (true) {
			for (int i = 0; i < n - 4; i++) {
				int sum = 0;
				for (int j = 0; j < 5; j++) {
					sum += nums.get(i);
				}
				for (int j = 2; j <= sum - 1; j++) {
					if (sum % j == 0) {
						break label;
					}
				}

			}
			so = refleshsosu(nums, so);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(nums.get(i) + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);

	}

	// ランダムで1つ削って1つ追加
	private static int refleshsosu(ArrayList<Integer> list, int so) {
		list.remove(list.size() - 1);
		while (true) {
			so++;
			boolean sosuflag = true;
			for (int j = 2; j < so; j++) {
				if (so % j == 0) {
					sosuflag = false;
					break;
				}
			}
			if (sosuflag) {
				list.add(so);
				break;
			}
		}
		return so;
	}

}