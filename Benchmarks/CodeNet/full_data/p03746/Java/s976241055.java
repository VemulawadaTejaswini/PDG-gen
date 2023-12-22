

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static class Node{
		private ArrayList<Node>next_list;

		boolean is_visited;
		int id;

		public static ArrayList<Integer>pass_list = new ArrayList<>();

		public Node(int id){
			this.id = id;
			next_list = new ArrayList<>();
			is_visited = false;
		}

		public void addNext(Node next){
			next_list.add(next);
		}

		public void searchPassBack(){
			is_visited = true;

			for(Node next : next_list){
				if(next.is_visited)continue;
				pass_list.add(next.id);
				next.searchPassBack();
				break;
			}
		}

		public void searchPassFront(){
			is_visited = true;

			for(Node next : next_list){
				if(next.is_visited)continue;
				pass_list.add(0,next.id);
				next.searchPassFront();
				break;
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int node_count = sc.nextInt();
		int pass_count = sc.nextInt();

		Node[] node_list = new Node[node_count];

		for(int i = 0;i < node_list.length;i++){
			node_list[i] = new Node(i + 1);
		}

		for(int i = 0;i < pass_count;i++){
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			node_list[j].addNext(node_list[k]);
			node_list[k].addNext(node_list[j]);
		}

		Node.pass_list.add(1);
		node_list[0].searchPassBack();
		node_list[0].searchPassFront();
		ArrayList<Integer>pass = Node.pass_list;

		System.out.println(pass.size());
		for(int i = 0;i < pass.size();i++){
			System.out.print(pass.get(i));
			if(i != pass.size() - 1)System.out.print(" ");
		}
		System.out.println();
		sc.close();
	}
}
