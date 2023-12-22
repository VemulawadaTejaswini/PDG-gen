import java.util.Scanner;

public class Main {

	static int k = 100001;

	public static int solve(StringBuffer s) {
		int n = s.length();
		int count = 0, t = -1, ans = 0, l = 0, r = 0;

		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) == '1') {
				if (count > 0 && r > 0)
					break;
				++count;
			} else {
				if (count > 0) {
					if(r == 0)t = i - 1;
					++r;
				} else
					++l;
			}
		}
		if(count > 0 && t == -1)t = n - 1;

		if (t == -1)
			return n;// all 0

		for (int i = t - count + 1; i <= t; ++i)
			s.setCharAt(i, '0');
		ans = count;
		if (l + r > count) {
			//System.out.println(count + " " + l + " " + r);
			int tmp = t - count - l + 1;
			for (int i = tmp; i <= t - count; ++i)
				s.setCharAt(i, '1');
			for (int i = t + 1; i <= t + r; ++i)
				s.setCharAt(i, '1');
			ans += (l + r);
		}
		else if(l + r == count) {
			if(t != n - 1 && s.charAt(n - 1) != '0') {
				int tmp = t - count - l + 1;
				for (int i = tmp; i <= t - count; ++i)
					s.setCharAt(i, '1');
				for (int i = t + 1; i <= t + r; ++i)
					s.setCharAt(i, '1');
				ans += (l + r);
			}
		}
		//System.out.println(ans);
		ans = Math.min(ans, solve(s));

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		StringBuffer s2 = new StringBuffer();
		s2.append(s);
		int ans = solve(s2);
		System.out.println(ans);
	}

}
