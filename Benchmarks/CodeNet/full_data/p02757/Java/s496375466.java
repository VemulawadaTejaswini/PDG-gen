import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		int p = scan.nextInt();
		String s = scan.next();
		scan.close();
		long cnt = 0;
		for(int i = 0;i<n;i++) {
			BigInteger s_int = BigInteger.ZERO;
			for(int j = i;j<n;j++) {
				int num = Character.getNumericValue(s.charAt(j));
				s_int = s_int.multiply(BigInteger.valueOf(10));
				s_int = s_int.add(BigInteger.valueOf(num));
				if(s_int.remainder(BigInteger.valueOf(p))  == BigInteger.valueOf(0)) cnt++;
			}
		}
		System.out.println(cnt);
	}

}