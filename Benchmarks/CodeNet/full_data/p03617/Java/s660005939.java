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
		long N = sc.nextLong();
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
		pq.add(new State(0.25, a[0]));
		pq.add(new State(0.5, a[1]));
		pq.add(new State(1, a[2]));
		pq.add(new State(2, a[3]));
		double cost = 0;
		double cur = 0;
		while (Math.abs(N - cur) > 0.000001) {
			State s = pq.poll();
			int num = (int) ((N - cur) / s.volume);
			cost += s.value * num;
			cur += s.volume * num;
		}
		System.out.println(Math.round(cost));
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}