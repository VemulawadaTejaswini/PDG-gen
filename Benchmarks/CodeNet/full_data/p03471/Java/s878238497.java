import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		List<Integer> result = new ArrayList<Integer>();
		boolean hasItem = false;

		// 10000円札の枚数
		for (int i = 0; i < n; i++) {

			// 5000円札の枚数
			for (int j = 0; j < n - i; j++) {

				int total = 10000 * i + 5000 * j + 1000 * (n - i - j);

				if (total == y) {
					System.out.println(i + " " + j + " " + (n - i - j));
					hasItem = true;
					break;
				}

			}

			if (hasItem) {
				break;
			}
		}

		if (!hasItem) {
			System.out.println("-1 -1 -1");
		}

	}
}
