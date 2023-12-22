import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			long k = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}
			List<Long> fn = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				fn.add(sc.nextLong());
			}
			long result = Long.MAX_VALUE;
			while (result != 0) {
				// 昇順ソート
				Collections.sort(an);
				// 降順ソート
				Collections.sort(fn, Comparator.reverseOrder());
				// 最大コスト計算
				long maxCost = 0;
				int idx = 0;
				for (int i = 0; i < an.size(); i++) {
					long cand = an.get(i) * fn.get(i);
					if (maxCost < cand) {
						idx = i;
						maxCost = cand;
					}
				}
				result = maxCost;
				an.set(idx, an.get(idx) - 1);
				k--;
				if (k == 0) {
					break;
				}
			}
			// 昇順ソート
			Collections.sort(an);
			// 降順ソート
			Collections.sort(fn, Comparator.reverseOrder());
			// 最大コスト計算
			long maxCost = 0;
			for (int i = 0; i < an.size(); i++) {
				long cand = an.get(i) * fn.get(i);
				if (maxCost < cand) {
					maxCost = cand;
				}
			}
			result = maxCost;
			// 出力(整数)
			System.out.println(result);
		}
	}
}