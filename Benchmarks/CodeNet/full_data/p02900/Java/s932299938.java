import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);

		long g = gcd(a, b);

		ArrayList<Long> list = primeFactor(g);
		Set<Long> set = new HashSet<>();
		


		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		//System.out.println(set);
		
		if (set.contains(1L))
			System.out.println(list.size());
		else
			System.out.println(list.size() + 1);
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	public static ArrayList<Long> primeFactor(long g) {
		ArrayList<Long> ret = new ArrayList<>();
		if (g == 1) {
			ret.add(1L);
			return ret;
		}
		if (g > 1) {
			for (long i = 2; i * i <= g; i++) {
				while (g % i == 0) {
					ret.add((long) i);
					g /= i;
				}
			}
			if (g != 1)
				ret.add(g);
		}
		return ret;
	}
}
