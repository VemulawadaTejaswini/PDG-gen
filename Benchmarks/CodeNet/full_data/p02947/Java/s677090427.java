
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
		}
		String t[] = new String[N];
		for (int i = 0; i < N; i++) {
			char[] chars = s[i].toCharArray();
			Arrays.sort(chars);
			t[i] = Arrays.toString(chars);
		}
		Arrays.sort(t);
		long ans = 0;
		int tmp = 0;
		for (int i = 0; i < N - 1; i++) {
			if (t[i].equals(t[i + 1])) {
				tmp++;
			} else {
				if (tmp >= 1) {
					ans += comb(tmp + 1, 2);
					tmp = 0;
				}
			}
		}
		if (tmp >= 0) {
			ans += comb(tmp + 1, 2);
			tmp = 0;
		}
		System.out.println(ans);
	}

	static int comb(int n, int r) {
		double cmb = 1;
		for (int i = 0; i < r; i++) {
			cmb *= n - i;
			cmb /= (double)r - i;
		}
		return (int)cmb;
	}
}