import java.io.*;
import java.util.*;
import java.lang.*;
class Graph
{
	public ArrayList adjacency[];
	public Graph(int nodes)
	{
		adjacency = new ArrayList[nodes];
		for(int i=0;i<nodes;i++)
		{
			adjacency[i] = new ArrayList<Integer>();
		}
	}
	@Override
	public String toString()
	{
		String ret = "";
		for (ArrayList temp : adjacency) {
			ret+=(temp.toString()+"\n");
		}
		return ret;
	}
	public void addEdge(int from, int to)
	{
		adjacency[from].add(to);
		adjacency[to].add(from);
	}
}
	
public class Main {
	public static Graph g;
	public static int taka,aoki;
	public static int count[];
	public static boolean vis[];
	public static void mark(int node, int pos)
	{
		count[node] = pos;
		ArrayList list = g.adjacency[node];
		int val;
		for(int i=0;i<list.size();i++)
		{
			val = (int)list.get(i);
			if(count[val]<0)
			{
				mark(val,pos+1);
			}
		}
	}
	public static int calc(int node, int pos,PrintWriter out)
	{
		vis[node]=true;
		if( count[node]+1==pos)
			return count[node];
		// if(count[node]<pos)
		// 	return Integer.MIN_VALUE;
		ArrayList list = g.adjacency[node];
		// out.println("node: "+node);
		// out.println("list: "+list);
		// out.println();
		int val;
		int ans = 0;
		if(list.size()==1){
			// out.println("yo");
			ans = count[(int)list.get(0)];
		}
		for(int i=0;i<list.size();i++)
		{
			val = (int)list.get(i);
			if(!vis[val])
				ans=Math.max(ans,calc(val,pos+1,out));
		}
		return ans;
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		taka = in.nextInt()-1;
		aoki = in.nextInt()-1;
		g = new Graph(n);
		int a,b;
		for(int i=0;i<n-1;i++)
		{
			a=in.nextInt()-1;
			b=in.nextInt()-1;
			g.addEdge(a,b);
		}
		count = new int[n];
		vis = new boolean[n];
		// Arrays.fill(count,-1);
		for(int i=0;i<n;i++)
		{
			count[i]=-1;
			vis[i]=false;
		}
		mark(aoki,0);
		// out.println("marked");
		// for(int i=0;i<n;i++)
		// {
		// 	out.print(i+" ");
		// 	out.println(count[i]);
		// }
		out.println(calc(taka,0,out));
        out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}