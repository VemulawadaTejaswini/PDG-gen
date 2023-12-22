import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		if (n % k == 0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(n % k, Math.abs(k - n % k)));
		}
	}
}
