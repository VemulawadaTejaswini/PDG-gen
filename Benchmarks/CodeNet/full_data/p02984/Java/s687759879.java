import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		long first = calcFirst(A);
		List<Long> results = calc(A, first);
		showResult(results);
		in.close();
	}

	static void showResult(List<Long> results) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(Long.toString(results.get(0)));
		for (int i = 1; i < results.size(); ++i) {
			strBuilder.append(" " + Long.toString(results.get(i)));
		}
		System.out.println(strBuilder.toString());
	}

	static List<Long> calc(long[] A, long first) {
		List<Long> result = new ArrayList<>();
		result.add(first);
		for (int i = 1; i < A.length; ++i) {
			long prev = result.get(i - 1) / 2;
			long next = (A[i - 1] - prev) * 2;
			result.add(next);
		}
		return result;
	}

	static long calcFirst(long[] A) {
		long result = 0;
		for (int i = 0; i < A.length; ++i) {
			if (i % 2 == 0) {
				result += A[i];
			} else {
				result -= A[i];
			}
		}
		return result;
	}

}
