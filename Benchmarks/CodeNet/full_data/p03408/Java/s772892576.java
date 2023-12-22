import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<>();
		for (int i = 0 ; i < n ; i++) {
			String key = sc.next();
			if (map.keySet().contains(key)) map.put(key, map.get(key) + 1);
			else map.put(key, 1);
		}
		int m = sc.nextInt();
		for (int i = 0 ; i < m ; i++) {
			String key = sc.next();
			if (map.keySet().contains(key)) map.put(key, map.get(key) - 1);
			else map.put(key, -1);
		}
		int n2 = 0;
		for (int i = 0 ; i < map.size() ; i++) {
			int val = (int)map.values().toArray()[i];
			if (n2 < val) {
				n2 = val;
			}
		}
		System.out.println(n2);
	}
}
