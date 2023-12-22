import java.util.*;
import java.math.*;
// im sorry
public class Main {
	static BigInteger ZERO = new BigInteger("0");
	static BigInteger ONE = new BigInteger("1");
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt(); in.nextLine();
		BigInteger[] nums = new BigInteger[n];
		BigInteger max = new BigInteger("-1");
		String[] nums_str = in.nextLine().split(" ");
		for( int i = 0; i < n; i++ ) {
			nums[i] = new BigInteger(nums_str[i]);
			max = max.max(msb(nums[i]));
		}
		max = incr(max);
		while( max.shiftLeft(1).compareTo(new BigInteger(Integer.toString(k))) >= 0){
			max = decr(max);
		}
		BigInteger xor = ONE.shiftLeft(max.intValue()-1);
		BigInteger sum = ZERO;
		for( BigInteger q : nums )
			sum = sum.add(xor.xor(q));
		System.out.println(sum);
	}
	public static BigInteger msb(BigInteger n) {
		BigInteger ct = ZERO;
		while( n.compareTo(ZERO) == 1 ) {
			ct = incr(ct);
			n = n.shiftRight(1);
		}
		return ct;
	}

	public static BigInteger incr(BigInteger b) {
		return b.add(ONE);
	}

	public static BigInteger decr(BigInteger b) {
		return b.subtract(ONE);
	}
}