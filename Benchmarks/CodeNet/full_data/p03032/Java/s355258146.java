import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			Deque<Integer> deque = new ArrayDeque<>();
			IntStream.range(0, n).forEach(i -> deque.add(scanner.nextInt()));
			System.out.println(getResult(0, k, deque, new TreeMap<>()));
		}
	}

	/**
	 * 操作終了後に持っている宝石の価値の合計の最大値を計算する
	 * 
	 * @param current 現在の操作数
	 * @param k       総操作数
	 * @param deque   宝石のdequeue
	 * @param map     手持ちの宝石を表すマップ
	 * @return 操作終了後に持っている宝石の価値の合計の最大値
	 */
	private static int getResult(int current, int k, Deque<Integer> deque, SortedMap<Integer, Integer> map) {
		if (current == k) {
			return map.entrySet().stream().mapToInt(entry -> entry.getKey() * entry.getValue()).sum();
		}
		int max = Integer.MIN_VALUE;
		if (!deque.isEmpty()) {
			// 左から一つ取り出す
			int first = deque.pollFirst();
			map.put(first, map.getOrDefault(first, 0) + 1);
			max = Math.max(max, getResult(current + 1, k, deque, map));
			deque.addFirst(first);
			int count = map.get(first);
			if (1 == count) {
				map.remove(first);
			} else {
				map.put(first, count - 1);
			}

			if (deque.size() > 1) {
				// 右から一つ取り出す
				int last = deque.pollLast();
				map.put(last, map.getOrDefault(last, 0) + 1);
				max = Math.max(max, getResult(current + 1, k, deque, map));
				deque.addLast(last);
				count = map.get(last);
				if (1 == count) {
					map.remove(last);
				} else {
					map.put(last, count - 1);
				}
			}
		}
		if (!map.isEmpty()) {
			// 持っている価値の一番低い宝石
			int minV = map.firstKey();
			int count = map.get(minV);
			if (1 == count) {
				map.remove(minV);
			} else {
				map.put(minV, count - 1);
			}
			// 左側から追加
			deque.addFirst(minV);
			max = Math.max(max, getResult(current + 1, k, deque, map));
			deque.pollFirst();
			// 右側から追加
			deque.addLast(minV);
			max = Math.max(max, getResult(current + 1, k, deque, map));
			deque.pollLast();
			map.put(minV, map.getOrDefault(minV, 0) + 1);
		}
		// 何もしない
		return Math.max(max, getResult(current + 1, k, deque, map));
	}
}
