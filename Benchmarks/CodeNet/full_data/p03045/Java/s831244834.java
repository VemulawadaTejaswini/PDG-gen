//package at_coder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int input1,input2;
		ArrayList<Tree> trees = new ArrayList<Tree>();

		//1行ずつの読み込み及び情報格納
		for(int i=0;i<m;i++) {
			Tree tree1 = null;
			Tree tree2 = null;
			input1 = sc.nextInt();
			input2 = sc.nextInt();
			sc.nextInt();

			//その整数が木に既に格納されているか
			for(Tree tree:trees) {
				if(tree.has(input1))
					tree1 = tree;
				if(tree.has(input2))
					tree2 = tree;
			}

			//格納処理
			if(tree1 == null) {
				if(tree2 == null) {
					trees.add(new Tree(input1,input2));
				}else {
					tree2.add(input1);
				}
			}else {
				if(tree2 == null) {
					tree1.add(input2);
				}else {
					//tree2をtree1の一部にし、tree2をtreesから削除
					tree1.join(tree2);
					trees.remove(tree2);
				}
			}

		}


		for(Tree tree:trees)
			n -= tree.points.size()-1;
		System.out.println(n);

	}
}

class Tree{
	ArrayList<Integer> points = new ArrayList<Integer>();

	Tree(int num1,int num2){
		points.add(new Integer(num1));
		points.add(new Integer(num2));
	}

	boolean has(int num) {
		for(Integer point:points)
			if(num == point.intValue())
				return true;
		return false;
	}

	void add(int num) {
		points.add(new Integer(num));
	}

	void join(Tree tree) {
		points.addAll(tree.points);
	}
}
