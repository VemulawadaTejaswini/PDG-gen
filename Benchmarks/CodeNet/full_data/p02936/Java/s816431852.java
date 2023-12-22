import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		Node[] nodes = new Node[n];

		for (int i = 0; i < n; i++) {
			nodes[i] = new Node();
		}

		for (int i = 0; i < n - 1; i++) {
			int pa = Integer.parseInt(sc.next()) - 1;
			int ko = Integer.parseInt(sc.next()) - 1;

			nodes[pa].ko.add(ko);
		}

		for (int i = 0; i < q; i++) {
			int pa = Integer.parseInt(sc.next()) - 1;
			int add = Integer.parseInt(sc.next());

			nodes[pa].num += add;

			// ここを再帰的にしたい
			addNum(nodes, pa, add);

		}

		for (int i = 0; i < n; i++) {
			System.out.print(i == 0 ? "" : " ");
			System.out.print(nodes[i].num);
		}
		System.out.println();

	}

	static void addNum(Node[] nodes, int pa, int add) {
		for (int j = 0; j < nodes[pa].ko.size(); j++) {
			nodes[nodes[pa].ko.get(j)].num += add;
			if(nodes[pa].ko.size()>0) {
				addNum(nodes,nodes[pa].ko.get(j),add);
			}
		}
	}

}

class Node {
	int num;
	ArrayList<Integer> ko = new ArrayList<Integer>();
}