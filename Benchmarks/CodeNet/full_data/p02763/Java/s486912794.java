import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuilder sb = new StringBuilder(scan.next());
		if (n <= sb.toString().length()) {
			int q = scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < q; i++) {
				int q1 = scan.nextInt();
				if (q1 == 1) {
					int q2 = scan.nextInt();
					String q3 = scan.next();
					sb.replace(q2 - 1, q2, q3);
				} else {
					int q2 = scan.nextInt();
					int q3 = scan.nextInt();
					list.add(count(sb.substring(q2 - 1, q3).toString()));
				}
			}

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		scan.close();
	}

	private static int count(String s) {
		HashSet<Character> set = new HashSet<Character>();
		for (char c : s.toCharArray()) {
			if (!set.contains(c)) {
				set.add(c);
			}
		}

		return set.size();
	}
}
