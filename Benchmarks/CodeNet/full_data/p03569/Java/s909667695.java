import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2 = s.replace("x", "");
		if (!s2.equals(new StringBuilder(s2).reverse().toString())) {
			System.out.println(-1);
			return;
		}
		char[] t = s.toCharArray();
		int n = t.length;
		int p = 0;
		int q = n - 1;
		int ans = 0;
		while(p < q) {
			int left = 0;
			int right = 0;
			while(t[p] == 'x' && p < n) {
				p++;
				left++;
			}
			while(t[q] == 'x' && q >= 0) {
				q--;
				right++;
			}
			if (p <= q) {
				if (t[p] != t[q]) {
					throw new RuntimeException();
				}
				ans += Math.abs(left - right);
			}
			p++;
			q--;
		}
		System.out.println(ans);
	}
}
