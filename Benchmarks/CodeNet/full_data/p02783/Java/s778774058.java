import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static  ArrayList<Pair>adj[];
	static PrintWriter out=new PrintWriter(System.out);
        static Integer[] b;
	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int sum=n/a;
	if(n%a!=0) {
		sum++;
	}
	System.out.println(sum);
		
out.flush();
	}

static long sum;	
	
	static void dfs(int u,int p,  int l, int r) {
		   

for(Pair v:adj[u]) {
	  if(r<l) {
		  return;
	  }
 if(p!=v.v&&v.cost<b[r]) {
	 int cur=r;
 while(l<=r&&v.cost<b[r])  	r--;
 
dfs(v.v,u,r+1,cur);
 }
}

 sum+= 1l*(r-l+1)*1l*(u + 1)*1l;
}

static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}	

	
	
	 static class Pair implements Comparable<Pair>{
		  int v;
		  int cost;
		  Pair(int a, int b){
			  v=a;
			  cost=b;
		  }
		public int compareTo(Pair p) {
			return (int) (p.cost-this.cost);
		 
				 
		}
	 }
}