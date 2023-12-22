import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		int Q = scanner.nextInt();
		boolean didReverse = false;
		StringBuilder sb = new StringBuilder(answer);

		for (int i = 0; i < Q; i++) {
			int T = scanner.nextInt();
			if (T == 1) didReverse = !didReverse;
			else {

				int F = scanner.nextInt();
				String C = scanner.next();
				if ((F == 1 && !didReverse) || (F == 2 && didReverse)) sb.insert(0, C);
				else sb.append(C);
			}
		}

		if (didReverse) answer = sb.reverse().toString();
		else answer = sb.toString();

		System.out.println(answer);
	}
}