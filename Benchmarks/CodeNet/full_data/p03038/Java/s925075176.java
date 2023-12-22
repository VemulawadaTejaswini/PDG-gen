import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);
			pq.add(new Pair(1, a));
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			long c = Long.parseLong(str[1]);

			pq.add(new Pair(b, c));
		}

		long ans = 0;
		long count = 0;

		for (int i = 0; i < n; i++) {
			Pair p = pq.poll();
			if (count + p.size <= n) {
				ans += p.size * p.value;
				count += p.size;
			} else {
				ans += (n - count) * p.value;
				count = n;
				break;
			}
		}

		System.out.println(ans);
	}
}

class Pair implements Comparable<Pair> {
	int size;
	long value;

	public Pair(int size, long value) {
		this.size = size;
		this.value = value;
	}

	@Override
	public int compareTo(Pair p) {
		return Long.compare(this.value, p.value);
	}
}