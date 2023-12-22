import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Tree{
		List<Tree> children;
		long add;
		public Tree() {
			children = new ArrayList<Tree>();
		}
		void propagate(){
			for(Tree child : children){
				child.add += add;
				child.propagate();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Tree nodes[] = new Tree[N];		
		for(int i = 0 ; i < N - 1 ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(nodes[a] == null){
				nodes[a] = new Tree();
			}
			if(nodes[b] == null){
				nodes[b] = new Tree();
			}
			nodes[a].children.add(nodes[b]);
		}
		for(int i = 0 ; i < Q ; ++i){
			int p = sc.nextInt() - 1;
			int x = sc.nextInt();
			nodes[p].add += x;
		}
		nodes[0].propagate();
		
		for(int i = 0 ; i < N ; ++i){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print(nodes[i].add);
		}
		System.out.println();
	}
}
