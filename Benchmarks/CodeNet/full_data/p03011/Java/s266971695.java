import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int P = s.nextInt();
			final int Q = s.nextInt();
			final int R = s.nextInt();

			System.out.println(P + Q + R - Math.max(Math.max(P, Q), R));
		}
	}
}
