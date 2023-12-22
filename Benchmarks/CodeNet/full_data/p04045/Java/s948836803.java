

import java.util.Scanner;

public class Main {

	public static boolean like(int d[], int k) {
		for(int i = 0; i < d.length; ++i) {
			if(k == d[i])return false;
		}
		return true;
	}
	
	public static int money(int d[], int n) {
		int tmp = n, tmp2 = n;
		int ans = 0;
		tmp = tmp2;
		int k = String.valueOf(n).length() - 1;
		tmp /= (int)Math.pow(10, k);
		tmp2 -= tmp * (int)Math.pow(10,  k);
		int j;
		for(j = tmp; j < 10; ++j) {
			if(like(d, j)) {
				ans += j * Math.pow(10, k);
				break;
			}
		}
		if(j > tmp) {
			for(int m = 0; m < 10; ++m) {
				if(like(d, m)) {
					for(int l = 0; l < k; ++l) {
						ans += m * Math.pow(10, l);
					}
					return ans;
				}
			}
		}
		for(int i = k - 1; i >= 0; --i) {
			tmp /= (int)Math.pow(10, k);
			tmp2 -= tmp * (int)Math.pow(10,  k);
			for(j = tmp; j < 10; ++j) {
				if(like(d, j)) {
					ans += j * Math.pow(10, k);
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, k, d[];
		n = sc.nextInt();
		k = sc.nextInt();
		
		d = new int[k];
		for(int i = 0; i < k; ++i) {
			d[i] = sc.nextInt();
		}
		
		int ans = money(d, n);
		
		System.out.println(ans);
		
		sc.close();
	}

}
