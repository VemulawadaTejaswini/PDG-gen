import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] substr = str.split(" ", 0);

		String ns = substr[0];
		String ks = substr[1];
		sc.close();

		BigInteger ans = new BigInteger(ns);
		BigInteger buf = new BigInteger(ns);

		BigInteger n = new BigInteger(ns);
		BigInteger k = new BigInteger(ks);

		ans = n.mod(k);
		buf = ans.subtract(k).abs();
		if (ans.compareTo(buf)>0) {
			ans = buf;
		}
		System.out.println(ans);
	}
}
