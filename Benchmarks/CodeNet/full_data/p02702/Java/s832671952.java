import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		BigInteger year = new BigInteger("2019");
		BigInteger zero = new BigInteger("0");

		for(int i = 0;i < s.length() - 1;i++) {
			for(int j = i + 4;j <= s.length();j++) {
				BigInteger n = new BigInteger(s.substring(i, j));
				//System.out.println(i + " " + j + " " + n);
				if(n.remainder(year).equals(zero)) {
					//System.out.println(n);
					count++;
				}

			}
		}

		System.out.println(count);
    }
}