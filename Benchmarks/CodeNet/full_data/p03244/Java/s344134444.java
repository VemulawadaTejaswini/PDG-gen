import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] v = new int[n];
		int[] kisuu = new int[10000];
		int[] guusuu = new int[10000]; // vに含まれる数
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
			if (i%2 == 0) {
				guusuu[v[i]]++;
			} else {
				kisuu[v[i]]++;
			}
		}

		int ki_max = kisuu[0];
		int ki_tmp = ki_max;
		int ki_index = 0;
		for (int i = 0; i < kisuu.length; i++) {
			ki_max = Math.max(ki_max, kisuu[i]);
			if (ki_tmp != ki_max) {
				ki_index = i;
				ki_tmp = ki_max;
			}
		}
		int ki_rewrite = n/2 - ki_max;

		int guu_max = guusuu[0];
		for (int i = 0; i < guusuu.length; i++) {
			if (ki_index != i) {
				guu_max = Math.max(guu_max, guusuu[i]);
			}
		}
		int guu_rewrite = n/2 - guu_max;
		System.out.println(ki_rewrite + guu_rewrite);
	}
}
