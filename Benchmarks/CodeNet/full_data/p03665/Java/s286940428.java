import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p1 = 0, p0 = 0, n = scanner.nextInt(), p = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			int tmp = scanner.nextInt();
			if ((tmp & 1) == 1)
				p1++;
			else
				p0++;
		}
		BigInteger[] c1 = new BigInteger[p1 + 1];
		c1[0] = BigInteger.ONE;
		for (int i = 1; i <= p1; i++)
			c1[i] = c1[i - 1].multiply(BigInteger.valueOf(p1 + 1 - i)).divide(BigInteger.valueOf(i));
		BigInteger ans = BigInteger.ZERO;
		for (int i = p; i <= p1; i += 2)
			ans=ans.add(c1[i].multiply(BigInteger.valueOf(2).pow(p0)));
		System.out.println(ans);
	}
}
