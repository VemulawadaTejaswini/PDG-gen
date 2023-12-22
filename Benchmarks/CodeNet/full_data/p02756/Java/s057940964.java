import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			StringBuilder sb = new StringBuilder(scanner.next());
			int q = scanner.nextInt();
			for (int i = 0; i < q; i++) {
				switch (scanner.nextInt()) {
				case 1:
					sb = sb.reverse();
					break;
				case 2:
					int f = scanner.nextInt();
					String c = scanner.next();
					if (1 == f) {
						sb.insert(0, c);
					} else {
						sb.append(c);
					}
				}
			}
			System.out.println(sb.toString());
		}
	}
}
