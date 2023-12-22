import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		long a = (long)scan.nextInt();
		long b = (long)scan.nextInt();

		if (a % 2 == 1 && b % 2 == 1) {
			System.out.println(a * b / 2 + 1);
		}else {
			System.out.println(a * b / 2);
		}

		scan.close();
	}
}
