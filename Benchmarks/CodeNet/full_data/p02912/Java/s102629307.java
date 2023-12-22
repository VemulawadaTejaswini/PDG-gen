import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		for (int i = 0; i < m; ++i) {
			Arrays.sort(a);
			a[n - 1] /= 2;
			System.out.println(a[n - 1] + " ??");
		}
		long ans = 0;
		for (int i = 0; i < n; ++i)
			ans += (long)a[i];
		System.out.println(ans);
	}
}
