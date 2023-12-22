import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long x = sc.nextLong(), y = sc.nextLong();
		if (x % y == 0) {
			System.out.println(-1);
		} else {
			System.out.println(x);
		}
	}
}