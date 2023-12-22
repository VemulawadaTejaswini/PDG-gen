import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> t = new ArrayList<>();
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			t.add(scanner.nextInt());
			a.add(scanner.nextInt());
		}

		for (int i = 0; i < n - 1; i++) {
			int nextT = t.get(i + 1);
			int nextA = a.get(i + 1);
			if (!(t.get(i) < t.get(i + 1) && a.get(i) < a.get(i + 1))) {
				for (int j = 1; j < Math.pow(10, 18); j++) {
					t.set(i + 1, nextT * j);
					a.set(i + 1, nextA * j);
					if (t.get(i) <= t.get(i + 1) && a.get(i) <= a.get(i + 1)) {
						break;
					}
				}
			}
		}

		System.out.println(t.get(n - 1) + a.get(n - 1));

	}
}
