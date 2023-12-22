
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 頂点の作成
		Node[][] nodes = new Node[n][n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				nodes[i][j] = new Node(i, j);
			}
		}

		int next = 0;
		int pre = 0;
		// 各頂点に辺情報の追加
		for (int i = 0; i < n; i++) {
			pre = sc.nextInt() - 1;
			for (int j = 0; j < n - 2; j++) {
				next = sc.nextInt() - 1;
				nodes[Math.min(i, pre)][Math.max(i, pre)].outEdges.add(nodes[Math.min(i, next)][Math.max(i, next)]);
				nodes[Math.min(i, next)][Math.max(i, next)].inEdges.add(nodes[Math.min(i, pre)][Math.max(i, pre)]);
				pre = next;
			}
		}

		// デバッグ用　頂点情報表示
		/*
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				debugPrint(nodes[i][j]);
			}
		}
		*/

		// 日数の計算
		int day = 0;
		List<Node> doNode = new ArrayList<Node>();
		ArrayList<Node> allNode = new ArrayList<Node>();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				allNode.add(nodes[i][j]);
				if (nodes[i][j].inEdges.isEmpty()) {
					doNode.add(nodes[i][j]);
				}
			}
		}
		ArrayList<Node> tempAllNode;
		while (!doNode.isEmpty()) {
			for (Node matchNode : doNode) {
				tempAllNode = (ArrayList<Node>) allNode.clone();
				for (Node node : tempAllNode) {
					if (node.equals(matchNode)) {
						allNode.remove(matchNode);
					}
					if (node.inEdges.contains(matchNode)) {
						node.inEdges.remove(matchNode);
					}
					if (node.outEdges.contains(matchNode)) {
						node.outEdges.remove(matchNode);
					}
				}
			}

			// 次の試合を計算
			doNode = new ArrayList<Node>();
			for (Node node : allNode) {
				if (node.inEdges.isEmpty()) {
					doNode.add(node);
				}
			}

			day++;
		}

		if (day == 0)
			day = -1;

		System.out.println(day);

		sc.close();
	}

	private static void debugPrint(Node node) {
		System.out.println("=====================================================================");
		System.out.println("node(" + node.idA + ", " + node.idB + ")");
		System.out.print("inEdges : ");
		for (Node inEdge : node.inEdges) {
			System.out.print("(" + inEdge.idA + ", " + inEdge.idB + ")");
		}
		System.out.println();
		System.out.print("outEdges : ");
		for (Node outEdge : node.outEdges) {
			System.out.print("(" + outEdge.idA + ", " + outEdge.idB + ")");
		}
		System.out.println();
	}

	static class Node {
		int idA;
		int idB;
		List<Node> inEdges;
		List<Node> outEdges;

		public Node(int idA, int idB) {
			this.idA = idA;
			this.idB = idB;
			this.inEdges = new ArrayList<Node>();
			this.outEdges = new ArrayList<Node>();
		}
	}
}
