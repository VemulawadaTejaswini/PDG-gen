import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<Integer>();

		int b = 0;

		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}

		for (int i = 0; i < n - 1;) {

			if (i >= a.size()) {
				break;
			}

			if (b >= n - 1) {
				b = -1;
				break;
			}

			if (i + 1 != a.get(i)) {
				a.remove(i);
				b++;
			} else {
				i++;
			}

		}

		System.out.println(b);

	}

}
