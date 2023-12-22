	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
		 static ArrayList<HashMap<Integer, Integer>> w = new ArrayList<HashMap<Integer, Integer>>();
		 static long a_dist[];
		 static int[][] c;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        a_dist = new long[N];
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for(int i = 0; i < N; i++)w.add(new HashMap<Integer, Integer>());
	        for(long i=0;i<N-1;i++) {
	        	int ai = sc.nextInt()-1;
	        	int bi = sc.nextInt()-1;
	        	int ci = sc.nextInt();
	        	list.get(ai).add(bi);
	        	list.get(bi).add(ai);
	        	w.get(ai).put(bi,ci);
	        	w.get(bi).put(ai,ci);
	        }
	        
	        int Q = sc.nextInt();
	        int K = sc.nextInt();
	        StringBuffer ans= new StringBuffer();
	        dfs(K-1,0,-1);
	        for(long i=0;i<Q;i++) {
	        	int x = sc.nextInt()-1;
	        	int y = sc.nextInt()-1;
	        	ans.append(a_dist[x]+a_dist[y]);
	        	ans.append("\n");
	        }
	        
	        
	        
	        System.out.println(ans);
	        

	    }
	    
		static void dfs(int now, long cnt, int parent) {
			a_dist[now]=cnt;
			for(int i=0;i<list.get(now).size();i++) {
				int next = list.get(now).get(i);
				int d = w.get(now).get(next);
				if(next == parent)continue;
				dfs(next, cnt+d, now);
			}
		}
	    

	}
	