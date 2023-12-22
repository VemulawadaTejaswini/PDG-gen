import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger N = BigInteger.valueOf(sc.nextInt());
		BigInteger blue = BigInteger.valueOf(sc.nextInt());
		BigInteger red = BigInteger.valueOf(sc.nextInt());

		BigInteger total = BigInteger.valueOf(0);
		BigInteger blueCount = BigInteger.valueOf(0);

		while(true)
		{
			total = total.add(blue);
			blueCount = blueCount.add(blue);

			if(N.compareTo(total) <= 0)
			{
				blueCount = blueCount.subtract(total.subtract(N));
				break;
			}

			total = total.add(red);

			if(N.compareTo(total) <= 0) break;

		}

		System.out.println(blueCount);

	}
}
