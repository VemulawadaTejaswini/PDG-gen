import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		Map<Character, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < T.length(); i++) {
			char c = T.charAt(i);
			if (!map.containsKey(c)) {
				List<Integer> indexes = new ArrayList<>();
				indexes.add(i);
				map.put(c, indexes);
			} else {
				List<Integer> indexes = map.get(c);
				indexes.add(i);
			}
		}
		
		for (List<Integer> indexes :map.values()) {
			char c = S.charAt(indexes.get(0));
			for (int i = 1; i < indexes.size(); i++) {
				if (c != S.charAt(indexes.get(i))) {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
}