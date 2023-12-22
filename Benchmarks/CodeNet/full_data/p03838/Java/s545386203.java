import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		if (Math.abs(x) == Math.abs(y)) {
			if (Math.signum(x) != Math.signum(y)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else if (x < y) {
			System.out.println(y - x);
		} else if (x < 0 && y < 0) {
			System.out.println(Math.abs(y - x) + 2l);
		} else if (x > 0 && y > 0) {
			System.out.println(y + x + 1l);
		} else {
			if (Math.abs(x) < Math.abs(y)) {
				System.out.println(Math.abs(y + x) + 1l);
			} else {
				System.out.println(Math.abs(Math.abs(y) - Math.abs(x)) + 1l);
			}
		}
		in.close();
	}
}