import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		if (n < k) {
			System.out.println(n * x);
		} else {
			System.out.println(x * k + ((n - k) * y));
		}

	}
}