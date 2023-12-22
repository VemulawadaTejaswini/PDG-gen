import java.util.*;
import java.util.stream.Collectors;

public class Main {

	private static NavigableSet<Integer>[] g;
	private static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		g = new TreeSet[n + 1];
		for (int i = 0; i < g.length; i++) {
			g[i] = new TreeSet<>();
		}

		Set<Integer> current = new HashSet<>();
		int d = 0;
		for (int i = s.length() - 1; i >= 0; ) {
			while (i - d >= 0 && d <= m) {
				if (s.charAt(i - d) == '0') current.add(i - d);
				d++;
			}

			current.remove(i);

			for (Integer j : current) {
				g[i].add(j);
			}

			i--;
			d--;

			while (i >= 0 && s.charAt(i) == '1') {
				i--;
				d--;
			}
		}

		visited = new boolean[n + 1];
		List<Integer> answer = dfs(n, new ArrayList<>());

		if (answer == null) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = answer.size() - 1; i >= 0; i--) {
			sb.append(answer.get(i));
			sb.append(" ");
		}

		System.out.println(sb.toString());
	}

	private static List<Integer> dfs(int x, List<Integer> a) {
		if (visited[x]) return null;
		visited[x] = true;
		if (x == 0) return a;

		if (g[x].isEmpty()) return null;

		for (Integer i : g[x]) {
			a.add(x - i);
			List<Integer> b = dfs(i, a);
			if (b != null) return b;
			a.remove(a.size() - 1);
		}

		return null;
	}
}
