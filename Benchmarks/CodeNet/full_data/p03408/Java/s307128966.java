import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		HashSet<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();

		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			set.add(s);
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		}

		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			set.add(s);
			if(map.containsKey(s)) {
				map.put(s, map.get(s)-1);
			} else {
				map.put(s, -1);
			}
		}
		int max = set.stream().mapToInt(e -> map.get(e)).max().getAsInt();
		System.out.println(max < 0 ? 0 : max);
	}
}