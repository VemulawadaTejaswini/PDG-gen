import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static  ArrayList<Pair>adj[];
	static PrintWriter out=new PrintWriter(System.out);
	 public static int mod = 1000000007;

	static int notmemo[][][][];
	static int k;
	static long a[];
	static long b[];
	static int m;
	static char c[];
	static int trace[];
	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	long h[]=new long[n];
	for (int i = 0; i < h.length; i++) {
		h[i]=sc.nextInt();
	}
	schuffle(h);
	Arrays.sort(h);
	long sum=0;
	for(int i=h.length-1-k; i>=0 ; i--) {
		sum+=h[i];
	}
	System.out.println(sum);
	}
	
	static int xi=0;
	static int last=0;
	static long sum=0;
	static int cur;
	static ArrayList<Integer> l2=new ArrayList<>();
	static void dfs(int u,  int l, int r) {
				   vis[u]=true;
				   

		  for(Pair v:adj[u]) {
			  long count=0;
			  if(r<l) {
				  return;
			  }
		    if(!vis[v.v]&&v.cost>=b[l]) {
		    while(l<=r&&v.cost>=b[l]) {
		    	l++;
		    	count++;
		    }
	dfs(v.v,l,r);
		    }
		  }

	        sum+= (r-l)*1l*(u + 1);
	}
	static Pair bin(int l,int r,long val) {
	    int low = l;
        int high = r;
        long ans=(long) 1e15;
        while (low <=high) {
        	   int mid = (low + high) / 2;
            if (b[mid] > val) {
            	 	high = mid-1;
                    
           ans=Math.min(ans, mid);
            } else {
            	low = mid + 1;
           	     
            }
        }
        if(ans==1e15) {
        	return new Pair(-1,-1);
        }
        else {
        	return new Pair((int) ans,r);
        }
    
	}
	static int dp(int i,int even,int odd,int prev ) {
		if(i==n) {
			return 0;
		}
		if(notmemo[i][even][odd][prev]!=-1) {
			return notmemo[i][even][odd][prev];
		}
		int ans=(int) 1e9;
		
		if(a[i]!=0) {
			
			ans=Math.min(ans,dp(i+1,even,odd,(int) a[i]));
		}
		
		else if(even>0&&odd>0) {
			int countev=0;
			int countodd=0;
			if(i+1<n) {
				if(a[i+1]==1) {
					countev++;
				}
				else if(a[i+1]==2) {
					countodd++;
				}				
			}
			if(i-1>=0) {
				if(prev==1) {
					countev++;
				}
				else if(prev==2) {
					countodd++;
				}
			}
			ans=Math.min(ans, dp(i+1, even-1, odd,2)+countev);
			ans=Math.min(ans, dp(i+1, even, odd-1,1)+countodd);
		}
		else if(even>0) {
			int countev=0;
			if(i+1<n) {
				if(a[i+1]==1) {
					countev++;
				}				
			}
			if(i-1>=0) {
				if(prev==1) {
					countev++;
				}
			}
			ans=Math.min(ans, dp(i+1, even-1, odd,2)+countev);
		}
		else  {
			int countodd=0;
			
			if(i+1<n) {}
			if(i-1>=0) {
				
				if(prev==2) {
					countodd++;
				}
			}
			ans=Math.min(ans, dp(i+1, even, odd-1,1)+countodd);
		
		}
		return notmemo[i][even][odd][prev]=ans;

	}

	static long nCr1(int n , int k)
	{
		if(n < k)
			return 0;
		if(k == 0 || k == n)
			return 1;
		if(comb[n][k] != -1)
			return comb[n][k];
		if(n - k < k)
			return comb[n][k] = nCr1(n, n - k);
		return comb[n][k] = ((nCr1(n - 1, k - 1)%mod) +( nCr1(n - 1, k)%mod))%mod;
	}
	
	
	static int teams=0;
static long mini[];
static char x[]= {'h','a','r','d'};
static long s[];
static ArrayList<Integer> l1=new ArrayList<>();
static long count=0;


static class UnionFind {                                              
	int[] p, rank, setSize;
	int numSets;
	int max[];
	public UnionFind(int N) 
	{
		max=new int[N];
		p = new int[numSets = N];
		rank = new int[N];
		setSize = new int[N];
		for (int i = 0; i < N; i++) {  p[i] = i; setSize[i] = 1;
		max[i]=i;
		}
	}

	public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

	public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

	public void unionSet(int i, int j) 
	{ 
		if (isSameSet(i, j)) 
			return;
		numSets--; 
		int x = findSet(i), y = findSet(j);
		if(rank[x] > rank[y]) { p[y] = x; setSize[x] += setSize[y];
		max[x]=Math.max(max[x], max[y]);
		
		}
		else
		{	p[x] = y; setSize[y] += setSize[x];
			if(rank[x] == rank[y]) rank[y]++; 
			max[y]=Math.max(max[x],max[y]);
			
		} 
	}

	private int getmax(int j) {
	return max[findSet(j)];
	}

	public int numDisjointSets() { return numSets; }

	public int sizeOfSet(int i) { return setSize[findSet(i)]; }
}





private static int bs(int i) {
	int high=n-1;
	int low=i;
	int ans=-1;
	int count=1;
	while(high>=low) {
	int	mid=(high+low)>>1;
	if(a[mid]-a[i]<=5) {
		ans=mid;
		low=mid+1;
		count=mid-i+1;
	}
	else {
		high=mid-1;
		
	}
	}
	return count;
	
	
}



/**private static void trace(int i, int time) {
if(i==n) 
	return;


long ans=dp(i,time);
if(time+a[i].t<a[i].burn&&(ans==dp(i+1,time+a[i].t)+a[i].cost)) {
	
	trace(i+1, time+a[i].t);
    
	l1.add(a[i].idx);
    return;
}
    trace(i+1,time);

}**/



	static class incpair implements Comparable<incpair>
{
	int a; long b;
	int idx;
	incpair(int a, long dirg,int i) {this.a = a;	b = dirg; idx=i; }
	
	public int compareTo(incpair e){ return (int) (b - e.b);	}
}
	static class decpair implements Comparable<decpair>
{
	int a; long b;int idx;
	
	decpair(int a, long dirg,int i) {this.a = a;	b = dirg; idx=i;}
	
	public int compareTo(decpair e){ return (int) (e.b- b);	}
}

	
	
	
	
	
	


	static long allpowers[];
	static class Quad implements Comparable<Quad>{
		int u;
		int v;
		char state;
		int turns;
		public Quad(int i, int j, char c, int k) {
		u=i;
		v=j;
		state=c;
		turns=k;
		}
		public int compareTo(Quad e){ return (int) (turns - e.turns);	}
		
	}
	static long dirg[][];
	static Edge[] driver;
	
	static int n;
		static class Edge implements Comparable<Edge>
	{
		int node; long cost;
		
		Edge(int a, long dirg) { node = a;	cost = dirg; }
		
		public int compareTo(Edge e){ return (int) (cost - e.cost);	}
	}

	



	  static long manhatandistance(long x,long x2,long y,long y2) {
		  return  Math.abs(x-x2)+Math.abs(y-y2);
	  }
	  static long fib[];
	  static long fib(int n) {
		  if(n==1||n==0) {
			  return 1;
		  }
		  if(fib[n]!=-1) {
			  return fib[n];
		  }
		  else 
			  return  fib[n]=  ((fib(n-2)%mod+fib(n-1)%mod)%mod);
	  }
	  static class Pair implements Comparable<Pair>{
		  int v;
		  long cost;
		  Pair(int a, long b){
			  v=a;
			  cost=b;
		  }
		public int compareTo(Pair p) {
			return (int) (this.cost-p.cost);
		 
				 
		}
		  
		  
	
		
		
	}
	static long[][] comb;		
	
	
	
static  class Triple implements Comparable<Triple>{

int t;
int burn;
		int cost;
		int idx;
		public Triple(int a,int b,int l,int i) {
			t=a;
			burn=b;
			cost=l;
			idx=i;
		}
		@Override
		public int compareTo(Triple o) {
			return Long.compare( burn,o.burn);	
		}
		
	}
	
	static TreeSet<Long> primeFactors(long N)		// O(sqrt(N) / ln sqrt(N))
	{
		TreeSet<Long> factors = new TreeSet<Long>();		//take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);

		while(p * p <= N)
		{
			while(N % p == 0) { factors.add((long) p); N /= p; }
			if(primes.size()>idx+1)
			p = primes.get(++idx);
			else
				break;
		}

		if(N != 1)						// last prime factor may be > sqrt(N)
			factors.add(N);				// for integers whose largest prime factor has a power of 1
		return factors;
	}
	
	static boolean visited[];
	/**static int bfs(int s)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		int count=0;
		int maxcost=0;
		int dist[]=new int[n];
		dist[s]=0;
		while(!q.isEmpty())
		{
			
			int u = q.remove();
			if(dist[u]==k) {
				break;
			}
			for(Pair v: adj[u])
			{	
				maxcost=Math.max(maxcost, v.cost);
			
			
			
			if(!visited[v.v])	{
				
				visited[v.v]=true;
				q.add(v.v);
				dist[v.v]=dist[u]+1;
				maxcost=Math.max(maxcost, v.cost);
			}
			}	
			
		}
		return maxcost;
	}**/
	public static boolean FindAllElements(int n, int k) {
	 int sum = k;  
     int[] A = new int[k];  
      Arrays.fill(A, 0, k, 1);  
        
      for (int i = k - 1; i >= 0; --i) {  
      
           while (sum + A[i] <= n) {  
      
              sum += A[i];  
              A[i] *= 2;  
          }  
      }  
      if(sum==n) {
      	return true;
      }
      else
    	return false; 
	}
	
	static long[][] memo;

	
	static boolean vis2[][];
	
	static class SegmentTree {		// 1-based DS, OOP
		
		int N; 			//the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;
		
		SegmentTree(int[] in)		
		{
			array = in; N = in.length - 1;
			sTree = new int[N<<1];		//no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new int[N<<1];
			build(1,1,N);
		}
		
		void build(int node, int b, int e)	// O(n)
		{
			if(b == e)					
				sTree[node] = array[b];
			else						
			{
				int mid = b + e >> 1;
				build(node<<1,b,mid);
				build(node<<1|1,mid+1,e);
				sTree[node] = sTree[node<<1]+sTree[node<<1|1];
			}
		}
		
		
		void update_point(int index, int val)			// O(log n)
		{
			index += N - 1;				
			sTree[index] += val;			
			while(index>1)				
			{
				index >>= 1;
				sTree[index] = sTree[index<<1] + sTree[index<<1|1];		
			}
		}
		
		
		void update_range(int i, int j, int val)		// O(log n) 
		{
			update_range(1,1,N,i,j,val);
		}
		
		void update_range(int node, int b, int e, int i, int j, int val)
		{
			if(i > e || j < b)		
				return;
			if(b >= i && e <= j)		
			{
				sTree[node] += (e-b+1)*val;			
				lazy[node] += val;				
			}							
			else		
			{
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node<<1,b,mid,i,j,val);
				update_range(node<<1|1,mid+1,e,i,j,val);
				sTree[node] = sTree[node<<1] + sTree[node<<1|1];		
			}
			
		}
		void propagate(int node, int b, int mid, int e)		
		{
			lazy[node<<1] += lazy[node];
			lazy[node<<1|1] += lazy[node];
			sTree[node<<1] += (mid-b+1)*lazy[node];		
			sTree[node<<1|1] += (e-mid)*lazy[node];		
			lazy[node] = 0;
		}
		
		int query(int i, int j)
		{
			return query(1,1,N,i,j);
		}
		
		int query(int node, int b, int e, int i, int j)	// O(log n)
		{
			if(i>e || j <b)
				return 0;		
			if(b>= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			int q1 = query(node<<1,b,mid,i,j);
			int q2 = query(node<<1|1,mid+1,e,i,j);
			return q1 + q2;	
					
		}
	
	}
	static boolean f2=false;
	static long[][] matMul(long[][] a2, long[][] b, int p, int q, int r)	//C(p x r) = A(p x q) x (q x r) -- O(p x q x r)
	{
		long[][] C = new long[p][r];
		for(int i = 0; i < p; ++i) {
			for(int j = 0; j < r; ++j) {
				for(int k = 0; k < q; ++k) {
					C[i][j] = (C[i][j]+(a2[i][k]%mod * b[k][j]%mod))%mod;
		 C[i][j]%=mod;
				}
		
			}
		}
		return C;
	}
		
	
	
		
		
		
		

		
	
	static ArrayList<Pair> a1[];
	static int memo1[];
	
	static boolean vis[];
	static TreeSet<Integer> set=new TreeSet<Integer>();
	
	static long modPow(long ways, long count, long mod)	// O(log e)
	{
		ways %= mod;
		long res = 1;
		while(count > 0)
		{
			if((count & 1) == 1)
				res = (res * ways) % mod;
			ways = (ways * ways) % mod;
			count >>= 1;
		}
		return res%mod;
	}
	
	
	

	static long gcd(long ans,long b) {
		if(b==0) {
			return ans;
		}
		return gcd(b,ans%b);
	}
	static int[] isComposite;
	static int[] valid;
	
	static ArrayList<Integer> primes;
	static ArrayList<Integer> l;
	static void sieve(int N)	// O(N log log N) 
	{
		isComposite = new int[N+1];					
		isComposite[0] = isComposite[1] = 1;			// 0 indicates a prime number
		primes = new ArrayList<Integer>();
		l=new ArrayList<>();
		valid=new int[N+1];
		for (int i = 2; i <= N; ++i) 					//can loop till i*i <= N if primes array is not needed O(N log log sqrt(N)) 
			if (isComposite[i] == 0) 					//can loop in 2 and odd integers for slightly better performance
			{
				primes.add(i);
				l.add(i);
				valid[i]=1;
				
				for (int j = i*2; j <=N; j +=i) {	// j = i * 2 will not affect performance too much, may alter in modified sieve
						isComposite[j] = 1;
						
						
						
				      
					}
			}
		
		for(int i=0 ; i<primes.size() ; i++) {
			for(int j:primes) {
				if(primes.get(i)*j>N) {
					break;
				}
				valid[primes.get(i)*j]=1;
			}
		}
	}
	
	public static long[] schuffle(long[] a2) {
		for (int i = 0; i < a2.length; i++) {
			int x=(int)(Math.random()*a2.length);
		long temp=a2[x];
		a2[x]=a2[i];
		a2[i]=temp;
		}
		return a2;
	}
		static int V;
	static long INF=(long) 1E16;
		
		static class Edge2 
		{
			int node;
		long cost;
			long next;
			Edge2(int a, int c,Long long1) { node = a;	cost = long1; next=c;}
			
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
}