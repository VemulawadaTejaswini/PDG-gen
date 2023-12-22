import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Node{
		List<Node>nextList;
		boolean visited;

		int type;

		public Node(){
			nextList = new LinkedList<>();
			visited = false;
			this.type = 0;
		}

		public void addNext(Node next){
			nextList.add(next);
		}

		public int count(int c,int type){
			if(visited){
				return c;
			}
			if(this.type > 0 && this.type != type){
				return c;
			}
			c += 1;
			visited = true;
			for(Node n : nextList){
				c += n.count(c,this.type);
			}
			return c;
		}

		public void setVisited(boolean flag){
			visited = flag;
		}

		public void setType(int type){
			this.type = type;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i = 0; i < N;i++){
			nodes[i] = new Node();
		}
		nodes[0].type = 1;
		nodes[N - 1].type = 2;

		for(int i = 0;i < N - 1;i++){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			nodes[a].addNext(nodes[b]);
			nodes[b].addNext(nodes[a]);
		}

		int black = nodes[0].count(0,nodes[0].type);
		for(int i = 0;i < N;i++){
			nodes[i].setVisited(false);
		}
		int white = nodes[N - 1].count(0,nodes[N - 1].type);

		if(white < black){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}
	}
}
