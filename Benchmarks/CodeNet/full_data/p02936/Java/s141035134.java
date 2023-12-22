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
		array.add(new Node(1));
		for(int i=0;i<N-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			array.add(new Node(b,a));
		}
		Collections.sort(array,new CompareNode());
		for(Node a:array) {
			if(a.parentnumber!=0){
				a.parent=array.get(a.parentnumber-1);

				array.get(a.parentnumber-1).children.add(a);
			}
		}
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
	int parentnumber;

	Node(int N,int P){
		counter=0;
		number=N;
		parentnumber=P;
	}
	Node(int N) {
		this(N,0);
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