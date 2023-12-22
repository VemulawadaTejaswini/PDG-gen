import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String[] input = str.split("");
		// String result = "";

		StringBuilder sb = new StringBuilder();
		sb.append("");

		for (int i = 0; i < n; i++) {
			if (sb.length() == 0) {
			// if (result.isEmpty()) {
				// result += input[i];
				sb.append(input[i]);
				continue;
			}

			if (input[i].equals(input[i-1])) {
				continue;
			}
			sb.append(input[i]);
			// result += input[i];
		}

		// System.out.println(result.length());
		System.out.println(sb.length());

	}
}
