import java.util.*;

public class Main {
	static HashMap<Integer,Node> map = new HashMap<>();
	static class Node {
		int n;
		int dist = -1;
		ArrayList<Node> links = new ArrayList<>();
		ArrayList<Node> links2 = new ArrayList<>();
		ArrayList<Node> links3 = new ArrayList<>();
		Node(int n) {
			this.n = n;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			map.put(i + 1, new Node(i));
		}
		for (int i = 0; i < m; i++) {
			Node from = map.get(sc.nextInt());
			Node to = map.get(sc.nextInt());
			from.links.add(to);
		}

		for (Node node : map.values()) {
			for (Node n1 : node.links) {
				for (Node n2 : n1.links) {
					for (Node n3 : n2.links) {
						if (!n3.links2.contains(node)) {
							n3.links2.add(node);
						}
					}
				}
			}
		}
		
		Node start = map.get(sc.nextInt());
		Node goal = map.get(sc.nextInt());

		goal.dist = 0;
		while (true) {
			int minDist = Integer.MAX_VALUE;
			Node target0 = null;
			Node target = null;
			for (Node node : map.values()) {
				for (Node n1 : node.links2) {
					if (node.dist >= 0 && n1.dist < 0 && node.dist + 1 < minDist) {
						minDist = node.dist + 1;
						target0 = node;
						target = n1;
					}
				}
			}
          	if (target == null) {
              break;
            }
			if (target != null) {
				target0.links3.add(target);
				target.dist = minDist;
			}
			if (target == start) {
				System.out.println(target.dist);
			}
		}
	}
	
}
