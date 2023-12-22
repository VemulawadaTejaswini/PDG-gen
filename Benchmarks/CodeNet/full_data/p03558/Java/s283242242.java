import java.util.*;
import java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		BigInteger x = BigInteger.valueOf(k);
		int sum = 0x3f3f3f3f;
		for (int i = 1; i < 100000; i++) {
			BigInteger tmp = BigInteger.valueOf(i);
			tmp = tmp.multiply(x);
			String s = tmp.toString();
			int y = 0;
			for (int t = 0; t < s.length(); t++) {
				y += s.charAt(t) - '0';
			}
			if (y < sum) sum = y;
		}
		System.out.println(sum);
	}
}