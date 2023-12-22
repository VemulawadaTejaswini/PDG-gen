import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer h = sc.nextInt();
		Integer w = sc.nextInt();
		Integer n = sc.nextInt();
		Integer a, b;
		Map<String, Integer> candidates = new HashMap<>();
		long[] result = new long[10];
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			for (int x = 2; x >= 0; x--) {
				for (int y = 2; y >= 0; y--) {
					if (a - x >= 1 && b - y >= 1 && (a - x + 2) <= h && (b - y + 2) <= w) {
						String key = (a - x) + "+" + (b - y);
						if (candidates.containsKey(key)) {
							candidates.put(key, candidates.get(key) + 1);
						} else {
							candidates.put(key, 1);
						}
					}
				}
			}
		}
		
		result[0] = (long) (h - 2) * (w - 2) - candidates.size();
		for (Map.Entry<String, Integer> candidate : candidates.entrySet()) {
			result[candidate.getValue()]++;
		}
		
		for (int j = 0; j <= 9; j++) {
			System.out.println(result[j]);
		}
	}
}