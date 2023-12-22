import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String n = sc.next();

		int min = 0;
		for (int i = 0; i < n.length() - 3; i++) {
			int test = Integer.parseInt(n.substring(i, 3 + i));
			final int sub = Math.abs(753 - Integer.parseInt(n.substring(i, 3 + i)));
			if (i == 0) {
				min = sub;
				continue;
			}
			if (min > sub) {
				min = sub;
			}
		}

		System.out.println(min);

	}

}
