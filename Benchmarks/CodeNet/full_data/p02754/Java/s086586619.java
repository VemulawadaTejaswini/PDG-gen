import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		String[] substr = str.split(" ", 0);

		BigInteger n = new BigInteger(substr[0]);
		BigInteger a = new BigInteger(substr[1]);
		BigInteger b = new BigInteger(substr[2]);

		BigInteger c = a.add(b);
		BigInteger m = n.mod(c);
		BigInteger s = n.divide(c);
		BigInteger buf = BigInteger.ZERO;
		if (a != BigInteger.ZERO) {
			if (m.compareTo(a)>= 0) buf = a;
			if (m.compareTo(a)<0) buf = m;
		}
		System.out.println(a.multiply(s).add(buf));
	}
}
