import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];

		List<TreeMap<Character, Integer>> list = new ArrayList<>();

		Map<Map<Character, Integer>, Integer> pmap = new HashMap<Map<Character, Integer>, Integer>();

		for (int i = 0; i < N; i++) {
			s[i] = sc.next();

			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

			for (int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			if (pmap.containsKey(map)) {
				pmap.put(map, pmap.get(map) + 1);
			} else {
				pmap.put(map, 1);
			}
		}

		long cnt = 0;
		for(Integer e : pmap.values()) {
			if (e > 1) {
				cnt += e*(e-1)/2;
			}
		}

		System.out.println(cnt);
	}
}