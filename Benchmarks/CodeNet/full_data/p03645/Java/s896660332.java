import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		List<Integer> j = new ArrayList<>();
		boolean judge = true;

		for (int i = 0; i < m; i++) {
			int tmp1 = scanner.nextInt();
			int tmp2 = scanner.nextInt();
			if (tmp1 == 1 && judge) {
				if (j.contains(tmp2)) {
					judge = false;
				}
				j.add(tmp2);
			} else if (tmp2 == n && judge) {
				if (j.contains(tmp1)) {
					judge = false;
				}
				j.add(tmp1);
			}
		}
		
		if (judge) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println("POSSIBLE");
		}

	}
}
