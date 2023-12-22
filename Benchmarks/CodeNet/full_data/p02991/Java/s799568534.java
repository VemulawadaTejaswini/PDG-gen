import java.io.*;
import java.util.*;
 
public class Main {
	public static int mindist = Integer.MAX_VALUE;
	public static ArrayList graph[];
	public static int vis[];
	public static void kenpa(int node)
	{
		if(vis[node]==1)
			return;
		vis[node] = 1;
		ArrayList<Integer> list = (ArrayList<Integer>)graph[node];
		ArrayList<Integer> dist = new ArrayList<Integer>();
		ArrayList<Integer> temp;
		int len = list.size();
		int next;
		for(int i=0;i<len;i++)
		{
			next = list.get(i);
			kenpa(next);
			temp = graph[next];
			for(int j=0;j<temp.size();j++)
			{
				dist.add(temp.get(j)+1);
			}
		}
		graph[node] = dist;
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList adjacency[] = new ArrayList[n+1];
		int one,two;
		for(int x=0;x<n+1;x++)
		{
			adjacency[x] = new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++)
		{
			one = in.nextInt();
			two = in.nextInt();
			adjacency[one].add(two);
		}
		int source = in.nextInt();
		int dest = in.nextInt();
		int visited[] = new int[n+1];
		Arrays.fill(visited,0);
		adjacency[dest].add(0);
		visited[dest]=1;
		vis=visited;
		graph = adjacency;
		kenpa(source);
		ArrayList<Integer> sourcelist = (ArrayList<Integer>)graph[source];
		int d;
		for(int i=0;i<sourcelist.size();i++)
		{
			d = sourcelist.get(i);
			if(d%3==0)
				mindist = Math.min((int)(d/3),mindist);
		}
		if(mindist==Integer.MAX_VALUE)
			out.println(-1);
		else
			out.println(mindist);
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