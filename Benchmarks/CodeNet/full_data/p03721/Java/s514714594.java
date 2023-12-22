import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), a, b, idx = 0;
		long[] s = new long[10000000];
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				s[idx] = a;
				idx++;
			}
		}
		long[] ans = new long[idx];
		for (int i = 0; i < idx; i++) {
			ans[i] = s[i];
		}
		Arrays.sort(ans);
		System.out.println(ans[k-1]);
	}

}
