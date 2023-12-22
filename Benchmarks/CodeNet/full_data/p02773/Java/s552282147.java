import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			set.add(s[i]);
			map.put(s[i], 0);
		}

		for (int i = 0; i < n; i++) {
			int v = map.get(s[i]);
			map.put(s[i], ++v);
		}

		int max = 1;
		for (String key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
			}
		}

		Set<String> tSet = new TreeSet<>();
		for (String key : map.keySet()) {
			if (map.get(key) == max) {
				tSet.add(key);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String string : tSet) {
			sb.append(string);
			sb.append('\n');
		}

		System.out.println(sb.toString());
	}


}
