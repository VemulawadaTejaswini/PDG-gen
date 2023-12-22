import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

	static public BigInteger mod = new BigInteger("1000000007");
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();

		BigInteger ans = BigInteger.ZERO;
		for (int i=c1; i<c2+1;i++) {
			BigInteger f = f(i, r1);
			ans = ans.add(f);
			for (int j=r1+1;j<r2+1;j++) {
				long lji = j+i;
				long lj = j;
				f = f.multiply(BigInteger.valueOf(lji)).divide(BigInteger.valueOf(lj));
				ans = ans.add(f);
			}
		}
		ans = ans.remainder(mod);
		//long ans = f(r2, c2) - f(r2, c1-1) - f(r1-1, c2) + f(r1-1, c1-1);
		//long ans = f(r2, c2);
		//long ans = f(r2, c2) + f(r2, c1) + f(r1, c2) + f(r1, c1);

		System.out.println(ans);
	}

	static public BigInteger f(int r, int c) {

		if (c > r) {
			int tmp = c;
			c = r;
			r = tmp;
		}

		BigInteger rcf = factorial_m(c,r);
		BigInteger rf = factorial(r);
		BigInteger ans = rcf.divide(rf);
		return ans;
	}
	static public BigInteger factorial(int n) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}
	static public BigInteger factorial_m(int c, int r) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = c+1; i <= c+r; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}

}
