import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc157/tasks/abc157_c
 *
 */
public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int scale = scanner.nextInt();
			int max = scanner.nextInt();

			if (max == 0) {
				System.out.println("0");
				return;
			}

			int[] values = new int[scale];
			for (int i = 0; i < values.length; i++) {
				values[i] = -1;
			}

			for (int i = 0; i < max; i++) {
				int s = scanner.nextInt() - 1;
				int c = scanner.nextInt();

				if (values[s] == -1) {
					values[s] = c;
				} else if (values[s] != c) {
					System.out.println("-1");
					return;
				} else {
					values[s] = c;
				}
			}

			if (values[0] == 0) {
				System.out.println("-1");
				return;
			}

			for (int i = 0; i < values.length; i++) {
				if (values[i] != -1) {
					break;
				}
				if (i == 0) {
					values[i] = 1;
				} else {
					values[i] = 0;
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < values.length; i++) {
				sb.append(values[i] == -1 ? "0" : Integer.toString(values[i]));
			}
			System.out.println(Integer.parseInt(sb.toString()));
		}
	}

}
