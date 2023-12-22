import java.util.*;

public class Main {

	static int gcd[][];

	public static void gcdinit(int n) {
		gcd = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; ++i) {
			for (int j = 0; j < n + 1; ++j) {
				gcd[i][j] = -1;
			}
		}
	}

	public static int gcd(int a, int b) {
		if(gcd[a][b] != -1)return gcd[a][b];
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0)
			return gcd[a][b] = a;
		int r = a % b;
		return gcd[a][b] = gcd(b, r);
	}

	public static int gcd(int a, int b, int c) {
		return gcd(gcd(a, b), c);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		gcdinit(k);
		sc.close();
		long ans = 0;
		for(int i = 1; i <= k; ++i){
			for(int j = 1; j <= k; ++j){
				for(int l = 1; l <= k; ++l){
					ans += gcd(i, j, l);
				}
			}
		}
		System.out.println(ans);
	}
}
