import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger p = new BigInteger("1");
		for(int i = 1; i <= n; i++) {
			p = p.multiply(new BigInteger(Integer.toString(i)));
		}
		
		System.out.println(p.remainder(new BigInteger("1000000007")));
	}

}
