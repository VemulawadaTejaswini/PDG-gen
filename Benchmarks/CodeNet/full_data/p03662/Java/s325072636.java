import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[][] map = new int[n][n];
		int a, b;
		for (int i = 0; i < n - 1; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			map[a][b]++;
			map[b][a]++;
		}
		ArrayDeque<Pos> deque = new ArrayDeque<>();
		boolean[] memo = new boolean[n];
		int[] fen = new int[n];
		deque.add(new Pos(0, 0));
		memo[0] = true;
		while (!deque.isEmpty()) {
			Pos tmp = deque.poll();
			for (int i = 0; i < n; i++) {
				if (map[tmp.x][i] == 1 && !memo[i]) {
					deque.add(new Pos(i, tmp.rank + 1));
					fen[i] = tmp.rank + 1;
					memo[i] = true;
				}
			}
		}

		deque = new ArrayDeque<>();
		memo = new boolean[n];
		int[] snuke = new int[n];
		deque.add(new Pos(n - 1, 0));
		memo[n - 1] = true;
		while (!deque.isEmpty()) {
			Pos tmp = deque.poll();
			for (int i = 0; i < n; i++) {
				if (map[tmp.x][i] == 1 && !memo[i]) {
					deque.add(new Pos(i, tmp.rank + 1));
					snuke[i] = tmp.rank + 1;
					memo[i] = true;
				}
			}
		}

		int fcnt = 0, scnt = 0;
		for (int i = 0; i < n; i++) {
			if (fen[i] <= snuke[i]) {
				fcnt++;
			} else {
				scnt++;
			}
		}
		if (fcnt > scnt) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}
}

class Pos {
	int x;
	int rank;

	public Pos(int x, int rank) {
		this.x = x;
		this.rank = rank;
	}
}