		import java.util.*;
	import java.io.*;
	import java.math.*;
	 
	 
	import static java.lang.Math.*;
	import static java.util.Arrays.*;
	import static java.util.Collections.*;
	 
	 
	public class Main{ 
	 
	 
	    static long mod=1000000007;
	    static int dx[]={1,-1,0,0};
	    static int dy[]={0,0,1,-1};
	    // static int dx[]={1,-1,0,0,1,1,-1,-1};
	    // static int dy[]={0,0,1,-1,1,-1,1,-1};
	    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
	    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	 
	public  static void main(String[] args)   throws Exception, IOException{
	 
	    
	    Reader sc = new Reader(System.in);
	    PrintWriter out=new PrintWriter(System.out);
	 
	    // int n=sc.nextInt();
	    int n;
	    char c[]=sc.nextString().toCharArray();
	    n=c.length;
	    int d[][]=new int[26][n];
	    long ans=0;
	    d[c[0]-'a'][0]++;
	    for (int i=1; i<n; i++) {
	    	ans+=i-d[c[i]-'a'][i-1];
	    	db(i-d[c[i]-'a'][i-1]);
	    	for (int t=0;t<26 ;t++ ) {
	    		d[t][i]=d[t][i-1];
	    	}
	    	d[c[i]-'a'][i]++;
		}

		out.println(ans+1);
	    out.flush();
	}

	static boolean dfs(boolean w[][],boolean d[],int cur){
		for (int i=0; i<d.length; i++) {
			if(w[cur][i] && !d[i]){
				d[i]=true;
				if(cur==d.length-1)return true;
				if(!dfs(w,d,cur+1))return false;
				d[i]=false;
			}
		}
		return true;
	}
	 
	static void db(Object... os){
	 
	    System.err.println(Arrays.deepToString(os));
	 
	}
	 
	static boolean validpos(int x,int y,int r, int c){
	    
	    return x<r && 0<=x && y<c && 0<=y;
	    
	}
	 
	static boolean bit(long x,int k){
	    // weather k-th bit (from right) be one or zero
	    return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
	}
	 
	}
	 
	 
	class XY {
	    int x,y,d;
	    XY(int x, int y, int d) {
	        this.x=x;
	        this.y=y;
	        this.d=d;
	    } 
	}
	 
	class P implements Comparable<P>{
	    int x,y;
	    P(int x, int y) {
	        this.x=x;
	        this.y=y;
	    } 
	      
	    public int compareTo(P p){
	        return x - p.x;
	    } 
	}
	 
	class Reader
	{ 
	    private BufferedReader x;
	    private StringTokenizer st;
	    
	    public Reader(InputStream in)
	    {
	        x = new BufferedReader(new InputStreamReader(in));
	        st = null;
	    }
	    public String nextString() throws IOException
	    {
	        while( st==null || !st.hasMoreTokens() )
	            st = new StringTokenizer(x.readLine());
	        return st.nextToken();
	    }
	    public int nextInt() throws IOException
	    {
	        return Integer.parseInt(nextString());
	    }
	    public long nextLong() throws IOException
	    {
	        return Long.parseLong(nextString());
	    }
	    public double nextDouble() throws IOException
	    {
	        return Double.parseDouble(nextString());
	    }
	}