import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int K = s.nextInt();
			final String S = s.next();
			List<Integer> list = new ArrayList<>();
			char c = '1';
			int n = 0;
			for (int i = 0; i < N; i++) {
				if (c != S.charAt(i)) {
					list.add(n);
					c = S.charAt(i);
					n = 1;
				} else {
					n++;
				}
			}
			list.add(n);

			int ret = 0;
			for (int i = 0; i < list.size(); i += 2) {
				int END = i + 2 * K;
				int sum = 0;
				for (int j = i; j < list.size() && j <= END; j++) {
					sum += list.get(j);
				}
				ret = Math.max(ret, sum);
			}

			System.out.println(ret);
		}
	}
}
