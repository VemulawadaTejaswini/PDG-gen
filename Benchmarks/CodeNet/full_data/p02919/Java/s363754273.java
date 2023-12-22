import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<node> nodes= new ArrayList<node>();
		int a = sc.nextInt();
		int b;
		for (int i=0;i<N-1;i++){
			b = sc.nextInt();
			int f = (a>b)?a:b;
			int s = (a>b)?b:a;
			a = b;
			nodes.add(new node(f,s));
		}
		addition(nodes);
		System.out.println(Ans);
		sc.close();
	}
	public static class node{
		int first;
		int second;
		node(int f,int s){
			first = f;
			second = s;
		}
		public void print(){
			System.out.println(this.first +":"+this.second+" ");
		}
	}
	public static node CompareTwoNodes(node n_1,node n_2){
		int first;
		int second;
		if(n_1.first>n_2.first){
			first = n_1.first;
			second = (n_1.second>=n_2.first)?n_1.second:n_2.first;
		}
		else if(n_1.first==n_2.first){
			first = n_1.first;
			second = (n_1.second>=n_2.second)?n_1.second:n_2.second;
		}
		else{
			first = n_2.first;
			second = (n_2.second>=n_1.first)?n_2.second:n_1.first;
		}
		return new node(first,second);
	}
	public static void addition(ArrayList<node> al){
		ArrayList<node> new_nodes= new ArrayList<node>();
		//debug
		//al.forEach(node::print);
		for (int i=0;i<al.size()-1;i++){
			new_nodes.add(CompareTwoNodes(al.get(i),al.get(i+1)));
			Ans += al.get(i).second;
		}
		Ans += al.get(al.size()-1).second;
		if (al.size() != 1){addition(new_nodes);}
	}
	public static int Ans = 0;
}

