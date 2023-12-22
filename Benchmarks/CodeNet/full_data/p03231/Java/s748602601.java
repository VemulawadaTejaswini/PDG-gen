import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		String S = sc.next();
		String T = sc.next();
		
		long lcmVal = lcm(N, M);
		
		if (S.charAt(0) != T.charAt(0)) {
			System.out.println(-1);
			return;
		}
		
		
		
		long min = Math.min(N, M);
		long max = Math.max(N, M);
		long gcdVal = gcd(max, min);
		if (gcdVal > 1 && max % min == 0) {
			String minStr;
			String maxStr;
			if (min == N) {
				minStr = S;
				maxStr = T;
			} else {
				minStr = T;
				maxStr = S;
			}
			
			for (long i = 1; i < min; i++) {
				long tmp = (lcmVal/min) * (i) + 1;

				long maxTmp = (max/lcmVal) * tmp - 1;
				
				if (maxStr.charAt((int)(maxTmp-1)) != minStr.charAt((int)i)) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(lcmVal);
	}

	/**
	 * 最小公倍数を計算
	 * @param a
	 * @param b
	 * @return
	 */
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}
	
	/**
	 * 最大公約数を計算
	 * @param a
	 * @param b
	 * @return
	 */
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
}