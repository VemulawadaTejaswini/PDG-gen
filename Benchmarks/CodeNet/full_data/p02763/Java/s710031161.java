import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		String S = scanner.next();
		final int Q = scanner.nextInt();

		int type, l, r;
		Set set = new HashSet();

		for (int i = 0; i < Q; i++) {
			type = scanner.nextInt();
			if (type == 1) {
				l = scanner.nextInt();
				S = S.substring(0, l - 1) + scanner.next() + S.substring(l);
			} else if (type == 2) {
				l = scanner.nextInt();
				r = scanner.nextInt();
				set.clear();
				for (int j = l - 1; j < r; j++) {
					set.add(S.charAt(j));
				}
				System.out.println(set.size());
			}
		}

	}
}