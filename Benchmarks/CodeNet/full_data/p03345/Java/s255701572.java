import java.util.Scanner;

public final class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		long k = scan.nextLong();
		System.out.println(k % 2 == 0 ? a - b : b - a);
	}
}