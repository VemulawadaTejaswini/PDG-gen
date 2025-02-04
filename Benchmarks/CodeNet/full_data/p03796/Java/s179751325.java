import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		BigInteger b = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			b = b.multiply(new BigInteger("" + i));
		}
		System.out.println(b.remainder(new BigInteger("1000000007")));
	}
	
}