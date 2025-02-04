import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 * 解説通りに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			int[] d = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
			int result = 0, sum = 0, r = Math.min(n, k);
			SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i <= r; i++) {
				// iは左側から取り出す数
				if (i > 0) {
					sum += d[i - 1];
					map.put(d[i - 1], map.getOrDefault(d[i - 1], 0) + 1);
				}
//				System.out.println("i=" + i + ", map=" + map);
				if (0 == (i & 1)) {
					// jは右側から取り出す数
					for (int j = 0; j <= r - i; j++) {
						if (j > 0) {
							sum += d[n - j];
							map.put(d[n - j], map.getOrDefault(d[n - j], 0) + 1);
						}
//						System.out.println("i=" + i + ",j=" + j + ", map=" + map);
						result = Math.max(result, checkRemove(sum, map, k - i - j));
//						System.out.println("sum=" + sum + ", result=" + result);
					}
					if (r - i > 0) {
						sum -= d[n - r + i];
						remove(map, d[n - r + i], 1);
					}
				} else {
					// jは右側から取り出す数
					for (int j = r - i; j >= 0; j--) {
						if (j < r - i) {
							sum -= d[n - 1 - j];
							remove(map, d[n - 1 - j], 1);
						}
//						System.out.println("i=" + i + ",j=" + j + ", map=" + map);
						result = Math.max(result, checkRemove(sum, map, k - i - j));
//						System.out.println("sum=" + sum + ", result=" + result);
					}
				}
			}
			System.out.println(result);
		}
	}

	/**
	 * mapからkeyをamount分削除
	 * 
	 * @param map
	 * @param key
	 * @param amount
	 * @return 削除された数
	 */
	private static int remove(SortedMap<Integer, Integer> map, int key, int amount) {
//		System.out.println("key=" + key + ", amount=" + amount);
		int value = map.get(key);
		if (value <= amount) {
			map.remove(key);
			return value;
		} else {
			map.put(key, value - amount);
			return amount;
		}
	}

	/**
	 * 手持ちの宝石の捨てる作業を実施する
	 * 
	 * @param sum    手持ちの宝石の価値の合計
	 * @param map    手持ちの宝石を保存するマップ
	 * @param remain 捨てる宝石の最大値
	 * @return 宝石を捨てた後の手持ちの宝石の価値の合計
	 */
	private static int checkRemove(int sum, SortedMap<Integer, Integer> map, int remain) {
		Map<Integer, Integer> tempMap = new HashMap<>();
//		System.out.println("map=" + map + ", sum=" + sum + ", remain=" + remain);
		while ((!map.isEmpty()) && (remain > 0)) {
			int firstKey = map.firstKey();
//			System.out.println("firstKey=" + firstKey);
			if (firstKey >= 0) {
				break;
			}
			int diff = remove(map, firstKey, remain);
			tempMap.put(firstKey, diff);
			remain -= diff;
//			System.out.println("diff=" + diff + ", map=" + map);
			sum -= firstKey * diff;
		}
		tempMap.entrySet()
				.forEach(entry -> map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue()));
//		System.out.println("map=" + map + ", sum=" + sum);
		return sum;
	}
}
