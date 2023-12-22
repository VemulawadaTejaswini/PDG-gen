import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(A);
		double sum = 0.0;
		for (int i = N - 1; i >= 0; --i) {
			sum += 1.0 / (double) (A[i]);
		}
		sum = 1.0 / sum;
		System.out.println(sum);

	}
}
