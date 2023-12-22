import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger[] a = new BigInteger[10007];
		for(int i = 0;i < n;i++) {
			a[i] = in.nextBigInteger();
		}
		in.close();
		BigInteger x = a[0];
		BigInteger gcd = x;
		for(int i = 1;i < n;i++) {
			gcd = Quick_GCD(gcd,a[i]);
			x = x.multiply(a[i].divide(gcd));
			gcd = x;
		}
		BigInteger ans = BigInteger.ZERO;
		for(int i = 0;i < n;i++) {
			ans = ans.add(x.divide(a[i]));
		}
		System.out.print(ans.mod(BigInteger.valueOf(1000000007)));
	}
	
	public static BigInteger Quick_GCD(BigInteger a,BigInteger b)
    {
	        BigInteger r;
	        while(b.compareTo(BigInteger.ZERO)==1)
	        {
	             r=a.mod(b);
	             a=b;
	             b=r;
	        }
	        return a;
    }
}
