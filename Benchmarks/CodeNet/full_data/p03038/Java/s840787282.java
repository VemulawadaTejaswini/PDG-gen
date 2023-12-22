import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
	int cnt;
	int num;

	Pair(int cnt, int num) {
		this.cnt = cnt;
		this.num = num;
	}

	@Override
	public int compareTo(Pair o) {
		if (this.num > o.num) return -1;
		else if (this.num < o.num) return 1;
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			PriorityQueue<Pair> a = new PriorityQueue<>();

			for (int i = 0; i < n; i++) a.add(new Pair(1, sc.nextInt()));
			for (int i = 0; i < m; i++) a.add(new Pair(sc.nextInt(), sc.nextInt()));

			long sum = 0;
			int cnt = 0;
			while (cnt < n) {
				Pair pair = a.poll();
				for (int i = 0; i < pair.cnt; i++) {
					sum += pair.num;
					cnt++;
					if (cnt >= n) break;
				}
			}
			System.out.println(sum);
		}
	}
}