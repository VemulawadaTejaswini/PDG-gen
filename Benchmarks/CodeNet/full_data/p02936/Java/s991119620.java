import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		Node[] nodeArray = new Node[N];
		for (int i=0; i<N; i++) {
			nodeArray[i] = new Node();
		}
		for (int i=0; i<N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodeArray[a-1].children.add(nodeArray[b-1]);
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			nodeArray[p-1].count += x;
		}
		
		count(nodeArray[0], 0);
		
		System.out.print(nodeArray[0].count);
		for (int i=1; i<N; i++) {
			System.out.print(" " + nodeArray[i].count);
		}
	}
	
	static void count(Node n, long cnt) {
		n.count += cnt;
		for (Node c : n.children) {
			count(c, n.count);
		}
	}
	
	static class Node {
		List<Node> children = new ArrayList<>();
		long count = 0;
	}
}