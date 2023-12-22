import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			String s = scanner.next();

			int b2w = 0;
			char[] cs = s.toCharArray();
			for (int i = 0, max = n - 1; i < max; i++) {
				char current = cs[i];
				char next = cs[i + 1];
				if (!(current == '#' && next == '.')) {
					continue;
				}
				b2w++;
			}
			int w2b = 0;
			for (int i = 0, max = n - 1; i < max; i++) {
				char current = cs[i];
				char next = cs[i + 1];
				if (!(current == '#' && next == '.')) {
					continue;
				}
				cs[i + 1] = '#';
				w2b++;
			}
			System.out.println(Math.min(b2w, w2b));
		}
	}

}
