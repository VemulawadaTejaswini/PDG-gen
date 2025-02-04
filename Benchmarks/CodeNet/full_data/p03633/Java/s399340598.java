import java.util.*;
import java.math.*;
class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		long t;
		BigInteger lcm = BigInteger.ONE;
		for(int i = 0; i < n; ++i)
		{
			t = scan.nextLong();
			if(i == 0)
			{
				lcm = BigInteger.valueOf(t);
			}
			else
			{
				lcm = lcm.multiply(BigInteger.valueOf(t)).divide(lcm.gcd(BigInteger.valueOf(t)));
			}
		}
		System.out.println(lcm);
	}
}