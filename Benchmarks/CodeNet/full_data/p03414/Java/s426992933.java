import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*;

class SCC{
	List<Integer>[] edges;
	List<Integer>[] redges;
	boolean[] used;
	int[] comp;
	int comp_num=0;
	int n;

	List<Integer>[] scc_edges;
	List<Integer> sorted_comp;
	// 最後尾までの最大距離
	int[] rank;

	SCC(int n){
		this.n=n;
		edges = new ArrayList[n];
		redges=new ArrayList[n];
		comp = new int[n];
		used=new boolean[n];
		for(int i=0;i<n;++i)edges[i]=new ArrayList<>();
		for(int i=0;i<n;++i)redges[i]=new ArrayList<>();
		Arrays.fill(comp, -1);
	}
	void add_edges(int u, int v){
		edges[u].add(v);
		redges[v].add(u);
	}
	void scc(){
		Deque<Integer> visit = new ArrayDeque<>();
		Arrays.fill(used, false);
		for(int i=0;i<n;++i)if(!used[i])dfs1(i, visit);
		while(!visit.isEmpty()){
			int v = visit.pollLast();
			if(comp[v]>=0)continue;
			dfs2(v);
			comp_num++;
		}
	}

	void topoSort(){
		Set<Integer>[] ed = new Set[n];
		for(int i=0;i<n;++i)ed[i] = new HashSet<>();
		for(int i=0;i<n;++i)for(int u: edges[i])if(comp[i]!=comp[u])ed[comp[i]].add(comp[u]);
		scc_edges = new ArrayList[n];
		for(int i=0;i<n;++i)scc_edges[i]=new ArrayList<>();
		for(int i=0;i<n;++i)for(int u: ed[i])scc_edges[i].add(u);
		Arrays.fill(used, false);
		sorted_comp = new ArrayList<>();
		for(int i=0;i<comp_num;++i)if(!used[i])dfs3(i, sorted_comp);
		Collections.reverse(sorted_comp);

//		for(int i=0;i<n;++i)System.out.print(comp[i]+" ");
//		System.out.println();
//		for(int i=0;i<comp_num;++i)for(int u: scc_edges[i])System.out.println(i+" to "+u);
		
		rank = new int[comp_num];
		Arrays.fill(rank, -1);
		for(int i=0;i<comp_num;++i)dfs4(i);
	}

	void dfs1(int v, Deque que){
		used[v]=true;
		for(int u: edges[v])if(!used[u])dfs1(u, que);
		que.addLast(v);
	}
	void dfs2(int v){
		comp[v]=comp_num;
		for(int u: redges[v])if(comp[u]<0)dfs2(u);
	}
	void dfs3(int v, List list){
		used[v]=true;
		for(int u: scc_edges[v])if(!used[u])dfs3(u, list);
		list.add(v);
	}
	int dfs4(int v){
		if(rank[v]>=0)return rank[v];
		for(int u: scc_edges[v]){
//			System.out.println(v+" "+u);
			rank[v] = Math.max(rank[v], dfs4(u));
		}
		rank[v]++;
		return rank[v];
	}
}

class Main{

	static void solve(){
		int n = ni(), m=ni();
		SCC scc = new SCC(n);
		int[] a = new int[m];
		int[] b = new int[m];
		int[] in = new int[n];
		int[] ou = new int[n];
		for(int i=0;i<m;++i){
			a[i]=ni()-1;
			b[i]=ni()-1;
			scc.add_edges(a[i], b[i]);
		}
		scc.scc();
		scc.topoSort();
		for(int i=0;i<n;++i){
			for(int u: scc.edges[i]){
				if(scc.comp[i]==scc.comp[u]){
					ou[i]++;in[u]++;
				}
			}
		}

		for(int i=0;i<m;++i){
			if(scc.comp[a[i]]==scc.comp[b[i]]){
				if(ou[a[i]]>1 && in[b[i]]>1){
					out.println("same");
				}else{
					out.println("diff");
				}
			}else{
				if(scc.rank[scc.comp[a[i]]] - scc.rank[scc.comp[b[i]]]==1){
					out.println("same");
				}else{
					out.println("diff");
				}
			}
		}
 
	}
 
 
 
 
	public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 private static final byte[] buffer = new byte[1<<15]; 
	 private static int ptr = 0; 
	 private static int buflen = 0; 
	 private static boolean hasNextByte(){ 
		 if(ptr<buflen)return true; 
		 ptr = 0; 
		 try{ 
			 buflen = in.read(buffer); 
		 } catch (IOException e){ 
			 e.printStackTrace(); 
		 } 
		 return buflen>0; 
	 } 
	 private static int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;} 
	 private static boolean isSpaceChar(int c){ return !(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
		 return sb.toString(); 
	 } 
	 private static int[] nia(int n){ 
		 int[] res = new int[n]; 
		 for(int i=0;i<n;++i)res[i]=ni(); 
		 return res; 
	 } 
	 private static long[] nla(int n){ 
		 long[] res = new long[n]; 
		 for(int i=0;i<n;++i)res[i]=nl(); 
		 return res; 
	 } 
	 private static int ni(){ 
		 int res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	} 
} 

