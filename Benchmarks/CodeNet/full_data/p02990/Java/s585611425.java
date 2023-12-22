import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		long ans = n-k+1;
		System.out.println(ans);
		long kake = ans;
		long waru = 1;
		for(i=2;i<=k;i++) {
			waru *= i;
			kake *= ((n-k+1)-i+1);
//			for(j=n-k+1;j>=(n-k+1)-i+1;j--) {
				ans = kake  * (k - i + 1) / waru;
				if(ans > 1000000007) ans %= 1000000007;
//			}
			System.out.println(ans);
		}
	}
}
