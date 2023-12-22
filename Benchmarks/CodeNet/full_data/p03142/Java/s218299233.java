import java.util.*;

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
		TreeSet<Long> to=new TreeSet<>();
		TreeSet<Long> from=new TreeSet<>();

		BitSet _root=new BitSet(n);
		_root.set(0,n);

		for(int e=n+m-1;e>0;--e){
			long f=s.nextInt()-1;
			long t=s.nextInt()-1;
			_root.clear((int)t);
			to.add(f*n+t);
			from.add(t*n+f);
		}

		long root=_root.nextSetBit(0);

		int[] parent=new int[n];

		ArrayDeque<Long> q=new ArrayDeque<>();
		q.addAll(to.subSet(root*n,(root+1)*n));

		while(!q.isEmpty()){
			for(int _q=q.size();_q>0;--_q){
				long p=q.poll();
				long pf=p/n;
				long pt=p%n;
				from.remove(pt*n+pf);
				if(from.subSet(pt*n,(pt+1)*n).isEmpty())
					parent[(int)pt]=(int)pf+1;

				for(long i:to.subSet(pt*n,(pt+1)*n)){
					q.add(i);
				}
			}
		}
		Arrays.stream(parent).forEach(System.out::println);
	}
}