import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		String s = scan.next();
		scan.close();

		char[] c = s.toCharArray();
		int[] k = new int[200000];

		for (int i=0; i<n; i++) {
			k[i] = c[i] - 48;
		}
		int ans = 0;
		BigInteger bp = BigInteger.valueOf(p);
		for (int i=0; i<n; i++) {
			for (int j=i; j<n; j++) {
				if (num(i,j,k).mod(bp).equals(BigInteger.ZERO)) ans++;
			}
		}

		System.out.println(ans);
	}
	static BigInteger num(int start, int end, int[] k) {
		BigInteger ans = BigInteger.valueOf(k[start]);
		for (int i=start+1; i<=end; i++) {
			ans = ans.multiply(BigInteger.TEN).add(BigInteger.valueOf(k[i]));
		}
		return ans;
	}
}
