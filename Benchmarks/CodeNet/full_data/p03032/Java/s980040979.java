import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int ans = -1000000000;
		int r = Math.min(n, k);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r - i; j++) {
				int d = r - i - j;
				ArrayList<Integer> li = new ArrayList<>();
				for (int l = 0; l < i; l++) {
					li.add(v[l]);
				}
				for (int l = 0; l < j; l++) {
					li.add(v[n - 1 - l]);
				}
				Collections.sort(li);
				for (int l = 0; l < Math.min(d, li.size()); l++) {
					if (li.get(l) < 0) {
						li.set(l, 0);
					} else {
						break;
					}
				}
				int tmp = 0;
				for (int l = 0; l < li.size(); l++) {
					tmp += li.get(l);
				}
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
