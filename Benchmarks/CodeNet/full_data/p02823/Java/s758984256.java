
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();

			long tmp = b - a;
			if (tmp % 2 == 0) {
				System.out.println(tmp / 2);
				return;
			}

			long tmp1 = a + (tmp - 1) / 2;

			long tmpB = n - b + 1;
			long tmpA = a + tmpB;
			long tmp2 = n - b + 1 + (n - tmpA) / 2;

			System.out.println(tmp1 < tmp2 ? tmp1 : tmp2);
		}
	}
}