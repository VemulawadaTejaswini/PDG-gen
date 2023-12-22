import java.util.*;

public class Main {
	int N;
	List<Long> A;
	long minA = Long.MAX_VALUE;
	long count = 0L;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new ArrayList<>(N);
		long v = in.nextLong();
		A.add(v);
		minA = Math.min(minA, v);
		long prev = v;
		for (int i = 1; i < N; ++i) {
			v = in.nextLong();
			A.add(v);
			minA = Math.min(minA, v);
			if (v <= prev) {
				count++;
			}
			prev = v;
		}
		in.close();
	}

	void calc() {
		result = 1;
		while (true) {
			if (Math.pow((double) result, (double) minA) >= (double) count) {
				break;
			}
			result++;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println((ins.result));
	}

}