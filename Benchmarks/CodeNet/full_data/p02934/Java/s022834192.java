import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = Integer.parseInt(sc.next());
		Scanner sc1 = new Scanner(System.in);
		int[] in = Stream.of(sc1.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		boolean isSameAll = false;
		BigInteger lcm = null;
		int molecule = 0;
		double ans = 0;
		
		if (in.length > 1) {
			for (int i = 1; i < N; i++) isSameAll = (in[0] == in[i]) ? true : false;
			
			if (isSameAll) {
				ans = (double) in[0] / (double) in.length;
			} else {
				List<BigInteger> b = new ArrayList<>();
				for (int i : in) {
					b.add(BigInteger.valueOf(i));
				}
				BigInteger b1 = b.get(0);
				b.remove(0);
				lcm = lcmReception(b1, b);
				
				List<Integer> list = new ArrayList<>();
				for (int i = 0; i < N; i++) list.add(lcm.intValue() / in[i]);
				for (int i : list) molecule += i;
				ans = (double) lcm.intValue() / (double) molecule;
			}
		} else {
			ans = in[0];
		}
		
		System.out.println(ans);
	}
	
	public static BigInteger lcmReception(BigInteger l, List<BigInteger> bl) {
		BigInteger b = l;
		for (BigInteger r : bl) b = lcm(b, r);
		return b;
	}
	
	public static BigInteger lcm(BigInteger l, BigInteger r) {
		return l.multiply(r).divide(gcd(l, r));
	}
	
	public static BigInteger gcd(BigInteger l, BigInteger r) {
		return l.gcd(r);
	}
}
