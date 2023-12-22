import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		int Q = scanner.nextInt();
		int T = scanner.nextInt();
		int continuous = 1;

		for (int i = 0; i < Q; i++) {
			StringBuilder sb = new StringBuilder(answer);

			if (T == 1) {
				if (i != Q - 1) T = scanner.nextInt();
				else T = 0;
				if (T == 1) continuous++;
				else {
					if (continuous % 2 == 1) answer = sb.reverse().toString();
					continuous = 1;
				}
			}
			else {
				int F = scanner.nextInt();
				String C = scanner.next();

				if (F == 1) answer = sb.insert(0, C).toString();
				else answer = sb.append(C).toString();

				if (i != Q - 1) T = scanner.nextInt();
				else T = 0;
			}
		}

		System.out.println(answer);
	}
}
