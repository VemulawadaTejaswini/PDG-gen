import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		// input
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();

		scan.close();

		long halfa = 0;
		long halfb = 0;
		long halfc = 0;

		int count = 0;

		while (true) {
			if (a % 2 == 1 || b % 2 == 1 || c % 2 == 2) {
				break;
			}

			halfa = a / 2;
			halfb = b / 2;
			halfc = c / 2;

			a = halfb + halfc;
			b = halfa + halfc;
			c = halfa + halfb;

			count++;
			if (a == b && b == c) {
				count = -1;
				break;
			}
		}
		System.out.println(count);

	}
}
