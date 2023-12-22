import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int p;
	int[] a;
	int[] fac;
	int[] ans;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		p = sc.nextInt();
		a = new int[p];
		for (int i = 0; i < p; i++) a[i] = sc.nextInt();
		fac = new int[p];
		fac[0] = 1;
		for (int i = 1; i < p; i++) fac[i] = (fac[i-1] * i)%p;
		
		ans = new int[p];
		int[] mipow = new int[p];
		for (int i = 0; i < p; i++) mipow[i] = 1;
		
		for (int j = p-1; j >= 0; j--) {
			int k = 0;
			if (j == 0)
				for (int i = 0; i < p; i++) k = (k + a[i]) % p;
			for (int i = 0; i < p; i++) {
				k = (k + (p - a[i] * nCr(p-1, j) % p * mipow[i] % p) % p) % p;
				mipow[i] = mipow[i] * (p-i) % p;
			}
			ans[j] = k;
		}
		System.out.println(Arrays.stream(ans).mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(" ")));
		System.out.flush();
	}
	
	private int nCr(int n, int r) {
		return fac[n] * inv(fac[r]) % p * inv(fac[n-r]) % p;
	}

	private int inv(int a) {
		int x0 = 1, x1 = 0;
		int y0 = 0, y1 = 1;
		int b = p;
	
		while (b != 0) {
			int q = a / b;
			int r = a % b;
			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
	
	    return x0;
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}