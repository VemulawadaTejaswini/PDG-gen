import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long K;
	long[] A;
	List<Long> list;
	List<Long> underZero, upperZero;
	int zeroCount = 0;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Long.parseLong(tokens[1]);
		A = new long[N];
		tokens = in.readLine().split(" ");
		this.underZero = new ArrayList<>();
		this.upperZero = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
			if (A[i] > 0) {
				upperZero.add(A[i]);
			} else if (A[i] < 0) {
				underZero.add(A[i]);
			} else {
				++zeroCount;
			}
		}
		// Collections.sort(underZero);
		// Collections.sort(upperZero);
	}

	long findUnderZero(long index) {
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < underZero.size(); ++i) {
			for (int j = 0; j < upperZero.size(); ++j) {
				list.add(underZero.get(i) * upperZero.get(j));
			}
		}
		Collections.sort(list);
		return list.get((int) index - 1);
	}

	long findUpperZero(long index) {
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < underZero.size(); ++i) {
			for (int j = i + 1; j < underZero.size(); ++j) {
				list.add(underZero.get(i) * underZero.get(j));
			}
		}
		for (int i = 0; i < upperZero.size(); ++i) {
			for (int j = i + 1; j < upperZero.size(); ++j) {
				list.add(upperZero.get(i) * upperZero.get(j));
			}
		}
		Collections.sort(list);
		return list.get((int) index - 1);
	}

	void calc() {
		long zeroNum = zeroCount * (upperZero.size() + underZero.size()) + (zeroCount * (zeroCount - 1)) / 2;
		long upperZeroNum = upperZero.size() * (upperZero.size() - 1) / 2
				+ underZero.size() * (underZero.size() - 1) / 2;
		long underZeroNum = upperZero.size() * underZero.size();
		if (K <= underZeroNum) {
			result = findUnderZero(K);
		} else if (K <= underZeroNum + zeroNum) {
			result = 0;
		} else {
			result = findUpperZero(K - underZeroNum - zeroNum);
		}
	}

	void showResult() {
		System.out.println(result);
	}
}