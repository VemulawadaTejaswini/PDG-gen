import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> first = new ArrayList<>();
		List<Integer> last = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int tmp1 = scanner.nextInt();
			int tmp2 = scanner.nextInt();
			if (tmp1 == 1) {
				first.add(tmp2);
			} else if (tmp2 == n) {
				last.add(tmp1);
			}
		}

		for (int i : first) {
			for (int j : last) {
				if (i == j) {
					System.out.println("POSSIBLE");
					return;
				}
			}
		}

		System.out.println("IMPOSSIBLE");
		
	}
}
