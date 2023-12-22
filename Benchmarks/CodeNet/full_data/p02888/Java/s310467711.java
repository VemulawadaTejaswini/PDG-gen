import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int l = scanner.nextInt();
				map.put(l, map.getOrDefault(l, 0) + 1);
			});
			int count = 0;
			int[] l = map.keySet().stream().mapToInt(integer -> integer.intValue()).toArray();
			for (int i = 0; i < l.length; i++) {
				for (int j = i + 1; j < l.length; j++) {
					if (i != j) {
						for (int k = j + 1; k < l.length; k++) {
							if ((i != k) && (j != k)) {
								if ((l[i] < l[j] + l[k]) && (l[j] < l[i] + l[k]) && (l[k] < l[i] + l[j])) {
									count += map.get(l[i]) * map.get(l[j]) * map.get(l[k]);
								}
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
