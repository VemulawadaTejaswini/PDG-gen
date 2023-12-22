import java.util.Scanner;

public class C {

	private static final char WHITE = '.';
	private static final char BLACK = '#';

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			String s = scanner.next();

			int b = 0;
			int b2w = 0;
			char[] cs = s.toCharArray();
			for (int i = 0, max = n - 1; i < max; i++) {
				char current = cs[i];
				char next = cs[i + 1];
				if (current == BLACK) {
					b++;
				}
				if (!(current == BLACK && next == WHITE)) {
					continue;
				}
				b2w += b;
			}
			int w2b = 0;
			for (int i = 0, max = n - 1; i < max; i++) {
				char current = cs[i];
				char next = cs[i + 1];
				if (!(current == BLACK && next == WHITE)) {
					continue;
				}
				cs[i + 1] = BLACK;
				w2b++;
			}
			System.out.println(Math.min(b2w, w2b));
		}
	}

}
