import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(System.in);
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long ans = n-k+1;
		System.out.println(ans);
//		long kake = ans;
//		long kake2 = 1;
		for(i=2;i<=k;i++) {
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
			ans *= ((n-k+1)-i+1) * (k+1-i); 
			ans /= i * (i-1); 
			if(ans > 1000000007) ans %= 1000000007;
			System.out.println(ans);
		}
	}
}
