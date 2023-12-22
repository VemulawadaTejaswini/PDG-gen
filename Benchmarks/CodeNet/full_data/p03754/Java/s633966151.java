import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt();
		Node[] ns=new Node[n];
		for(int i=0; i<n; i++)
			ns[i]=new Node(i);
		for(int i=0; i<n-1; i++){
			int a=s.nextInt()-1, b=s.nextInt()-1;
			ns[a].add(ns[b]);
			ns[b].add(ns[a]);
		}
		
		ArrayDeque<Node> deque=new ArrayDeque<>(3);
		Arrays.stream(ns).filter(o->o.neighbor.size()==1).forEach(v->{
//			System.out.println(v.id);
			v.dist.put(v.id,-114514);
			deque.add(v);
			
			int dist=0;
			while(!deque.isEmpty()){
				dist++;
				for(int j=deque.size(); j>0; j--){
					Node p=deque.poll();
					for(Node t:p.neighbor){
						if(!t.dist.containsKey(v.id)){
							t.dist.put(v.id,dist);
							deque.add(t);
						}
					}
				}
			}
		});
		
		for(Node v:ns){
//			System.out.println(v.dist.toString());
			System.out.println(v.dist.values().stream().mapToInt(i->i)
					.filter(i->i!=-114514)
					.average().getAsDouble());
		}
	}
}

class Node{
	
	ArrayList<Node>				neighbor=new ArrayList<>(3);
	HashMap<Integer, Integer>	dist	=new HashMap<>(2);
	
	int							id;
	
	Node(int id){
		this.id=id;
	}
	
	void add(Node n){
		neighbor.add(n);
	}
}
