import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> oddMap = new HashMap<>(), evenMap = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int v = scanner.nextInt();
				if (0 == (i & 1)) {
					evenMap.put(v, evenMap.getOrDefault(v, 0) + 1);
				} else {
					oddMap.put(v, oddMap.getOrDefault(v, 0) + 1);
				}
			});
			// 最大値の数字が同じ場合、どちらかを削除する
			Entry<Integer, Integer> evenMax = evenMap.entrySet().stream()
					.max((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
			Entry<Integer, Integer> oddMax = oddMap.entrySet().stream()
					.max((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
			if (evenMax.getKey() == oddMax.getKey()) {
				if (evenMax.getValue() >= oddMax.getValue()) {
					oddMap.remove(oddMax.getKey());
				} else {
					evenMap.remove(evenMax.getKey());
				}
			}
			System.out.println(n - evenMap.values().stream().mapToInt(Integer::intValue).max().orElse(0)
					- oddMap.values().stream().mapToInt(Integer::intValue).max().orElse(0));
		}
	}
}
