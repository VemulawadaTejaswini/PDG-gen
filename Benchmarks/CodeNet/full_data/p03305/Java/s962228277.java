import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue; 

class Main{

	static class Edge{
		int to;
		long ca,cb;
		Edge(int t, long ca, long cb){to=t;this.ca=ca;this.cb=cb;}
	}
	static class Node{
		int to;
		long cost;
		Node(int t, long c){to=t;cost=c;}
	}

	static void solve(){ 
		int n=ni(), m=ni(), s=ni()-1, t=ni()-1;
		List<Edge> edges[] = new ArrayList[n];
		for(int i=0;i<n;++i)edges[i]=new ArrayList<>();
		while(m-->0){
			int u=ni()-1, v=ni()-1, a=ni(), b=ni();
			edges[u].add(new Edge(v, a, b));
			edges[v].add(new Edge(u, a, b));
		}
		long[] disa = new long[n];
		long[] disb = new long[n];
		Arrays.fill(disa, Long.MAX_VALUE);
		disa[s]=0;
		Arrays.fill(disb, Long.MAX_VALUE);
		disb[t]=0;
		PriorityQueue<Node> que = new PriorityQueue<>((a,b)->a.cost-b.cost<0 ? -1:1);
		que.add(new Node(s, 0));
		while(!que.isEmpty()){
			Node node = que.poll();
			if(disa[node.to]< node.cost)continue;
			for(Edge e: edges[node.to]){
				if(disa[e.to]>node.cost+e.ca){
					disa[e.to]=node.cost+e.ca;
					que.add(new Node(e.to, disa[e.to]));
				}
			}
		}
		que.add(new Node(t, 0));
		while(!que.isEmpty()){
			Node node = que.poll();
			if(disb[node.to]< node.cost)continue;
			for(Edge e: edges[node.to]){
				if(disb[e.to]> node.cost+e.cb){
					disb[e.to]=node.cost+e.cb;
					que.add(new Node(e.to, disb[e.to]));
				}
			}
		}
		long[] ans = new long[n];
		ans[n-1]=disa[n-1]+disb[n-1];
		for(int i=n-2;i>=0;--i)ans[i]=Math.min(ans[i+1], disa[i]+disb[i]);
		for(int i=0;i<n;++i)System.out.println((long)1e15-ans[i]);
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

