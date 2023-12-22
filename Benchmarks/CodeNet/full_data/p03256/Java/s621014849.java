
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ABGraph g = new ABGraph(sc);
		if (g.Topo())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

class ABGraph {
	int v;
	String s;
	List<Integer>[] link;
	int[][] nextcountAB;

	public ABGraph(Scanner sc) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		s = sc.next();
		this.v = n;
		link = new ArrayList[n];
		nextcountAB = new int[n][2];
		for (int i = 0; i < n; i++) {
			link[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			link[a].add(b);
			nextcountAB[a][s.charAt(b) == 'A' ? 0 : 1] += 1;
			if (a != b) {
				link[b].add(a);
				nextcountAB[b][s.charAt(a) == 'A' ? 0 : 1] += 1;
			}
		}
	}

	public boolean Topo() {
		Queue<Integer> q = getLastNode();
		// System.out.println(q.size());
		while (q.size() > 0) {
			Integer n = q.remove();
			//System.out.println(n);
			for (int i = link[n].size() - 1; i >= 0; i--) {
				Integer m = link[n].get(i);

				link[n].remove(m);
				nextcountAB[n][s.charAt(m) == 'A' ? 0 : 1]--;
				if (n != m) {
					link[m].remove(n);
					nextcountAB[m][s.charAt(n) == 'A' ? 0 : 1]--;

					if ((nextcountAB[m][0] < 1 || nextcountAB[m][1] < 1)) {
						q.add(m);
					}
				}
			}

		}

		return hasCheck();
	}

	private boolean hasCheck() {
		for (int i = 0; i < v; i++) {
			if (nextcountAB[i][0] > 0 || nextcountAB[i][1] > 0)
				return true;
		}
		return false;
	}

	private Queue<Integer> getLastNode() {
		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < v; i++) {
			if (nextcountAB[i][0] < 1 || nextcountAB[i][1] < 1)
				q.add(i);
		}
		return q;
	}

}
