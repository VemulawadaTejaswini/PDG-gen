import java.util.*;

class Main {
	static int n;
	static int[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = a[i];
			a[i] = 0;
			for (int j = 0; j < n - 1; j++) {
				if (max < gcd2()) {
					max = gcd2();
				}
			}
			a[i] = tmp;
		}
		System.out.println(max);
	}

	public static int gcd2() {
		int g = gcd(a[0], a[1]);
		for (int i = 1; i < a.length - 1; i++) {
			g = gcd(g, a[i + 1]);
		}
		return g;
	}

	public static int gcd(int m, int n) {
		if(m < n) {
			return gcd(n, m);
		}
    	if(n == 0) {
			return m;
		}
    	return gcd(n, m % n);
	}
}