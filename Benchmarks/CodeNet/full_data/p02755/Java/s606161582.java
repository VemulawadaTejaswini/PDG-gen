import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int from = a * 100 / 8;
			int to = (a + 1) * 100 / 8;
			for (int i = from; i < to; i++) {
				if (i / 10 == b) {
					System.out.println(i);
					return;
				}
			}
			System.out.println(-1);
		}
	}
}
