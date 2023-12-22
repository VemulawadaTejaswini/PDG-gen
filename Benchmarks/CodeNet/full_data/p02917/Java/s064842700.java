
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] B = new int[N - 1];
		for (int i = 0; i < N - 1; ++i) {
			B[i] = Integer.parseInt(tokens[i]);
		}
		int[] A = new int[N];
		A[0] = B[0];
		A[N - 1] = B[N - 2];
		for (int i = 1; i < N - 1; ++i) {
			A[i] = Math.min(B[i - 1], B[i]);
		}
		long result = 0L;
		for (int i = 0; i < N; ++i) {
			result += A[i];
		}
		System.out.println(result);
	}

}
