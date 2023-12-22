import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();)
			solver.readBody(in.readLine());
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;
	TreeMap<Long, Integer> Member;

	public void init() {
		N = 0;
		cnt = 0;
		Member = new TreeMap<Long, Integer>(new Comparator<Long>() {
			public int compare(Long m, Long n) {
				return ((Long) m).compareTo(n) * -1;
			}
		});
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < 1;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		for (int i = 0; i < 3 * N; i++) {
			long a = Long.parseLong(strArr[i]);
			if (Member.containsKey(a))
				Member.put(a, Member.get(a) + 1);
			else
				Member.put(a, 1);
		}
		cnt++;
	}

	public void solve() {
		long total = 0;
		boolean even = false;
		int grp = 0;
		for (long a : Member.keySet()) {
			for (int i = 0; i < Member.get(a) && grp < N; i++) {
				// System.out.println(a);
				if (even) {
					total += a;
					grp++;
				}
				even = !even;
			}
			if (grp >= N)
				break;
		}
		System.out.println(total);
	}
}
