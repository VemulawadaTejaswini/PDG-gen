import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	private static String S;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		S = sc.next();

		Map<Character, List<Integer>> idxMap = new HashMap<>();
		for (int i=0; i<N; i++) {
			char c = S.charAt(i);
			List<Integer> l = idxMap.get(c);
			if (l == null) {
				l = new ArrayList<>();
				idxMap.put(c, l);
			}
			l.add(i);
		}

		int max = 0;
		for (Entry<Character, List<Integer>> entry : idxMap.entrySet()) {
			if (entry.getValue().size() > 1) {
				max = Math.max(search(entry.getValue(), 1), max);
			}
		}
		
		System.out.println(max);
	}
	
	private static int search(List<Integer> list, int count) {
		Map<Character, List<Integer>> map = new HashMap<>();
		for (int i=0; i<list.size(); i++) {
			int idx = list.get(i);
			if (i < list.size() - 1) {
				if (idx + count == list.get(i + 1)) {
					continue;
				}
			}
			if (idx < S.length() - 1) {
				char next = S.charAt(idx + 1);
				List<Integer> l = map.get(next);
				if (l == null) {
					l = new ArrayList<>();
					map.put(next, l);
				}
				l.add(idx + 1);
			}
		}
		int max = count;
		for (Entry<Character, List<Integer>> entry : map.entrySet()) {
			if (entry.getValue().size() > 1) {
				max = Math.max(search(entry.getValue(), count + 1), max);
			}
		}
		return max;
	}
}