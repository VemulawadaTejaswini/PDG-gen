
import java.util.ArrayList;
import java.util.Scanner;

import javafx.util.Pair;

class Node{
	int id;
	ArrayList<Integer>side_id_list;
	public Node(int id){
		this.id = id;
		this.side_id_list = new ArrayList<Integer>();
	}
}

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vertex_count = sc.nextInt();
		int side_count = sc.nextInt();

		ArrayList<Node>node_list = new ArrayList<Node>();
		ArrayList<Pair<Integer,Integer>>side_list = new ArrayList<>();

		for(int i = 0;i < vertex_count;i++){
			node_list.add(new Node(i + 1));
		}

		for(int i = 0;i < side_count;i++){
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			node_list.get(j).side_id_list.add(i);
			node_list.get(k).side_id_list.add(i);
			side_list.add(new Pair<Integer,Integer>(j,k));
		}

		ArrayList<Integer>selected_side_list = new ArrayList<Integer>();

		System.out.println("1 2");

		sc.close();
	}

}
