import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		boolean x[] = new boolean[b + 1];

		Arrays.fill(x, false);

		for (int i = a; i < a + k; i++) {
			x[i] = true;
		}

		for (int i = b; b - k < i; i--) {
			x[i] = true;
		}

		for (int i = 1; i <= b; i++) {
			if (x[i]) System.out.println(i);
		}


		sc.close();
	}

}
