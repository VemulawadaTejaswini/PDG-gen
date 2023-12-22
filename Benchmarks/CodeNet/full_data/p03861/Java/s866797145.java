import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long x = sc.nextLong();
		sc.close();

		if (a == -1) {
			System.out.println(b / x + 1);
		} else {
			System.out.println(b / x - a / x);
		}
	}
}
