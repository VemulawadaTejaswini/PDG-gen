import java.util.*;

public class Main {
	List<Long> A, B;
	int N;
	List<Long> diffs;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		A = new ArrayList<>(N);
		B = new ArrayList<>(N);
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < tokens.length; ++i) {
			A.add(Long.parseLong(tokens[i]));
		}
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < tokens.length; ++i) {
			B.add(Long.parseLong(tokens[i]));
		}
		in.close();

		diffs = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			diffs.add(A.get(i) - B.get(i));
		}
	}

	int calc() {
		List<Long> pluses = new ArrayList<>();
		List<Long> minuses = new ArrayList<>();
		long minusSum = 0;
		for (int i = 0; i < N; ++i) {
			if (diffs.get(i) > 0) {
				pluses.add(diffs.get(i));
			}
			if (diffs.get(i) < 0) {
				minuses.add(diffs.get(i));
				minusSum -= diffs.get(i);
			}
		}
		if (minusSum == 0) {
			return 0;
		}
		Collections.sort(pluses);
		Collections.reverse(pluses);
		long sum = 0;
		int result = 0;
		for (int i = 0; i < pluses.size(); ++i) {
			sum += pluses.get(i);
			if (sum >= minusSum) {
				result = i + 1;
				break;
			}
		}
		result += minuses.size();
		return result;
	}

	boolean isEnable() {
		long sum = 0L;
		for (Long diff : diffs) {
			sum += diff;
		}
		if (sum >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		if (!ins.isEnable()) {
			System.out.println(-1);
		} else {
			System.out.println(ins.calc());
		}
	}

}