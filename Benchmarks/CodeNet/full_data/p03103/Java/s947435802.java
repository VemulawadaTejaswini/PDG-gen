import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		Pair p[] = new Pair[n];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			p[i] = new Pair(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}

		Arrays.sort(p);

		long ans = 0;

		for (int i = 0; i < n; i++) {
			int diff = m - p[i].b;
			if (diff >= 0) {
				m -= p[i].b;
				ans += (long) p[i].a * p[i].b;
			} else {
				ans += (long) m * p[i].a;
				break;
			}
		}

		System.out.println(ans);
	}
}

class Pair implements Comparable<Pair> {
	int a;
	int b;

	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Pair p) {
		return this.a - p.a;
	}
}