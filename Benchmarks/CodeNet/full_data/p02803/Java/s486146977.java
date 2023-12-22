package ABC151;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    int h,w;
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        char[][] graph = new char[h][w];
       for(int i=0;i<h;i++)
       {
           graph[i]=sc.next().toCharArray();
       }
        int res=0;
        for(int i=0;i<h*w;i++)
           {
               if(graph[i/w][i%w]!='#')
               {
                   res=Math.max(res,bfs(i,graph));
               }
            }
        System.out.println(res);
    }
    public int bfs(int start, char[][] graph)
    {
        int x=start/w;
        int y=start%w;

        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{x,y});
        boolean[][] visited=new boolean[h][w];
        int step=-1;
        while(queue.size()>0){
            int s=queue.size();
            while(s-->0)
            {
                int[] cell=queue.poll();
                int curx=cell[0];
                int cury=cell[1];
                visited[curx][cury]=true;
                for(int[] direction:directions)
                {
                    int nextx=curx+direction[0];
                    int nexty=cury+direction[1];
                    if(nextx<0||nexty<0||nextx>=h||nexty>=w||visited[nextx][nexty]||graph[nextx][nexty]=='#')
                    {continue;}
                    queue.offer(new int[]{nextx,nexty});
                }
            }
            step++;
        }
        return step;
    }
    //高速なScanner
    class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

}
