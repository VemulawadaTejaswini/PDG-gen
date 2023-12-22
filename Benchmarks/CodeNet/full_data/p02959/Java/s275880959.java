import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] A = new long[N + 1];
		long[] B = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i <= N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			B[i] = Long.parseLong(tokens[i]);
		}
		long count = 0;
		for (int i = 0; i < N; ++i) {
			if (A[i] >= B[i]) {
				count += B[i];
				B[i] = 0;
			} else {
				count += A[i];
				B[i] -= A[i];
			}
			if (B[i] > 0) {
				long val = Math.min(A[i + 1], B[i]);
				count += val;
				A[i + 1] -= val;
			}
		}
		System.out.println(count);
	}
}