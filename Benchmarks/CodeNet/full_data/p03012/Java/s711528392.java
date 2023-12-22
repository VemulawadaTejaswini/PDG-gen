import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int souwa = 0;
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			souwa += w[i];
		}
		sc.close();
		int sa = 100000000;
		for (int t = 0; t < n; t++) {
			int wa = 0;
			for (int i = 0; i < t; i++) {
				wa += w[i];
			}
			int tmp = souwa - wa;
			int saa = Math.abs(wa - tmp);
			if (saa < sa)
				sa = saa;
		}
		System.out.println(sa);
	}
}
