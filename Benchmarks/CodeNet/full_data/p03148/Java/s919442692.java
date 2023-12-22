import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long[][] l = new long[n][2];
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt() - 1;
			long d = sc.nextLong();
			l[i] = new long[]{d, t};
		}

		Arrays.sort(l, Comparator.comparing((i) -> -i[0]));

		Set<Long> s = new HashSet<>();
		long answer = 0;

		for (int i = 0; i < k; i++) {
			answer += l[i][0];
			if (s.contains(l[i][1])) {
				l[i][1] = -1;
			} else {
				s.add(l[i][1]);
				l[i][1] = -2;
			}
		}

		long x = answer;
		answer += s.size() * s.size();
		int dup = k - 1;

		int p = k;
		while (s.size() < k) {
			while (p < n && s.contains(l[p][1])) {
				l[p][1] = -1;
				p++;
			}
			if (p >= n) break;
			while (dup >= 0 && l[dup][1] == -2) dup--;
			if (dup < 0) break;
			x -= l[dup--][0];
			x += l[p][0];
			s.add(l[p][1]);
			l[p++][1] = -2;
			answer = Math.max(answer, x + s.size() * s.size());
		}

		System.out.println(answer);
	}
}
