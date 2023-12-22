import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int tmpa[];

	public static int solve() {
		int n = tmpa.length;
		int min = tmpa[0];
		if(min == 1)return 1;
		if(min == tmpa[n - 1])return min;
		for (int i = 1; i < n; ++i) {
			int tmp = tmpa[i] / min;
			int r = tmpa[i] % min;
			if(r == 0)r = 1;
			else r = 0;
			tmpa[i] -= min * (tmp - r);
		}
		Arrays.sort(tmpa);
		return solve();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		tmpa = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			tmpa[i] = a[i];
		}
		sc.close();
		Arrays.sort(tmpa);
		int ans = solve();
		System.out.println(ans);
	}

}
