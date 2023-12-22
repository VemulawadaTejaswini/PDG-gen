import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 1 && b == 1) {
			System.out.println(1);
		} else if (a == 1 && b != 1) {
			System.out.println(b - 2);
		} else if (a != 1 && b == 1) {
			System.out.println(a - 2);
		} else {
			System.out.println(Math.abs((a - 2) * (b - 2)));
		}

	}
}