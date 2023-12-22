import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = 0;

		if (a >= 1 && a < b) {
			x = (b - a) * (b - a + 1) / 2 - b;
		} else {
			return;
		}
		System.out.println(x);

	}
}