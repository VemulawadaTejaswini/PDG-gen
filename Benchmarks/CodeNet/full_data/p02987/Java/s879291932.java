import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sysin = new Scanner(System.in);
		final String s = sysin.next();
		sysin.close();

		Map<Character, Integer> chars = new HashMap<>();
		for (char c : s.toCharArray()) {
			int i = chars.containsKey(c) ? chars.get(c) : 0;
			chars.put(c, i + 1);
		}


		System.out.println(
			chars.entrySet().stream()
			.mapToInt(Entry<Character, Integer>::getValue)
			.allMatch(i -> i == 2) ? "Yes" : "No"
		);
	}
}
