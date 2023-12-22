
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] v = new int[n];
		int[] kisuu = new int[100001];
		int[] guusuu = new int[100001]; // vに含まれる数
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
			if (i%2 == 0) {
				guusuu[v[i]]++;
			} else {
				kisuu[v[i]]++;
			}
		}

		int ki_max1 = 0;
		int ki_max2 = 0;
		for (int i = 0; i < kisuu.length; i++) {
			if (kisuu[i] > kisuu[ki_max1]) {
				ki_max2 = ki_max1;
				ki_max1 = i;
			}
		}

		int guu_max1 = 0;
		int guu_max2 = 0;
		for (int i = 0; i < guusuu.length; i++) {
			if (guusuu[i] > guusuu[guu_max1]) {
				guu_max2 = guu_max1;
				guu_max1 = i;
			}
		}

		int rewrite = n;
		if (guu_max1 != ki_max1) {
			rewrite = n - guusuu[guu_max1] - kisuu[ki_max1];
		} else {
			rewrite = Math.min(n - guusuu[guu_max1] - kisuu[ki_max2], n - guusuu[guu_max2] - kisuu[ki_max1]);
		}
		System.out.println(rewrite);
	}
}
