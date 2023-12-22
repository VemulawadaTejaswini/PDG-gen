import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		int[] c = new int[P];
		c[0] = 1;
		long ans = 0;
		int a = 0;
		if(P == 2 || P == 5) {
			for(int i = 0; i < N; i++) {
				int x = Character.getNumericValue(S.charAt(N-1-i));
				if(x % P == 0)
					ans += i + 1;
			}
		}
		else{
			for(int i = 0; i < N; i++) {
				int x = Character.getNumericValue(S.charAt(N-1-i));
				a = (a + x * BigInteger.valueOf(10).modPow(BigInteger.valueOf(i), BigInteger.valueOf(P)).intValue()) % P;
				ans += c[a];
				c[a]++;
			}
		}
		System.out.println(ans);

	}

}