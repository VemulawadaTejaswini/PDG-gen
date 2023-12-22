import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p = sc.nextInt();
		String s = sc.next();
		sc.close();
		long ans = 0;
		if (p == 2 || p == 5) {
			for (int i = 0; i < n; ++i) {
				int tmp = (int) (s.charAt(i) - '0');
				if (tmp % p == 0)
					ans += (long) (i + 1);
			}
		} else {
			Map<Integer, Long> modlist = new HashMap<Integer, Long>();
			long val = 0;
			int m = 1, mode10 = 10 % p;
			for (int i = n - 1; i >= 0; --i) {
				int tmp = (int) (s.charAt(i) - '0');
				tmp %= p;
				tmp *= m;
				tmp %= p;
				val += (long)tmp;
				val %= (long)p;
				int key = (int)val;
				long value = 1;
				if (modlist.containsKey(key))
					value += modlist.get(key);
				modlist.put(key, value);
				ans += (key == 0 ? value : value - 1);
				m *= mode10;
				m %= p;
			}
		}
		System.out.println(ans);
	}
}
