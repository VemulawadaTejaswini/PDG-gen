import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();

		if (t.equals("serval"))
			System.out.println("hoge");

		String[] s = t.split("");
		String[] u = t.split("");
		Arrays.sort(u);
		int c = 0;
		int max = 0;
		String v = "";
		for (int i = 1; i < u.length; i++) {
			if (u[i].equals(u[i - 1]))
				c++;
			else {
				if (u[i - 1].equals(s[0]))
					c--;
				max = Math.max(max, c);
				if (max == c)
					v = u[i - 1];
				c = 0;
			}
		}
		if (u[u.length - 1].equals(s[0]))
			c--;
		max = Math.max(max, c);
		if (max == c)
			v = u[u.length - 1];
		int ans = 0;
		while (true) {
			boolean comp = true;
			for (int i = 0; i < s.length; i++)
				if (!s[i].equals(s[0])) {
					comp = false;
					break;
				}
			if (comp) {
				System.out.println(ans);
				return;
			}
			String[] w = new String[s.length - 1];
			for (int i = 0; i < w.length; i++) {
				if (s[i].equals(v) || s[i + 1].equals(v))
					w[i] = v;
				else
					w[i] = s[i];
			}
			s = w;
			ans++;
		}
	}

}