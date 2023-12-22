import java.util.*;

class Main {
	static int N, Ma, Mb;
	static int[] a, b, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Ma = sc.nextInt();
		Mb = sc.nextInt();
		a = new int[N];
		b = new int[N];
		c = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		class State implements Comparable<State> {
			int cost;
			int criterion;

			public State(int a_sum, int b_sum, int cost) {
				this.cost = cost;
				criterion = Ma * b_sum - Mb * a_sum;
			}
			
			public State(int criterion,int cost) {
				this.criterion=criterion;
				this.cost=cost;
			}

			public int compareTo(State o) {
				int comp = -Integer.compare(criterion, o.criterion);
				if (comp == 0) {
					return -Integer.compare(cost, o.cost);
				} else
					return comp;
			};
		}
		ArrayList<State> state1 = new ArrayList<>();
		ArrayList<State> state2 = new ArrayList<>();
		ArrayList<State> tmp = new ArrayList<>();
		for (int s = 0; s < (1 << (N / 2)); ++s) {
			int cost = 0, a_sum = 0, b_sum = 0;
			for (int j = 0; j < N / 2; ++j) {
				if ((s & (1 << j)) > 0) {
					a_sum += a[j];
					b_sum += b[j];
					cost += c[j];
				}
			}
			state1.add(new State(a_sum, b_sum, cost));
		}
		for (long s = (1l << N) - 1; s >= 1l << (N / 2); --s) {
			int cost = 0, a_sum = 0, b_sum = 0;
			for (int j = N - 1; j >= N / 2; --j) {
				if ((s & (1l << j)) > 0) {
					a_sum += a[j];
					b_sum += b[j];
					cost += c[j];
				}
			}
			tmp.add(new State(a_sum, b_sum, cost));
		}
		long ans = Long.MAX_VALUE / 16;
		Collections.sort(tmp);
		for (int i = 0; i < tmp.size(); ++i) {
			while (i + 1 < tmp.size() && tmp.get(i).criterion == tmp.get(i + 1).criterion
					&& tmp.get(i).cost >= tmp.get(i + 1).cost)
				++i;
			state2.add(tmp.get(i));
		}
		for (int i = 0; i < state1.size(); ++i) {
			State s1 = state1.get(i);
			int upper = state2.size();
			int lower = -1;
			while (upper - lower > 1) {
				int middle = (upper + lower) / 2;
				if (-state2.get(middle).criterion >= s1.criterion) {
					upper = middle;
				} else {
					lower = middle;
				}
			}
			if (upper < state2.size() && -state2.get(upper).criterion == s1.criterion) {
				ans = Math.min(ans, state2.get(upper).cost + s1.cost);
			}
		}
		if (ans == Long.MAX_VALUE / 16) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}