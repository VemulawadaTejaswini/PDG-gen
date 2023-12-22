import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		Long ans = 0l;

		for(int i = 1 ; i <= n  ; i++) {
			for(int j = 1 ; j <= n  ; j++) {
				for(int k = 1 ; k <= n  ; k++) {
					int tmp= (int) gcd(i,j);
					ans += gcd(tmp,k);
				}
			}
		}


		System.out.println(ans);
	}

	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}
