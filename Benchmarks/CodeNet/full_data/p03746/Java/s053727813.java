
import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int id;
	ArrayList<Node> next_list;
	boolean is_visited;
	public Node(int id){
		this.id = id;
		this.next_list = new ArrayList<>();
		this.is_visited = false;
	}

	public void addNext(Node next,int path_id){
		this.next_list.add(next);
	}

	String calcPath(){
		is_visited = true;

		for(int i = 0;i < next_list.size();i++){
			Node next = next_list.get(i);
			if(next.is_visited)continue;

			return id + " " + next.calcPath();
		}

		return String.valueOf(id);
	}
}

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vertex_count = sc.nextInt();
		int side_count = sc.nextInt();

		ArrayList<Node>node_list = new ArrayList<Node>();

		for(int i = 0;i < vertex_count;i++){
			node_list.add(new Node(i + 1));
		}

		for(int i = 0;i < side_count;i++){
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			node_list.get(j).addNext(node_list.get(k),i + 1);
			node_list.get(k).addNext(node_list.get(j),i + 1);
		}

		String path = node_list.get(0).calcPath();

		int path_count = path.length() / 2 + 1;

		System.out.println(path_count);
		System.out.println(path);

		sc.close();
	}

}
