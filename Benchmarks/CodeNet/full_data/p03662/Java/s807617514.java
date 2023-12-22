import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;

public class Main{
static class Node implements Comparable<Node>{
	int id;
	long d;
	public Node(int id,long d) {
		this.id=id;
		this.d=d;
	}
	public int compareTo(Node c) {
		return Long.compare(this.d, c.d);
	}
}
//public static PrintWriter pw; 	
public static PrintWriter pw=new PrintWriter(System.out);
public static void solve() throws IOException{
//	pw=new PrintWriter(new FileWriter("C:\\Users\\shree\\Downloads\\small_output_in"));
	FastReader sc=new FastReader();
	int n=sc.I();
	graph=new Vector[n+1];
	for(int i=1;i<=n;i++)graph[i]=new Vector<>();
	for(int i=1;i<n;i++) {
		int x=sc.I(); int y=sc.I(); 
		graph[x].add(y);
		graph[y].add(x);
		
	}
	a=new int[n+1];
	b=new int[n+1];
	color=new int[n+1];
	dfs(1,-1,a);
	cc=1;
	dfs(n,-1,b);
	dfs3(1,-1);
	dfs4(n,-1);
	dfs2(1,-1);
	if(ans==1) pw.println("Fennec"); else pw.println("Snuke");

	pw.close(); 
	
	
}
static Vector<Integer> graph[];
static  int a[];
static int b[];
static int color[];
static int cc=1;
static int ans=0;
static void dfs(int v,int pr , int a[]) {
	a[v]=cc++;
	for(int u: graph[v]) {
		if(u!=pr) dfs(u,v,a);
	}
}
static void dfs2(int v,int pr) {
	for(int u : graph[v]) {
		if(u!=pr) {
			if(color[u]!=color[v]) {
				if(color[u]==1) {
					if(a[u]>=b[v]) ans=2; else ans=1;
				}else {
					if(a[v]>=b[u]) ans=2; else ans=1;
				}
			}
			dfs2(u,v);
		}
	}
}
static void dfs3(int v,int pr) {
	if(a[v]<=b[v])
	color[v]=1;
	else return;
	for(int u : graph[v]) {
		if(u!=pr) {
			dfs3(u,v);
		}
	}
}
static void dfs4(int v,int pr) {
	if(b[v]<a[v] || color[v]==0) color[v]=2;
	else return;
	for(int u : graph[v]) {
		if(u!=pr) dfs4(u,v);
	}
}
public static void main(String[] args)  {
    new Thread(null ,new Runnable(){
      public void run(){
          try{
          
              solve();
          } catch(Exception e){
              e.printStackTrace();
          }
      }
  },"1",1<<26).start();
 
}

static long M=(long)Math.pow(10,9)+7;
 
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() throws FileNotFoundException{
            //br=new BufferedReader(new FileReader("C:\\Users\\shree\\Downloads\\B-small-practice.in"));	
        	 br = new BufferedReader(new InputStreamReader(System.in));
        		
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
       
        int I(){   return Integer.parseInt(next()); }
        long L(){  return Long.parseLong(next()); }
        double D() {  return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
     }
}