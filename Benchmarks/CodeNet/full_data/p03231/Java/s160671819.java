import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		
		int lcmVal = lcm(N, M);
		
		if (S.charAt(0) != T.charAt(0)) {
			System.out.println(-1);
			return;
		}
		
		int min = Math.min(N, M);
		int max = Math.max(N, M);
		if (max % min == 0) {
			int gcdVal = gcd(max, min);
			String minStr;
			String maxStr;
			if (min == N) {
				minStr = S;
				maxStr = T;
			} else {
				minStr = T;
				maxStr = S;
			}
			
			for (int i = gcdVal; i <= max; i+=gcdVal) {
				int tmp = (lcmVal/min) * (i-1) + 1;
				if (maxStr.charAt((tmp-1)) != minStr.charAt((i-1))) {
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
	static int lcm (int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}
	
	/**
	 * 最大公約数を計算
	 * @param a
	 * @param b
	 * @return
	 */
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
}