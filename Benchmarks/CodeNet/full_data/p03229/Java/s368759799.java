import java.util.*;

public class Main {
	int N;
	List<Long> A;
	long result = 0;
	long resultB = 0;

	private Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			A.add(in.nextLong());
		}
		in.close();
		Collections.sort(A);
	}

	private void calc() {
		Deque<Long> origs = new ArrayDeque<>(N);
		for (int i = 0; i < N; ++i) {
			origs.addLast(A.get(i));
		}

		Deque<Long> targets = new ArrayDeque<>(N);
		targets.addLast(origs.pollFirst());

		boolean getSmall = false;
		while (!origs.isEmpty()) {
			if (getSmall) {
				if (origs.size() != 1) {
					targets.addLast(origs.pollFirst());
					targets.addFirst(origs.pollFirst());
				} else {
					targets.addLast(origs.pollFirst());
				}
			} else {
				if (origs.size() != 1) {
					targets.addLast(origs.pollLast());
					targets.addFirst(origs.pollLast());
				} else {
					targets.addLast(origs.pollLast());
				}
			}
			getSmall = !getSmall;
		}

		long prev = targets.pollFirst();
		while (!targets.isEmpty()) {
			long current = targets.pollFirst();
			result += Math.abs(current - prev);
			prev = current;
		}
	}

	private void calcB() {
		Deque<Long> origs = new ArrayDeque<>(N);
		for (int i = 0; i < N; ++i) {
			origs.addLast(A.get(i));
		}

		Deque<Long> targets = new ArrayDeque<>(N);
		targets.addLast(origs.pollLast());

		boolean getSmall = true;
		while (!origs.isEmpty()) {
			if (getSmall) {
				if (origs.size() != 1) {
					targets.addLast(origs.pollFirst());
					targets.addFirst(origs.pollFirst());
				} else {
					targets.addLast(origs.pollFirst());
				}
			} else {
				if (origs.size() != 1) {
					targets.addLast(origs.pollLast());
					targets.addFirst(origs.pollLast());
				} else {
					targets.addLast(origs.pollLast());
				}
			}
			getSmall = !getSmall;
		}

		long prev = targets.pollFirst();
		while (!targets.isEmpty()) {
			long current = targets.pollFirst();
			resultB += Math.abs(current - prev);
			prev = current;
		}
	}

	private void show() {
		System.out.println(Math.max(result, resultB));
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.calcB();
		ins.show();
	}
}