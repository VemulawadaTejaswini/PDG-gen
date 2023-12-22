import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		LinkedList<Integer> p =new LinkedList();
		LinkedList<Integer> q =new LinkedList();
		//LinkedList<Integer> r =new LinkedList();
		LinkedList<Integer> all =new LinkedList();
		
		int ans=0;
		
		for(int i=0;i<a;i++){
			p.add(sc.nextInt());
		}
		
		for(int i=0;i<b;i++){
			q.add(sc.nextInt());
		}
		
		for(int i=0;i<c;i++){
			all.add(sc.nextInt());
		}
		Collections.sort(p);
		Collections.sort(q);
		//Collections.sort(r);
		
		//ans+=p.pollLast();
		//ans+=q.pollLast();
		
		
		
		for(int i=0;i<x;i++){
			all.add(p.pollLast());
		}
		
		for(int i=0;i<y;i++){
			all.add(q.pollLast());
		}
		
		
		Collections.sort(all);
		
		for(int i=0;i<x+y;i++){
			ans+=all.pollLast();
		}
		
		System.out.print(ans);
	}
}
	


