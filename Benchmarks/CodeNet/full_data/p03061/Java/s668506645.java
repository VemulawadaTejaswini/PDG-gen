
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];

		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int Gcd = A[0];
		for(int i = 1; i < n; i++) {
			Gcd = gcd(Gcd, A[i]);
		}
		int ans = 0;
		if(n == 2) {
			ans = Math.max(A[0], A[1]);
		}else {
			ans = Gcd;
			int[] yaku = new int[n];
			yaku[0] = gcd(A[0], A[n-1]);
			for(int i = 1; i < n; i ++) {
				yaku[i] = gcd(A[i-1], A[i]);
			}
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				if(yaku[i] == Gcd) {
					cnt ++;
				}
			}
			if(cnt > 2) {
				ans = Gcd;
			}else {
				for(int i = 0; i < n; i++) {

					if(yaku[i] != Gcd) {
						if(ans != Gcd) {
							ans = gcd(ans, yaku[i]);
							if(ans == 1) {
								break;
							}
						}else {
							ans = yaku[i];
						}
					}
				}
			}


		}
		System.out.println(ans);
		sc.close();
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
