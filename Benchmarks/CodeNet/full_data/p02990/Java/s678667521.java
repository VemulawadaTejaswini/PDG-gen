import java.util.*;
import static java.lang.Integer.*;

import java.math.BigInteger;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		BigInteger[] fa = new BigInteger[n+1];
		fa[0] = new BigInteger("1");
		fa[1] = new BigInteger("1");
		for(i=2;i<=n;i++) {
			fa[i] = fa[i-1].multiply(new BigInteger(String.valueOf(i)));
//			if(fa[i] > 1000000007) fa[i] %= 1000000007;
//			System.out.printf("%d %d%n",i,fa[i]);
		}
		long ans = n-k+1;
		System.out.println(ans);
		BigInteger nn = fa[n-k+1].multiply(fa[k-1]);
//		System.out.println(nn);
		BigInteger ans2;
		BigInteger mod = new BigInteger("1000000007");
//		long kake = ans;
//		long kake2 = 1;
		for(i=2;i<=k;i++) {
//			System.out.printf("%d %d %d %d%n", fa[i], fa[n-k+1-i], fa[i-1], fa[k-1-(i-1)]);
			ans2 = nn.divide(fa[i]).divide(fa[n-k+1-i]).divide(fa[i-1]).divide(fa[k-1-(i-1)]);
//			System.out.printf("%d %d%n", ((n-k+1)-i+1), i);
//			System.out.printf("%d %d%n", k+1-i, i-1);
//			kake *= ((n-k+1)-i+1);
//			kake /= i;
//			kake2 *= k+1-i;
//			kake2 /= i-1;
//			if(kake > 1000000007) kake %= 1000000007;
//			if(kake2 > 1000000007) kake2 %= 1000000007;
//			System.out.printf("%d %d%n", kake, kake2);
//			ans = kake  * kake2;
//			ans *= ((n-k+1)-i+1) * (k+1-i); 
//			ans /= i * (i-1); 
			if(ans2.compareTo(mod) > 0) ans2 = ans2.mod(mod);
			System.out.println(ans2);
		}
	}
}
