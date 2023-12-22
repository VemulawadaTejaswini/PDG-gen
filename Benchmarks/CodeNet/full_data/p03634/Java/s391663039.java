import java.util.*;
class Main{
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();
		dist=new long[n];
		for(int i=0;i<n;++i)
			edges.add(new TreeMap<>());
		for(int i=0;i<n-1;++i){
			int a=getInt()-1,b=getInt()-1;
			long c=getInt();
			edges.get(a).put(b,c);
			edges.get(b).put(a,c);
		}
		int q=getInt();
		dfs(-1,getInt()-1,0);
		for(int i=0;i<q;++i)
			System.out.println(dist[getInt()-1]+dist[getInt()-1]);
	}
	static ArrayList<TreeMap<Integer,Long>>edges=new ArrayList<>();
	static long[]dist;
	static void dfs(int from,int to,long l){
		dist[to]=l;
		TreeMap<Integer,Long> m=edges.get(to);
		m.remove(from);
		m.forEach((k,v)->dfs(to,k,l+v));
	}
}