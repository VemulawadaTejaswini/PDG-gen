import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();

		TreeMap<Character, Integer> map = new TreeMap<>();
		TreeMap<String, Integer> ansMap = new TreeMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, cnt+1);
			} else {
				map.put(c, 0);
			}
		}


		char c = map.firstKey();
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i))  {
				for (int j = 1; j <= K; j++) {
					if (i + j > s.length()) {
						break;
					}
					String can = s.substring(i, i+j);
					if (ansMap.containsKey(can)) {
						int cnt = ansMap.get(can);
						ansMap.put(can, cnt+1);
					} else {
						ansMap.put(can, 0);
					}
				}

			}
			int idx =0;

			if (ansMap.size()<K && i == s.length()-1 ) {
				for (Map.Entry<Character, Integer> e : map.entrySet()) {
					if (idx == 1) {
						c = e.getKey();
						break;
					}
					idx++;
				}
				i=0;
			}
		}
		int cnt = 0;
		String ans = "";
		for (Map.Entry<String, Integer> e : ansMap.entrySet()) {
			cnt++;
			if (cnt == K) {
				ans = e.getKey();
			}
		}
		System.out.println(ans);
	}
}
