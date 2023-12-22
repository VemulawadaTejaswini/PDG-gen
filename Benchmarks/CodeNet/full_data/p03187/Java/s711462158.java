import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	long L;
	int N;
	List<Long> X;
	long result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		L = in.nextLong();
		N = in.nextInt();
		X = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			X.add(in.nextLong());
		}
		in.close();
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			Deque<Long> queue = new LinkedBlockingDeque<>();
			queue.addAll(X);
			result = Math.max(result, calc(queue, true, i));
		}
		for (int i = 0; i < N; ++i) {
			Deque<Long> queue = new LinkedBlockingDeque<>();
			queue.addAll(X);
			result = Math.max(result, calc(queue, false, i));
		}
	}

	long calc(Deque<Long> X, boolean direction, int firstChangeDirIndex) {
		long result = 0;
		long position = 0L;
		int index = 0;
		while (!X.isEmpty()) {
			long dist = 0;
			if (direction) {
				long x = X.pollFirst();
				dist = (x - position + L) % L;
				position = x;
			} else {
				long x = X.pollLast();
				dist = (position - x + L) % L;
				position = x;
			}
			result += dist;
			if (index >= firstChangeDirIndex) {
				direction = !direction;
			}
			index++;
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}
}