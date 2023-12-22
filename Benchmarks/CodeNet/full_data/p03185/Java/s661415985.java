import java.io.*;
import java.util.*;

public class Main{
	static long inf=(long)1e18;
	static class liChaoTree{
		int maxn=(int)1e6+1;
		long[][]lines;
		liChaoTree(){
			lines=new long[maxn*4][2];
			for(int i=1;i<lines.length;i++) {
				lines[i]=new long[] {0,inf};
			}
		}
		static long valueAt(long[]line,int x) {
			return line[0]*x+line[1];
		}
		void add_line(long[]newLine) {
			add_line(newLine, 1, 1, maxn-1);
		}
		void add_line(long[]newLine,int node, int left, int right) {
			if(left==right) {
				if(valueAt(newLine, left) < valueAt(lines[node], left)) {
					//new line is better
					lines[node]=newLine.clone();
				}
				return;
			}
			
			
		    int mid=(left+right)>>1;
			int cur=0,nw=1;
		    int dominatingAtLeft = valueAt(newLine, left) < valueAt(lines[node], left) ? cur : nw;
		    int dominatingAtMid = valueAt(newLine, mid) < valueAt(lines[node], mid) ? cur : nw;
		    
		    if(dominatingAtMid!=nw) {
		    	long[]tmp=newLine;
		    	newLine=lines[node];
		    	lines[node]=tmp;
		    }
		    if(dominatingAtLeft!=dominatingAtMid) {
		    	//intersection at left subtree
		    	add_line(newLine, node<<1, left, mid);
		    	
		    }
		    else {
		    	//intersection at right subtree
		    	add_line(newLine, node<<1|1, mid+1, right);
		    	
		    }
		}
		long get(int x) {
			return get(x, 1, 1, maxn-1);
		}
		long get(int x, int node, int left, int right) {
		    int mid=(left + right)>>1;
		    if(left==right) {
		        return valueAt(lines[node], x);
		    }
		    if(x <= mid) {
		        return Math.min(valueAt(lines[node], x), get(x, node<<1, left, mid));
		    }
		    return Math.min(valueAt(lines[node], x), get(x, node<<1|1, mid+1, right));
		    
		}
	}
	static long[] lineOfI(long dpi,int hi,long c) {
		return new long[] {-2*hi,hi*1l*hi+c+dpi};
	}
	static void main() throws Exception{
		int n=sc.nextInt();
		long c=sc.nextLong();
		int[]h=sc.intArr(n);
		
		liChaoTree tree=new liChaoTree();
		tree.add_line(lineOfI(0, h[n-1],c));
		for(int i=n-2;i>=0;i--) {
			long best=tree.get(h[i]);
			long dpi=best+h[i]*1l*h[i];
			if(i==0) {
				pw.println(dpi);
				return;
			}
			tree.add_line(lineOfI(dpi, h[i], c));
		}
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
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
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}