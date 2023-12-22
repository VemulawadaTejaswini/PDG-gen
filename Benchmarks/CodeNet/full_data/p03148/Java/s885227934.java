import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long[][] l = new long[n][2];
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			long d = sc.nextLong();
			l[i] = new long[]{d, t};
		}

		Arrays.sort(l, Comparator.comparing((i) -> -i[0]));

		Set<Long> s = new HashSet<>();

		long x = 0;
		for (int i = 0; i < k; i++) {
			x += l[i][0];
			if (s.contains(l[i][1])) {
				l[i][1] = -1;
			} else {
				s.add(l[i][1]);
				l[i][1] = -2;
			}
		}

		long answer = x + (s.size() * s.size());

		int p = k;
		int dup = k - 1;

		while (true) {
			while (p < n && s.contains(l[p][1])) p++;
			if (p >= n) break;

			while (dup >= 0 && l[dup][1] != -1) dup--;
			if (dup < 0) break;

			s.add(l[p][1]);
			l[p][1] = -2;
			x = x - l[dup--][0] + l[p++][0];
			answer = Math.max(answer, x + ((long) s.size() * s.size()));
		}

		System.out.println(answer);
	}
}
