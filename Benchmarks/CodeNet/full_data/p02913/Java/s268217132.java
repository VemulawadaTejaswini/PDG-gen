import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static int[][] array;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();
		int max = 0;
		for (int i = 0; i < S.length(); ++i) {
			max = Math.max(max, subFunc(S.substring(i, S.length())));
		}
		System.out.println(max);
	}

	static int subFunc(String S) {
		int[] A = new int[S.length()];
		Arrays.fill(A, 0);
		A[0] = S.length();
		int i = 1, j = 0;
		while (i < S.length()) {
			while (i + j < S.length() && S.charAt(j) == S.charAt(i + j)) {
				++j;
			}
			A[i] = j;
			if (j == 0) {
				++i;
				continue;
			}
			int k = 1;
			while (i + k < S.length() && k + A[k] < j) {
				A[i + k] = A[k];
				++k;
			}
			i += k;
			j -= k;
		}

		int max = -1;
		for (int k = A.length % 2 == 0 ? A.length / 2 : A.length / 2 + 1; k < A.length; ++k) {
			max = Math.max(max, A[k]);
		}
		return max;
	}
}