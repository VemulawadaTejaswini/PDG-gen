import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			int result = 0;
			Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				String ist = String.valueOf(i);
				int first = Integer.parseInt(ist.substring(0, 1));
				int last = Integer.parseInt(ist.substring(ist.length() - 1, ist.length()));
				Map<Integer, Integer> innerMap = map.get(first);
				if (innerMap == null) {
					innerMap = new HashMap<>();
					map.put(first, innerMap);
				}
				if (innerMap.get(last) == null) {
					innerMap.put(last, 0);
				}
				innerMap.put(last, innerMap.get(last) + 1);
			}
			for (Entry<Integer, Map<Integer, Integer>> entry : map.entrySet()) {
				for (Entry<Integer, Integer> innerEntry : entry.getValue().entrySet()) {
					if (map.get(innerEntry.getKey()) != null) {
						Integer wkValue = map.get(innerEntry.getKey()).get(entry.getKey());
						if (wkValue != null) {
							result = result + (innerEntry.getValue() * wkValue);
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}