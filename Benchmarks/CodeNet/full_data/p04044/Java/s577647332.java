import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			int L = scanner.nextInt();
			// input
			List<String> strings = new ArrayList<String>();
			for (int i = 0; i < N; i++) {
				strings.add(scanner.next());
			}
			// sort・concat
			System.out.println(concatStringOrderbyAsc(strings));
		}
	}

	private static String concatStringOrderbyAsc(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		Collections.sort(strings);

		for (String s : strings) {
			sb.append(s);
		}

		return sb.toString();
	}
}