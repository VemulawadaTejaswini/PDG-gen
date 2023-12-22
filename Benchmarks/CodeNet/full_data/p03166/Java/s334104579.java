import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	//Fast IO class
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
        	boolean env=System.getProperty("ONLINE_JUDGE") != null;
        	if(env) {
        		try {
					br=new BufferedReader(new FileReader("src\\input.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
        	}
        	else {
        		br = new BufferedReader(new
                        InputStreamReader(System.in)); 
        	}
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    
    static long MOD=1000000000+7;
    
    //Brian Kernighan’s Algorithm
    static long countSetBits(long n){
        if(n==0) return 0;
        return 1+countSetBits(n&(n-1));
    }
    //Euclidean Algorithm
    static long gcd(long A,long B){
        if(B==0) return A;
        return gcd(B,A%B);
    }
    //Modular Exponentiation
    static long fastExpo(long x,long n){
        if(n==0) return 1;
        if((n&1)==0) return fastExpo((x*x)%MOD,n/2)%MOD;
        return ((x%MOD)*fastExpo((x*x)%MOD,(n-1)/2))%MOD;
    }
    //Prime Number Algorithm
    static boolean isPrime(long n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6)
            if(n%i==0 || n%(i+2)==0) return false;
        return true;
    }
    //Sieve of eratosthenes
    static int[] findPrimes(int n){
        boolean isPrime[]=new boolean[n+1];
        ArrayList<Integer> a=new ArrayList<>();
        int result[];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;++i){
            if(isPrime[i]==true){
                for(int j=i*i;j<=n;j+=i) isPrime[j]=false;
            }
        }
        for(int i=0;i<=n;i++) if(isPrime[i]==true) a.add(i);
        result=new int[a.size()];
        for(int i=0;i<a.size();i++) result[i]=a.get(i);
        return result;
        
    } 
    // Pair
    static class pair{
    	int x,y;
    	pair(int a,int b){
    		this.x=a;
    		this.y=b;
    	}
    	public boolean equals(Object obj) {
    		if(obj == null || obj.getClass()!= this.getClass()) 
                return false;
            pair p = (pair) obj;
            return (this.x==p.x && this.y==p.y);
        }
    	public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    //Main function
    static int V;
    static ArrayList<Integer> graph[];
    static int visited[];
    static Stack<Integer> stack=new Stack<>();
    static void init(int n) {
    	V=n;
    	graph=new ArrayList[n];
    	for(int i=0;i<n;i++) graph[i]=new ArrayList<>();
    }
    static void addEdge(int src,int dest) {
    	graph[src].add(dest);
    }
    static void topoSort(int s) {
    	if(visited[s]==1) return;
    	visited[s]=1;
    	for(Integer x: graph[s]) topoSort(x);
    	stack.push(s);
    }
    static int solve(int s) {
    	//if(visited[s]==1) return 0;
    	visited[s]=1;
    	int max=1;
    	for(Integer x: graph[s]) {
    		max=Math.max(max, 1+solve(x));
    	}
    	return max;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader sc=new FastReader();
    	int test=1;
        while(test-->0) {
        	int n=sc.nextInt(),m=sc.nextInt();
        	init(n);
        	visited=new int[n];
        	while(m-->0) addEdge(sc.nextInt()-1,sc.nextInt()-1);
        	int ans=Integer.MIN_VALUE;
        	for(int i=0;i<n;i++) {
        		if(visited[i]==1) continue;
        		topoSort(i);
        	}
        	ArrayList<Integer> tmp=new ArrayList<>();
        	while(!stack.isEmpty()) tmp.add(stack.pop());
        	Arrays.fill(visited, 0);
        	for(Integer x: tmp) {
        		if(visited[x]==1) continue;
        		ans=Math.max(ans, solve(x));
        	}
        	System.out.println(ans-1);
        }
    }
}
