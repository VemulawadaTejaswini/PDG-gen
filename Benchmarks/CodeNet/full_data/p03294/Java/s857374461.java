import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] num = new BigInteger[n];
		BigInteger tmp = BigInteger.ONE;
		for(int i = 0; i < n; i++) {
			num[i] = new BigInteger(sc.next());
			tmp = tmp.divide(tmp.gcd(num[i]));
			tmp = tmp.multiply(num[i]);
		}
		tmp = tmp.subtract(BigInteger.ONE);
		BigInteger ans = BigInteger.ZERO;
		for(int i = 0; i < n; i++) {
			ans = ans.add(tmp.mod(num[i]));
		}
		System.out.println(ans.toString());
	}
}