import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int i = 0;

		while (i < 1) {
			boolean sosu = true;
			int y = 2;
			while (sosu) {
				if (X % y == 0) {
					sosu = false;
				}
				if (X == y) {
					sosu = false;
					i++;
				}
				y++;
			}
			X++;
		}
		System.out.println(X-1);

	}
}
