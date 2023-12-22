import java.util.*;

public class Main {
	int N;
	long K;
	List<Long> A;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Long.parseLong(tokens[1]);
		tokens = in.nextLine().split(" ");
		in.close();
		A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			A.add(Long.parseLong(tokens[i]));
		}
		Collections.sort(A);
	}

	int getKetasuu(long max) {
		int result = 1;
		long temp = 2;
		while (temp < max) {
			temp *= 2;
			result++;
		}
		return result;
	}

	void countOne(long val, int[] oneCounts) {
		int index = 0;
		while (val != 0) {
			if (val % 2 == 1) {
				oneCounts[index]++;
			}
			val /= 2;
			++index;
		}
	}

	long calcX(int[] oneCounts) {
		long addVal = 1;
		long x = 0;
		for (int i = 0; i < oneCounts.length; ++i) {
			if (oneCounts[i] < N - oneCounts[i]) {
				if (x + addVal > K) {
					break;
				}
				x += addVal;
			}
			addVal *= 2;
		}
		return x;
	}

	long calc() {
		long x = 0L;
		if (K > 0) {
			int ketasuu = getKetasuu(K);
			int[] oneCounts = new int[ketasuu];
			Arrays.fill(oneCounts, 0);
			for (Long val : A) {
				countOne(val, oneCounts);
			}
			x = calcX(oneCounts);
		}
		long result = 0;
		for (int i = 0; i < A.size(); ++i) {
			result += x ^ A.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		System.out.println(ins.calc());
	}

}