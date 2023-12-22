import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		String[] s = w.split("");
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length; i++) {
			String target = s[i];
			if (map.containsKey(target)) {
				map.put(target, map.get(target) + 1);
			} else {
				map.put(target, 1);
			}
		}

		for (int i : map.values()) {
			if (i % 2 != 0) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}