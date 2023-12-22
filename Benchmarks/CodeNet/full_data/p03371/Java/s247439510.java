import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		boolean cPriority = 4 * c < 2 * (a + b);
		int result = 0;
		if (cPriority) {
			if (x < y) {
				if (y < c * 2) {
					result = 2 * c * x + b * (y - x);
				} else {
					result = 2 * c * y;
				}
			} else {
				if (x < c * 2) {
					result = 2 * c * y + a * (x - y);
				} else {
					result = 2 * c * x;
				}
			}
		} else {
			result = a * x + b * y;
		}
		System.out.println(result);
	}
}
