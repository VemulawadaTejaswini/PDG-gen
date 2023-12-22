import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int A = s.nextInt();
			final int P = s.nextInt();

			System.out.println((A * 3 + P) / 2);
		}
	}
}
