import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node implements Cloneable {
	int h, w;
	List<List<Integer>> route = new ArrayList<>();

	public Node clone() {
		Node newNode = new Node();
		newNode.h = h;
		newNode.w = w;
		for (int i = 0; i < route.size(); i++) {
			newNode.route.add(new ArrayList<>(route.get(i)));
		}
		return newNode;
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		int[][] s = new int[H + 1][W + 1]; // 1オリジン。0は使わない

		for (int i = 1; i <= H; i++) {
			String x = sc.next();
			for (int j = 1; j <= W; j++) {
				s[i][j] = x.charAt(j - 1) == '.' ? 0 : 1; // 0は白、1は黒。
			}
		}

		sc.close();

		boolean[][] visited = new boolean[H + 1][W + 1];

		Queue<Node> que = new ArrayDeque<>();
		Node st = new Node();
		st.h = 1;
		st.w = 1;
		st.route.add(Arrays.asList(1, 1)); // 初期地点を登録
		que.add(st);

		boolean noSolution = false;
		Node n;
		// 経路を探索
		while (true) {
			n = que.poll();

			// 調べるべきノードがない場合は、解がない場合
			if (n == null) {
				noSolution = true;
				break;
			}

			// 範囲外ならとばす
			if (n.h <= 0 || n.h > H || n.w <= 0 || n.w > W) {
				continue;
			}

			// 黒のマスならとばす
			if (s[n.h][n.w] == 1) {
				continue;
			}

			// ゴールならループを抜ける
			if (n.h == H && n.w == W) {
				break;
			}

			// すでに訪問済みなら、queに登録ずみなのでとばす
			if (visited[n.h][n.w]) {
				continue;
			}

			// 訪問済みにマーク
			visited[n.h][n.w] = true;

			Node right = n.clone();
			right.w++;
			right.route.add(Arrays.asList(right.h, right.w));
			que.add(right);

			Node down = n.clone();
			down.h++;
			down.route.add(Arrays.asList(down.h, down.w));
			que.add(down);

			Node left = n.clone();
			left.w--;
			left.route.add(Arrays.asList(left.h, left.w));
			que.add(left);

			Node top = n.clone();
			top.h--;
			top.route.add(Arrays.asList(top.h, top.w));
			que.add(top);

		}

		if (noSolution) {
			out.println("-1");
			return;
		}

		// n.routeが最短経路なので、そこを通り道としてマークする
		for (List<Integer> r : n.route) {
			s[r.get(0)][r.get(1)] = 2;
		}

		// 黒でもなく最短経路でもないマスを数える。
		int ans = 0;
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (s[i][j] == 0) {
					ans++;
				}
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
