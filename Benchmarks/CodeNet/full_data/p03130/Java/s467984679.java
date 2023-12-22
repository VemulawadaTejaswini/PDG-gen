// 作者：杨成瑞先生
import java.io.*;
import java.util.*;

public class Main {

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void dfs(int v) {
        visited[v] = true;
        for(int next : adj[v]) {
            if(!visited[next]) {
                dfs(next);
                break;
            }
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        adj = new ArrayList[4];
        for(int i=0;i<4;i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<3;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            adj[a].add(b);
            adj[b].add(a);
        }

        visited = new boolean[4];
        dfs(0);
        //pw.println(Arrays.toString(visited));

        for(int i=0;i<4;i++) {
            if(!visited[i]) {
                pw.println("NO");
                pw.close();
                return;
            }
        }
        pw.println("YES");
        pw.close();
	}

}