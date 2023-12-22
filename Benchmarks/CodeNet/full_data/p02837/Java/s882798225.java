import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			Map<Integer, Map<Integer, Integer>> honestMap = new HashMap<>();
			// 証言マップ作製
			for (int i = 1; i <= n; i++) {
				long a = sc.nextLong();
				Map<Integer, Integer> oneMap = new HashMap<>();
				for (long j = 1; j <= a; j++) {
					oneMap.put(sc.nextInt(), sc.nextInt());
				}
				honestMap.put(i, oneMap);
			}
			// 仮定していく
			int result = 0;
			Long max = (long) Math.pow(2, n);
			for (int i = 0; i < max; i++) {
				String bin = Integer.toBinaryString(i);
				bin = String.format("%0" + n + "d", Integer.parseInt(bin));
				boolean isOk = true;
				for (int si = 0; si < bin.length(); si++) {
					if (bin.charAt(si) == '1') {
						for (Entry<Integer, Integer> entry : honestMap.get(si + 1).entrySet()) {
							int search = entry.getKey() - 1;
							int target = Character.getNumericValue(bin.charAt(search));
							if (target != entry.getValue()) {
								isOk = false;
								break;
							}
						}
					}
					if (!isOk) {
						break;
					}
				}
				if (isOk) {
					int candCnt = 0;
					for (int si = 0; si < bin.length(); si++) {
						if (bin.charAt(si) == '1') {
							candCnt++;
						}
					}
					if (result < candCnt) {
						result = candCnt;
					}
				}
			}
			System.out.println(result);
		}
	}
}