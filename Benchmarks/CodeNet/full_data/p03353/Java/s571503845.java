import java.util.*;
import static java.lang.Math.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(findSubstring(scanString(), scanInt()));
	}
	
	private static String findSubstring(String s, int K) {
		String last = "";
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < s.length(); ++i) {
			if (!last.isEmpty() && last.charAt(0) < s.charAt(i)) {
				continue;
			}
			int jj = Math.min(s.length(), i + K);
			for (int j = i + 1; j <= jj; ++j) {
				set.add(s.substring(i, j));
				last = trim(K, set);
			}
		}
		return set.last();
	}

	private static String trim(int K, TreeSet<String> set) {
		String last = "";
		while(K < set.size()) {
			last = set.pollLast();
		}
		return last;
	}
	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
