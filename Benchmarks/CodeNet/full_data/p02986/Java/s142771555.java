import java.io.*;
import java.util.*;
import java.util.Map.Entry;

		
public class Main {
	static LinkedList<Long>[]adj;
	static LinkedList<Triple>[]adj2;
	static int root;
	static long []dist;
	static HashMap<Long,Long>[]infocolor;
	static HashMap<Long,Long>[]infocost;
	static boolean[]v;
	

	static class LCA {
		
		static int log = 22;
		int[] level, up[],sub;
		LCA(int root,int n) {
			up = new int[n][log];
			level = new int[n];
			sub=new int [n];
			dfs(root, root);
		}
 
		int lca(int u, int v) {
 
			if (level[u] < level[v])
				return lca(v, u);
			for (int i = log - 1; i >= 0; i--) {
				int u2 = up[u][i];
				if (level[u2] >= level[v])
					u = u2;
			}
			if (u == v)
				return u;
			for (int i = log - 1; i >= 0; i--) {
				int u2 = up[u][i], v2 = up[v][i];
				if (u2 != v2) {
					u = u2;
					v = v2;
				}
			}
			return up[u][0];
		}
 
		int dfs(int u, int p) {
 
			int ans=1;
			up[u][0] = p;
			for (int i = 1; i < log; i++)
				up[u][i] = up[up[u][i - 1]][i - 1];
			for (long v : adj[u])
				if (v != p) {
					level[(int)v] = level[u] + 1;
					ans+=dfs((int)v, u);
				}
			return sub[u]=ans;
 
		}
 
	}
	static void dfs(int i,long cost) {
		v[i]=true;
		dist[i]=cost;
		for(Triple j:adj2[i]) {
			if(!v[(int)j.j]) {
				for(Entry<Long,Long>e:infocolor[i].entrySet()) {
					infocolor[(int)j.j].put(e.getKey(), e.getValue());
				}
				infocolor[(int)j.j].put(j.color,infocolor[(int)j.j].getOrDefault(j.color,0l)+1);
				for(Entry<Long,Long>e:infocost[i].entrySet()) {
					infocost[(int)j.j].put(e.getKey(), e.getValue());
				}
				//System.out.println(j.cost);
				infocost[(int)j.j].put(j.color,infocost[(int)j.j].getOrDefault(j.color,0l)+j.cost);
				
				dfs((int)j.j,cost+j.cost);
			}
		}
		
	}
	public static void main(String[] args) throws Exception{
		MScanner sc = new MScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n=sc.nextInt();int q=sc.nextInt();
        adj=new LinkedList[n];
        adj2=new LinkedList[n];
        dist=new long[n];
        infocolor=new HashMap[n];
        infocost=new HashMap[n];
        v=new boolean[n];
        for(int i=0;i<n;i++) {
        	adj[i]=new LinkedList<Long>();
        	adj2[i]=new LinkedList<Triple>();
        	infocolor[i]=new HashMap<Long, Long>();
        	infocost[i]=new HashMap<Long, Long>();
        }
        for(int i=1;i<n;i++) {
        	long x=sc.nextInt()-1;long y=sc.nextInt()-1;int color=sc.nextInt();long cost=sc.nextInt();
        	adj[(int)x].add(y);adj[(int)y].add(x);
        	adj2[(int)x].add(new Triple(y,cost,color));
        	adj2[(int)y].add(new Triple(x,cost,color));
        }
        root=0;
        for(int i=1;i<n;i++) {
        	if(adj[i].size()>adj[root].size()) {
        		root=i;
        	}
        }
        dfs(root,0);
        LCA lca=new LCA(root,n);
        for(int i=0;i<q;i++) {
        	long color=sc.nextInt();long newcost=sc.nextInt();int x=sc.nextInt()-1;int y=sc.nextInt()-1;
        	long dist1=dist[x];long dist2=dist[y];
        	long ans=0;
        	long cost=0;
        	long colorold=0;
        	if(lca.lca(x,y)==root) {
        		cost=infocost[x].getOrDefault(color,0l)+infocost[y].getOrDefault(color,0l);
        		//System.err.println(infocost[x].getOrDefault(color,0)+" "+infocost[y].getOrDefault(color,0));
        		colorold=infocolor[x].getOrDefault(color,0l)+infocolor[y].getOrDefault(color,0l);
        		ans=dist1+dist2-cost+colorold*newcost;
        		//System.out.println(cost+" "+colorold);
        	}
        	else {
        		cost=Math.abs(infocost[x].getOrDefault(color,0l)-infocost[y].getOrDefault(color,0l));
        		colorold=Math.abs(infocolor[x].getOrDefault(color,0l)-infocolor[y].getOrDefault(color,0l));
        		ans=Math.abs(dist1-dist2)-cost+colorold*newcost;
        	}
        	pw.println(ans);
        }
        pw.flush();
    }
	
	static class Triple implements Comparable<Triple>
	{
		long j,cost,color;
		Triple(long y, long z,long o){j = y; cost = z;color=o;}
		
		public int compareTo(Triple t) {
			return 0;
		}
		public String toString() {
			return j+" "+cost+" "+color;
		}
		
	}
	static class MScanner {
        StringTokenizer st;
        BufferedReader br;

        public MScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}		