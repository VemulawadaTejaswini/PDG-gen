import java.util.*;

public class Main {

	public static long calc(long cnt) {
		if (cnt <= 1)
			return 0;
		long ans = 0;
		if (cnt % 2 == 0) {
			ans = cnt / 2;
			ans *= (cnt - 1);
		} else {
			ans = (cnt - 1) / 2;
			ans *= cnt;
		}
		return ans;
	}

	public static String mysort(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		String ans = new String(c);
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long cnt = 0, ans = 0;
		String s[] = new String[n];
		for (int i = 0; i < n; ++i) {
			s[i] = sc.next();
			String tm = mysort(s[i]);
			s[i] = tm;
		}
		sc.close();
		Arrays.sort(s);
		String t = s[0];
		for (int i = 0; i < n; ++i) {
			if (t.equals(s[i]))
				++cnt;
			else {
				t = s[i];
				ans += calc(cnt);
				cnt = 1;
			}
		}
		ans += calc(cnt);
		System.out.println(ans);
	}
}
