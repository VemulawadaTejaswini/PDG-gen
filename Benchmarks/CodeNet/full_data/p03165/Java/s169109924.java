import java.util.*;
		import java.io.*;
		 public class Main {
			public static boolean visited[]; 
			public static Integer distances[];
			public static String s ; public static String t ;
			static int dp[][]= new int [3005][3005]; 
			public static int solve(int i , int j ) {
				if(i==s.length()-1||j==t.length()-1)
					return dp[i][j]=0 ;
				if(dp[i][j]!=-1)
					return dp[i][j] ; 
				if(s.charAt(i)==t.charAt(j))
					return dp[i][j]=1+solve(i+1,j+1); 
				return dp[i][j]=Math.max(solve(i+1,j),solve(i,j+1)); 
			}
			public static void print(int i , int j) {
				if(i==s.length()||j==t.length())
					return ; 
				int ans = solve(i,j); 
				if(ans==0) {
					return ; }
				if(s.charAt(i)==t.charAt(j)) {
					System.out.print(s.charAt(i));
					print(i+1,j+1); 
			}
				else if (ans == dp[i+1][j]) 
				print(i+1,j); 
				else 
					print(i,j+1); 
		
			}
		    public static void main ( String args[] ) {
		    	FastReader sc = new FastReader();
		    	s = sc.next(); 
		    	t= sc.next(); 
		    	for(int x []:dp)
		    		Arrays.fill(x,-1); 
		    	print(0,0); 
		    }
				
		     static class Graph
		    {
		        public int V;  
		        public LinkedList<Integer> adj[];
 		        Graph(int v)
		        {
		            V = v;
		            visited = new boolean[v+1]; 
		            distances = new Integer[v+1]; 
		            for(int i = 0 ; i <v+1 ; i++)
		            	distances[i] = -1  ;
		            adj = new LinkedList[v+1];
		            for (int i=0; i<v+1; ++i)
		                adj[i] = new LinkedList<Integer>();
		        }
		        void addEdge(int v, int w)
		        {
		            adj[v].add(w); 
		        }
		        void dfs(int node) {
		        	visited[node]= true; 
		        	System.out.print(node+" ");
		        	for(int x :adj[node]) {
		        		if(!visited[x])
		        			dfs(x); 
		        	}
		        	
		        }
		        void bfs(int node){
		            Queue<Integer> q = new LinkedList<Integer>();   ;
		            distances[node]= 0 ;
		            q.add(node);
		            while(!q.isEmpty()){
		                int src = q.peek();
		                System.out.print(src+" ");
		                q.remove();
		                int cost = distances[src];
		                for(int child : adj[src]){
		                    if(distances[child]==-1){
		                        q.add(child);
		                        distances[child]= cost+1;
		                    }
		                }
		            }
		        }
		        public  int graph_height(int node) {
		        	int h = 0 ; 
		        	for(int x : adj[node])
		        		h= Math.max(h,1+graph_height(x));
		  
		        return h ; 
		          
		    }
		    }
		     
		    static class FastReader
			{
				BufferedReader br;
				StringTokenizer st;
 
				public FastReader() {
					  
					   br = new BufferedReader(new InputStreamReader(System.in));
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
		 }
		  class Pair {
			int x ;
			int y ;
			public Pair(int x ,int y){
				this.x = x;
				this.y=y;}
		}
 
		  class Pair1 implements Comparable{
			int x ;
			int y ;
			public Pair1(int x ,int y){
				this.x = x;
				this.y=y;}
			public int compareTo(Object o) {
				Pair1 a = (Pair1) o ;
 
				return (this.x-a.x);
			}
 
			}
		 class Pair2 implements Comparable{
			int x ;
			int y ;
			public Pair2(int x ,int y){
				this.x = x;
				this.y=y;}
			public int compareTo(Object o) {
				Pair2 a = (Pair2) o ;
 
				return (this.y-a.y);
			}
		 }
		 
		 
