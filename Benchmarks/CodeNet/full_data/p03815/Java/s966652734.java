import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long x = scanner.nextLong();
		long ans = 0;
		long tmp = x / 11;
		if (x % 11 <= 5) {
			ans = tmp * 2 + 1;
		} else {
			ans = tmp * 2 + 2;
		}
		System.out.println(ans);

	}
}