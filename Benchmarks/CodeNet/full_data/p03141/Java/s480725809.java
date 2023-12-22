import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Pair p[] = new Pair[n];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			p[i] = new Pair(Long.parseLong(str[0]), Long.parseLong(str[1]));
		}

		Arrays.sort(p, Comparator.reverseOrder());


		long X = 0;
		long Y = 0;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				X += p[i].a;
			else
				Y += p[i].b;
		}
		System.out.println(X - Y);
	}
}

class Pair implements Comparable<Pair> {
	long a;
	long b;

	public Pair(long a, long b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Pair p) {
		long max = Math.max(a, b);
		long maxP = Math.max(p.a, p.b);
		if (max > maxP) {
			return 1;
		} else if (max < maxP) {
			return -1;
		} else {
			long min = Math.min(a, b);
			long minP = Math.min(p.a, p.b);
			if (min > minP) {
				return 1;
			} else if (min < minP) {
				return -1;
			} else {
				return -1;
			}
		}
	}
}