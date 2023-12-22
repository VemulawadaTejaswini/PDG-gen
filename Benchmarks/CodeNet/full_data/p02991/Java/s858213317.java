import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class solver
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n,m;

        n = s.nextInt();
        m = s.nextInt();

        ArrayList<Integer>[] adj = new ArrayList[3*n+5];
        for(int i=0;i<3*n+5;i++)
            adj[i] = new ArrayList<>();

        int a,b,src,dest;

        for(int i =0;i<m;i++)
        {
            a = s.nextInt();
            b = s.nextInt();

            adj[a].add(b+n);
            adj[a+n].add(b+2*n);
            adj[a+2*n].add(b);
        }

        src = s.nextInt();
        dest = s.nextInt();
        int[] dist = new int[3*n+5];
        for(int i=0;i<3*n+5;i++)
            dist[i]=-1;

        bfs(adj,dist,src,dest,n);

        if(dist[dest]==-1)
            System.out.println(-1);
        else
            System.out.println(dist[dest]/3);

    }

    static void bfs(ArrayList<Integer>[] adj,int[] dist,int src,int dest,int n)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(src);

        dist[src] =0;
        while(q.size()>0)
        {
            int v = q.peek();
            q.remove();

            for(int u:adj[v])
            {
                if(dist[u]==-1)
                {
                    dist[u]=dist[v]+1;
                    q.add(u);
                }
            }
        }
    }
}