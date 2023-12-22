import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final long W = s.nextLong();
			final long H = s.nextLong();
			final long x = s.nextLong();
			final long y = s.nextLong();

			boolean b;
			if (W == 1 && H == 1) {
				b = false;
			} else if (W == 1) {
				b = H == y * 2;
			} else if (H == 1) {
				b = W == x * 2;
			} else {
				b = W == x * 2 && H == y * 2;
			}
			System.out.printf("%f %d%n", W * H / 2.0, b ? 1 : 0);
		}
	}
}
