import java.util.*;

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

class Main{

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		UF uf=new UF(n);
		for(int i=0;i<m;++i) {
			uf.connect(s.nextInt()-1,s.nextInt()-1);
			s.nextInt();
		}
		System.out.println(Arrays.stream(uf.a).filter(i->i<0).count());
	}
}