import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();

		int cnt = 0;
		x -= z;
		while (x >= y + z) {
			x -= (y + z);
			cnt++;
		}

		System.out.println(cnt);
	}
}