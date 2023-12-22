import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		NavigableMap<Integer, Integer> s = new TreeMap();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (s.isEmpty()) {
				s.put(a, 1);
				continue;
			}
			if (s.firstEntry().getKey() >= a) {
				s.put(a, s.getOrDefault(a, 0) + 1);
			} else {
				int v = s.lowerEntry(a).getValue();
				if (v > 1) {
					s.put(s.lowerEntry(a).getKey(), v - 1);
				} else {
					s.remove(s.lowerEntry(a).getKey());
				}
				if (s.containsKey(a)) {
					s.put(a, s.get(a) + 1);
				} else {
					s.put(a, 1);
				}
			}
		}

		int count = 0;
		for (Map.Entry<Integer, Integer> i : s.entrySet()) {
			count += i.getValue();
		}

		System.out.println(count);
	}
}
