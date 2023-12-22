import java.util.Scanner;
import java.util.*;

public class Train1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = Long.valueOf(scanner.nextLine());
		long a = Long.valueOf(scanner.nextLine());
		long b = Long.valueOf(scanner.nextLine());
		long c = Long.valueOf(scanner.nextLong());
		long d = Long.valueOf(scanner.nextLong());
		long e = Long.valueOf(scanner.nextLong());

		long bottleneck = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		long res = 5 + (long)Math.ceil(n / bottleneck) - 1;

		System.out.println(res);
	}

}
