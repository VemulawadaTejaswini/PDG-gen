import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,Q;
		N=sc.nextInt();
		Q=sc.nextInt();
		ArrayList<Node> array=new ArrayList<Node>();
		array.add(new Node(1,null));
		for(int i=0;i<N-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(Node n:array) {
				if(n.number==a) {
					array.add(new Node(b,n));
					break;
				}
			}
		}
		Collections.sort(array,new CompareNode());
		/*for(Node a:array) {
			System.out.println(a.number);
		}*/
		for(int i=0;i<Q;i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			array.get(p-1).add(q);
		}
		for(Node n:array) {
			System.out.print(n.counter+" ");
		}
	}
}
class Node {
	Node parent;
	ArrayList<Node> children =new ArrayList<Node>();
	int counter;
	int number;
	Node(int N,Node P){
		counter=0;
		number=N;
		parent=P;
		if(P!=null) {
			P.children.add(this);
		}
	}
	void add(int a) {
		this.counter+=a;
		for(Node child:children) {
			child.add(a);
		}
	}
}
class CompareNode implements java.util.Comparator<Node>{
	public int compare(Node a,Node b) {
		if(a.number<b.number) {
			return -1;
		}else {
			return 1;
		}
	}
}