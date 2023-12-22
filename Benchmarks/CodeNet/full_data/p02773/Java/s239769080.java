import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();

		int max = 0;
		for(int i = 0; i < n; i++) {
			String s = sc.next();

			Integer nowCount = map.get(s);
			Integer newCount = null;
			if(nowCount == null) {
				newCount = 1;
			} else {
				newCount = nowCount + 1;
			}

			map.put(s, newCount);
			max = Math.max(max, newCount);
		}

		Set<String> set = new TreeSet<>();
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(max == entry.getValue()) {
				set.add(entry.getKey());
			}
		}

		for(String name : set) {
			System.out.println(name);
		}
	}
}
