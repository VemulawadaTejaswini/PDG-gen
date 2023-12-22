import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[3];
		int max = 0;
		for (int i = 0; i < 3; ++i) {
			x[i] = sc.nextInt();
			max = Math.max(max, x[i]);
		}
		int k = sc.nextInt();
		List<Long> a[] = new List[3];
		for (int i = 0; i < 3; ++i)
			a[i] = new ArrayList<Long>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < x[i]; ++j)
				a[i].add(sc.nextLong());
		}
		sc.close();
		long ans[] = new long[x[0] * x[1] * x[2]];
		int l = 0;
		for (int i = 0; i < x[0]; ++i) {
			ans[l] = a[0].get(i);
			for (int j = 0; j < x[1]; ++j) {
				long tmp = a[0].get(i);
				ans[l] = tmp + a[1].get(j);
				for (int m = 0; m < x[2]; ++m) {
					long tmp2 = a[1].get(j) + a[0].get(i);
					ans[l] = tmp2 + a[2].get(m);
					++l;
				}
			}
		}
		Arrays.sort(ans);
		int n = ans.length;
		for(int i = 0; i < k; ++i)
			System.out.println(ans[n - i - 1]);
	}

}
