import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int count = 0;
		for (int i = 0; i <= text.length(); i++) {
			for (int j = i + 3; j <= text.length(); j++) {
				String sub = text.substring(i, j);
				if (sub.length() < 4) {
					continue;
				}
				BigInteger bi = new BigInteger(sub);
				if (bi.remainder(BigInteger.valueOf(2019L)).intValue() == 0) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
