import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];

		Map<Map<Character, Integer>, Integer> pmap = new HashMap<Map<Character, Integer>, Integer>();

		for (int i = 0; i < N; i++) {
			s[i] = sc.next();

			Map<Character, Integer> map = new HashMap<Character, Integer>();

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
			cnt += e*(e-1)/2;
		}

		System.out.println(cnt);
	}
}