import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int[] a = new int[n+1];
		a[0]= 0;
		for (int i=1; i<=n ;i++) {
				a[i] = sc.nextInt();
		}
		sc.close();
		//入力終了

		int ans =0;
		int co =0;
		int hold =1;
		int amax = 0;
		int amin =0;
		for (int k=co; k<n; k++) {
			for (int i=co+1; i<n; i++) {
				if (amax <= Math.abs(a[i]-a[n])) {
					amax = Math.abs(a[i]-a[n]);
					hold =i;
				}
			}
			if (amax>Math.abs(a[n]-w)) {
				co = hold;
				z = a[co];
				for (int i=co+1; i<n; i++) {
					if (Math.abs(a[i]-a[n]) <= Math.abs(a[co]-a[n])) {
						amin = Math.abs(a[i]-a[n]);
						hold =i;
					}
				}
				if (amin < Math.abs(a[n]-a[co])) {
					co = hold;
					w = a[co];
				} else {
					ans = Math.abs(a[n]-a[co]);
					break;
				}
			} else {
				ans = Math.abs(a[n]-w);
				break;
			}

		//絶対値の最小値
		for (int i=1; i<n; i++) {
			amin = Math.max(amin, a[i]);
		}

		//本体
		int[] comp = {
				Math.abs(z-w),
				Math.abs(z-amax),
				Math.abs(z-amin)};
		int ansmax = comp[0];
		for (int i : comp) {
			ansmax = Math.max(i, ansmax);
		}
		}

		System.out.println(ans);
	}
}