import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger power = BigInteger.valueOf(1);
		for(int i = 1; i <= N; i++) {
			power = power.multiply(BigInteger.valueOf(i));
		}
		System.out.println(power.mod(BigInteger.valueOf((long) Math.pow(10, 9) + 7)));
		scan.close();

	}

}
