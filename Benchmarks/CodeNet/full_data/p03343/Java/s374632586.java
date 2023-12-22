import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			scanner.nextInt();
			int q = scanner.nextInt();

			List<Long> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(scanner.nextLong());
			}

			Collections.sort(list);

			long min = list.get(0);
			long max = min;
			if (q > 1) {
				max = list.get(q - 1);
			}

			System.out.println(max - min);
		}
	}
}
