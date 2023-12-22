import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();

		UF uf=new UF(n);
		HashMap<Integer,HashSet<Integer>>map=new HashMap<>(n);
		for(int i=0;i<m;++i) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			map.computeIfAbsent(a,o->new HashSet<>(1)).add(b);
			map.computeIfAbsent(b,o->new HashSet<>(1)).add(a);
			uf.connect(a,b);
		}
		for(int i=0;i<k;++i) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			map.computeIfAbsent(a,o->new HashSet<>(1)).add(b);
			map.computeIfAbsent(b,o->new HashSet<>(1)).add(a);
		}

		HashSet<Integer>empty=new HashSet<>(0);
		StringJoiner sj=new StringJoiner(" ");
		for(int i=0;i<n;++i) {
			int sum=uf.groupSize(i)-1;
			for(int o:map.getOrDefault(i,empty)) {
				if(uf.isConnected(i,o))
					--sum;
			}
			sj.add(String.valueOf(sum));
		}
		System.out.println(sj);
	}
}
class UF{
	public int[] a;
	public UF(int size){
		Arrays.fill(a=new int[size],-1);
	}
	public int root(int t){
		return a[t]<0?t:(a[t]=root(a[t]));
	}
	public boolean connect(int p,int c){
		p=root(p);
		c=root(c);
		if(p==c)
			return false;
		if(a[p]>a[c]){
			int buf=c;
			c=p;
			p=buf;
		}
		a[p]+=a[c];
		a[c]=p;
		return true;
	}
	public boolean isConnected(int a,int b){
		return root(a)==root(b);
	}
	public int groupSize(int t){
		return -a[root(t)];
	}
}