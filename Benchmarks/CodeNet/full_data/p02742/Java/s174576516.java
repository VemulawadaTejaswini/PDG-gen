import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int ww1 = w / 2 + (w % 2);
		int ww2 = (w-1) / 2 + ((w-1) % 2);

		BigInteger ans = BigInteger.ZERO;

		ans = BigInteger.valueOf(ww1+ww2);
		ans = ans.multiply(BigInteger.valueOf(h/2));
		if (h % 2 == 1) {
			ans =ans.add(BigInteger.valueOf(ww1));
		}

		sc.close();
		System.out.println(ans);
	}
}
