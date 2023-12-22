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
		
		List<Node> nodeList = new ArrayList<>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Node aNode = new Node(b);
		Node bNode = new Node();
		nodeMap.put(a, aNode);
		nodeMap.put(b, bNode);
		nodeList.add(aNode);
		nodeList.add(bNode);
		for (int i=1; i<N - 1; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			aNode = nodeMap.get(a);
			aNode.children.add(b);
			bNode = new Node();
			nodeMap.put(b, bNode);
			nodeList.add(bNode);
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			Node pNode = nodeMap.get(p);
			pNode.count += x;
			count(pNode, x);
		}
		
		System.out.print(nodeList.get(1).count);
		for (int i=1; i<nodeList.size(); i++) {
			System.out.print(" " + nodeList.get(i).count);
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
		int count = 0;
		public Node() {
		}
		public Node(int child) {
			children.add(child);
		}
	}
}