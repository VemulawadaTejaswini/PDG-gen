import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new HashSet<>();
		Set<Integer> tars = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if (set.contains(tmp)) {
				tars.add(tmp);
			}
			set.add(tmp);
		}

		long ans = 0;
		int count = 0;
		if (tars.size() >= 2) {
			ans = 1;
		}
		for (int i : tars) {
			if (count >= tars.size() - 2) {
				ans *= i;
			}
			count++;
		}

		System.out.println(ans);
	}
}
