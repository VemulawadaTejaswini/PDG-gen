import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Node[] ns;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ns = new Node[N];
		for(int i = 0;i < N;i++){
			ns[i] = new Node(i);
		}
		for(int i = 0;i < N-1;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			ns[a].add(ns[b]);
			ns[b].add(ns[a]);
		}
		DFS(ns[0],null);
		for(int i = 0;i < Q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			ns[p-1].cnt += x;
		}
		sc.close();
		sum(ns[0]);
		StringBuilder sb = new StringBuilder();
		for(Node n : ns) {
			sb.append(" ").append(n.cnt);
		}
		System.out.println(sb.substring(1));
	}

	private static void sum(Node n) {
		if(n.p != null) {
			n.cnt += n.p.cnt;
			for(Node c : n) {
				if(c != n.p) {
					sum(c);
				}
			}
		}
	}

	private static void DFS(Node n, Node p) {
		n.p = p;
		for(Node cc : n) {
			if(cc != p) {
				DFS(cc, n);
			}
		}
	}

	static class Node extends ArrayList<Node>{
		Node p;
		int id;
		int cnt = 0;
		Node(int id){
			this.id = id;
		}
	}
}