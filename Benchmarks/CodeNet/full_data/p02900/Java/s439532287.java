import java.util.*;
public class Main {
	
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = gcd(A, B);
		int ans = 1;
		for(int i = 2; i <= Math.sqrt(C); i ++) {
			if(C % i == 0) {
				while(C % i == 0)
					C /= i;
				ans++;
			}
		}
		System.out.println(C > 1 ? ans+1 : ans);

	}

}