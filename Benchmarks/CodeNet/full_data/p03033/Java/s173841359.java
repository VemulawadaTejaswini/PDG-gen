import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long[][] STX = new long[N][3];
		for (int i = 0; i < N; i++) {
			STX[i][0] = sc.nextLong();
			STX[i][1] = sc.nextLong();
			STX[i][2] = sc.nextLong();
			STX[i][0] -= STX[i][2];
			STX[i][1] -= STX[i][2];
		}
		Arrays.sort(STX, (a, b) -> Long.compare(a[2], b[2]));

		NavigableSet<long[]> s = new TreeSet<>((a, b) -> Long.compare(a[0], b[0]));
		for (int i = 0; i < Q; i++) {
			long d = sc.nextLong();
			s.add(new long[]{d, i});
		}

		long[] answer = new long[Q];
		Arrays.fill(answer, Long.MAX_VALUE);

		for (int i = 0; i < N; i++) {
			long[] stx = STX[i];
			while (true) {
				if (s.isEmpty()) break;
				long[] x = s.ceiling(new long[]{stx[0], 0});
				if (x == null) break;
				if (x[0] >= stx[1]) break;
				answer[(int) x[1]] = stx[2];
				s.remove(x);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			if (answer[i] == Long.MAX_VALUE) {
				sb.append(-1);
			} else {
				sb.append(answer[i]);
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}


}
