import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private  static Map<Integer, Node> nodeMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		nodeMap.put(a, new Node(b));
		nodeMap.put(b, new Node());
		for (int i=1; i<N - 1; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			Node aNode = nodeMap.get(a);
			if (aNode == null) {
				aNode = new Node();
				nodeMap.put(a, aNode);
			}
			aNode.children.add(b);
			Node bNode = nodeMap.get(b);
			if (bNode == null) {
				nodeMap.put(b, new Node());
			}
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			Node pNode = nodeMap.get(p);
			pNode.count += x;
			count(pNode, x);
		}
		
		System.out.print(nodeMap.get(1).count);
		for (int i=2; i<=N; i++) {
			System.out.print(" " + nodeMap.get(i).count);
		}
	}
	
	private static void count(Node node, int count) {
		for (Integer i : node.children) {
			Node n = nodeMap.get(i);
			n.count += count;
			count(n, count);
		}
	}
	
	static class Node {
		List<Integer> children = new ArrayList<>();
		long count = 0;
		public Node() {
		}
		public Node(int child) {
			children.add(child);
		}
	}
}