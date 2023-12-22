import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt();
		long sumC = 0;
		BigInteger sumD = BigInteger.valueOf(0);
		for(int i=0;i < M;i++) {
			long d = scn.nextLong();
			long c = scn.nextLong();
			sumD = sumD.add(BigInteger.valueOf(d*c));
			sumC += c;
		}
		System.out.println(sumC + sumD.divide(BigInteger.TEN).longValue()-1);
	}

}
