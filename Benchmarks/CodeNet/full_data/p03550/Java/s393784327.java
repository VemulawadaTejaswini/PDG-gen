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

		//配列の最大値
		int amax = a[1];
		int amin = a[1];
		z = a[n];
		for (int i=1; i<n; i++) {
			amax = Math.max(amax, a[i]);
		}

		//配列の最小値
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

		System.out.println(ansmax);
	}
}