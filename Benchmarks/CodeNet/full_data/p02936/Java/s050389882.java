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
		
		for (int i=1; i<=N; i++) {
			nodeMap.put(i, new Node());
		}
		for (int i=0; i<N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Node aNode = nodeMap.get(a);
			aNode.children.add(b);
			Node bNode = nodeMap.get(b);
			bNode.parent = a;
			
			int p = aNode.parent;
			while (p > 0) {
				Node pNode = nodeMap.get(p);
				pNode.children.add(b);
				p = pNode.parent;
			}
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			Node pNode = nodeMap.get(p);
			pNode.count += x;
			for (Integer c : pNode.children) {
				Node n = nodeMap.get(c);
				n.count += x;
			}
		}
		
		System.out.print(nodeMap.get(1).count);
		for (int i=2; i<=N; i++) {
			System.out.print(" " + nodeMap.get(i).count);
		}
	}
	
	static class Node {
		List<Integer> children = new ArrayList<>();
		long count = 0;
		int parent;
		public Node() {
		}
		public Node(int child) {
			children.add(child);
		}
	}
}