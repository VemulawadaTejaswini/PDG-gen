import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int size = getSize(N);
		if (size == 0) {
			System.out.println(NO);
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(YES).append("\n");
		sb.append(size + 1).append("\n");

		int[][] S = new int[size + 1][size];
		int index = 1;
		for (int i = 0; i <= size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0) S[i][j] = index++;
				else {
					if (j < i) {
						S[i][j] = S[j][i - 1];
					} else {
						S[i][j] = index++;
					}
				}
			}
		}
		for (int i = 0; i <= size; i++) {
			sb.append(size).append(" ");
			for (int j = 0; j < size; j++) {
				sb.append(S[i][j]).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	private static int getSize(long a) {
		int k = 0, i = 1;

		while (a > 0) {
			a -= i;
			i++;
			k++;
		}
		if (a == 0) return k;
		else return 0;
	}
}
