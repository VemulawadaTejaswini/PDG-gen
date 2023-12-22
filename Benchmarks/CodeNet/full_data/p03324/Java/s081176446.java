import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());

		long x = 0;

		for (int i = 0; i < n; i++) {
			x += (long) Math.pow(100, d);
		}

		System.out.println(x);
	}
}
