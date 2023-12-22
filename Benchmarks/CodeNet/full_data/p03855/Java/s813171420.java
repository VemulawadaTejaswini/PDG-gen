import java.util.Scanner;

/**
 * https://abc049.contest.atcoder.jp/tasks/arc065_b
 */
public class Main {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());
		Node[] nodeList1 = new Node[N];
		Node[] nodeList2 = new Node[N];
		for(int i=0; i<N; i++){
			nodeList1[i] = new Node(i);	
			nodeList2[i] = new Node(i);
		}
		for(int i=0; i<K; i++){
			int x = Integer.parseInt(sc.next())-1;
			int y = Integer.parseInt(sc.next())-1;
			unite(nodeList1, x, y);
		}
		for(int i=0; i<L; i++){
			int x = Integer.parseInt(sc.next())-1;
			int y = Integer.parseInt(sc.next())-1;
			if(isUnion(nodeList1, x, y)) unite(nodeList2, x, y);
		}
		sc.close();
		
		for(int i=0; i<N; i++){
			System.out.println(findRoot(nodeList2, i).size);
		}
	}
	
	static class Node{
		int id;
		int height = 0;
		int size = 1;
		Node parent;
		Node left, right;
		Node(int id){
			this.id = id;
			this.parent = this;
		}
	}
	
	static boolean isUnion(Node[] nodeList, int id1, int id2){
		return findRoot(nodeList, id1) == findRoot(nodeList, id2);
	}
	
	static void unite(Node[] nodeList, int id1, int id2){
		Node node1 = findRoot(nodeList, id1);
		Node node2 = findRoot(nodeList, id2);
		if(node1==node2) return;
		if(node1.height==node2.height){
			node2.parent = node1;
			node1.height++;
			node1.size = node1.size + node2.size;
		}else if(node1.height>node2.height){
			node2.parent = node1;
			node1.size = node1.size + node2.size;
		}else{
			node1.parent = node2;
			node2.size = node1.size + node2.size;
		}
	}
	
	static Node findRoot(Node[] nodeList, int id){
		Node node = nodeList[id];
		while(node.parent != node){
			node = node.parent;
		}
		return node;
	}
	
}