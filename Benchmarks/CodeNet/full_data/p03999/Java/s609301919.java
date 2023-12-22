import java.util.Scanner;

public class Main {

	static String s;
	static char[] t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		t = s.toCharArray();
		long ans = 0;
		ans += dfs(0, "");
		System.out.println(ans);
	}

	public static long dfs(int n, String x) {
		if(n == s.length()) {
			x = x.replace("+", "A");
			String[] c = x.split("A");
			long sum = 0;
			for(int i = 0 ; i < c.length ; i++) {
				sum += Long.valueOf(c[i]);
			}
			return sum;
		}
		long ret =  0;
		ret += dfs(n + 1, x + t[n]);
		if(n != 0) ret += dfs(n + 1, x + "+" + t[n]);
		return ret;
	}

}
