import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		PriorityQueue<SortD> pq1 = new PriorityQueue<>();
		PriorityQueue<SortC> pq2 = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			pq1.add(new SortD(a, b));
			pq2.add(new SortC(a, b));
		}

		int now = m;
		long sum1 = 0;
		long sum2 = 0;

		for (SortD s : pq1) {
			if (s.day <= now) {
				sum1 += s.cost;
				now--;
			}
			if (now <= 0) {
				break;
			}
		}

		now = m;
		for (int i = 0; i < n; i++) {
			SortC s = pq2.poll();
			if (s.day <= now) {
				sum2 += s.cost;
				now--;
			}
			if (now <= 0) {
				break;
			}
		}

		System.out.println(Math.max(sum1, sum2));
	}

}

class SortD implements Comparable<SortD> {
	int day;
	int cost;

	public SortD(int day, int cost) {
		this.day = day;
		this.cost = cost;
	}

	@Override
	public int compareTo(SortD s) {
		return s.day - this.day;
	}
}

class SortC implements Comparable<SortC> {
	int day;
	int cost;

	public SortC(int day, int cost) {
		this.day = day;
		this.cost = cost;
	}

	@Override
	public int compareTo(SortC s) {
		return s.cost - this.cost;
	}
}
