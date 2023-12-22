import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = Eratos(100000);
		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int anss, ansg;
			anss=1;
			ansg=2;
			for (int o = 1; o <= a.length; o++) {
				if (a[o] < l && l <= a[o + 1]) {
anss=o+1;
				}
				if (a[o] <= r && r < a[o + 1]) {
					ansg=o;
					break;
				}
			}
			System.out.println(ansg-anss+1);
		}

	}

	static public int[] Eratos(int n) {

		int num[] = new int[n + 1];
		Arrays.fill(num, 0);

		ArrayList<Integer> sosu = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (num[i] == 0) {
				for (int j = i + i; j <= n; j = j + i) {
					if (j % i == 0) {
						num[j] = 1;
					}
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (num[i] == 0 && num[(i + 1) / 2] == 0 && i != 2) {
				sosu.add(i);
			}
		}

		int[] so = new int[sosu.size()];

		for (int i = 0; i < sosu.size(); i++) {
			so[i] = sosu.get(i);
		}

		return so;
	}

}