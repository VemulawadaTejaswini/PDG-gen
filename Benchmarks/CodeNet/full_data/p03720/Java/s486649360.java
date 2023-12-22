import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://abc061.contest.atcoder.jp/tasks/abc061_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node();
		for(int i=0; i<M; i++){
			Node a = nodes[sc.nextInt()-1];
			Node b = nodes[sc.nextInt()-1];
			a.neighbor.add(b);
			b.neighbor.add(a);
		}
		sc.close();
		
		for(Node n:nodes){
			System.out.println(n.neighbor.size());
		}

	}
	
	static class Node{
		List<Node> neighbor = new ArrayList<>();
	}

}
