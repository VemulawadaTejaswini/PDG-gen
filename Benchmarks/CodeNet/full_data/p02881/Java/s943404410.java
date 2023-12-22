import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long i, j = 1;
		long b = (long) Math.floor(Math.sqrt(a));

		for (i = b; i >= 1; i--) {
			if (a % i == 0) {
				j = i;
				break;
			}
		}

		i = a / j;

		System.out.println((i - 1) + (j - 1));
	}

}
