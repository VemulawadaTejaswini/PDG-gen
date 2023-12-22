import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long all = a + b;

		if (k <= a) {
			System.out.println(a - k + " " + b);
		} else if (a < k && k <= all) {
			System.out.println("0 " + (all - k));
		} else {
			System.out.println("0 0");
		}

		sc.close();
	}

}
