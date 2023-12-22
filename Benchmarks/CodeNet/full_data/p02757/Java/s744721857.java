import java.math.BigInteger;
import java.util.Scanner;

public class Sub {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger p = new BigInteger(scanner.next());
		String s = scanner.next();

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n + 1; j++) {
				if (new BigInteger(s.substring(i, j)).remainder(p).equals(BigInteger.ZERO))
					count++;
			}
		}
		System.out.println(count);

	}

}
