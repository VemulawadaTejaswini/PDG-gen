import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long S = sc.nextLong();

		StringBuilder sb = new StringBuilder();
		if (K == 0) {
			if (S == 0) {
				for (int i = 0; i < N; i++) {
					sb.append('1').append(" ");
				}
			} else {
				for (int i = 0; i < N; i++) {
					sb.append('0').append(" ");
				}
			}

			System.out.println(sb.toString());
			return;
		}

		for (int i = 0; i < K; i++) {
			sb.append(S).append(" ");
		}

		for (int i = 1; i <= N - K; i++) {
			if (S + (N - K) >= 1000000000) {
				sb.append(S - (i * 10)).append(" ");
			} else {
				sb.append(S + i).append(" ");
			}

		}

		System.out.println(sb.toString());
	}
}
