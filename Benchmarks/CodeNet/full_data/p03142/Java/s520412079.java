import java.util.*;
import java.util.stream.*;

class Main{
	static Scanner s=new Scanner(System.in);

	static class D{
		public D(int a,int b){
			this.a=a;
			this.b=b;
		}
		int a,b;
	}
	public static void main(String[] $){
		int n=s.nextInt(),m=s.nextInt();
		ArrayList<Set<Integer>>to=new ArrayList<>(n);
		ArrayList<Set<Integer>>from=new ArrayList<>(n);
		for(int i=0;i<n;++i) {
			to.add(new HashSet<>());
			from.add(new HashSet<>());
		}
		
		for(int e=n+m-1;e>0;--e) {
			int f=s.nextInt()-1;
			int t=s.nextInt()-1;
			to.get(f).add(t);
			from.get(t).add(f);
		}
		
		int root=IntStream.range(0,n).filter(i->from.get(i).isEmpty()).findAny().getAsInt();
		System.err.println(root);
		
		int[]parent=new int[n];
		
		ArrayDeque<Long>q=new ArrayDeque<>();
		for(int i:to.get(root)) {
			q.add((long)root*n+i);
		}
		while(!q.isEmpty()) {
			for(int _q=q.size();_q>0;--_q) {
				long p=q.poll();
				int pf=(int)p/n;
				int pt=(int)p%n;
				to.get(pf).remove(pt);
				from.get(pt).remove(pf);
				if(from.get(pt).isEmpty())
					parent[pt]=pf+1;
				
				for(int i:to.get(pt)) {
					q.add((long)pt*n+i);
				}
			}
		}
		Arrays.stream(parent).forEach(System.out::println);
	}
}