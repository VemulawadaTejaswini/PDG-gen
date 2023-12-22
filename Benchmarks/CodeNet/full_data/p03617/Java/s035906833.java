import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long[] a = { sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong() };
		long N = 4 * sc.nextLong();
		class State implements Comparable<State> {
			double volume;
			long value;

			public State(double volume_, long value_) {
				volume = volume_;
				value = value_;
			}

			public int compareTo(State o) {
				return Double.compare(value / volume, o.value / o.volume);
			};
		}
		PriorityQueue<State> pq = new PriorityQueue<>();
		pq.add(new State(1, a[0]));
		pq.add(new State(2, a[1]));
		pq.add(new State(4, a[2]));
		pq.add(new State(8, a[3]));
		long cost = 0;
		long cur = 0;
		while (Math.abs(N - cur) > 0) {
			State s = pq.poll();
			long num = (long) ((N - cur) / (long) s.volume);
			cost += (long) s.value * num;
			cur += (long) s.volume * num;
		}
		System.out.println(cost);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}