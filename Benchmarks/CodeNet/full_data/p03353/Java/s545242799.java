import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
		int K = scanner.nextInt();
		System.out.println(genSubstring(s).toArray()[K-1]);
	}

	public static TreeSet<String> genSubstring(String s) {
		TreeSet<String> set = new TreeSet<>();
		TreeSet<String> firstFiveInitialSet = new TreeSet<>();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (firstFiveInitialSet.size()<=5) {
				for (int j = i+1; j<=n; j++) {
					set.add(s.substring(i, j));
				}
			} else if ((s.substring(i, i).compareTo(firstFiveInitialSet.last()) <= 0)) {
				firstFiveInitialSet.remove(firstFiveInitialSet.last());
				firstFiveInitialSet.add(s.substring(i, i));
				for (int j = i + 1; j <= n; j++) {
					set.add(s.substring(i, j));
				}
			}
		}
		return set;
	}
}