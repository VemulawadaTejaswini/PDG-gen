import static java.lang.Math.*;
import static java.util.Arrays.* ;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main
{
    ArrayList<Integer> [] adjList ;
    int [] color ;
    int [] dep ;
    int ans = 1 ;
    boolean bfs(int root)
    {
        Queue<Integer> queue = new LinkedList<>() ;
        queue.add(root) ;
        color[root] = 0 ;
        dep[root] = 1 ;
        fill(dep , 0);
        fill(color , -1);
        while (!queue.isEmpty())
        {
            int u = queue.poll() ;
            for(int v : adjList[u])
                if(color[v] == -1)
                {
                    color[v] = color[u] ^ 1 ;
                    dep[v] = dep[u] + 1 ;
                    ans = max(ans , dep[v] );
                    queue.add(v) ;
                }
                else if(color[v] == color[u])
                    return false ;
        }
        return true ;

    }

    void main() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt() ;
        adjList = new ArrayList[N] ;
        color = new int [N] ;
        for(int i = 0 ; i < N ; i ++)
            adjList[i] = new ArrayList<>() ;

        for(int i = 0 ; i < N ; i ++)
        {
            char [] s = sc.next().toCharArray() ;
            for(int j = 0 ; j < N ; j++)
                if(s[j] == '1')
                    adjList[i].add(j) ;
        }
        dep = new int [N] ;
        fill(color , -1);
        color[0] = 0 ;

        fill(dep , 0);
        dep[0] = 1 ;
        if(!bfs(0))
        {
            System.out.println(-1);
            return;
        }
        for(int root = 0 ; root < N ; root ++)
        {
            fill(color , -1);
            fill(dep , 0);
            color[root] = 0  ;
            dep[root] = 1 ;
            bfs(root) ;
        }
        out.print(ans);
        out.flush();
        out.close();
    }

    class Scanner
    {
        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream in)
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws Exception
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        String nextLine() throws Exception
        {
            return br.readLine() ;
        }
        int nextInt() throws Exception { return Integer.parseInt(next()); }

        long nextLong() throws Exception { return Long.parseLong(next()); }

        double nextDouble() throws Exception { return Double.parseDouble(next());}
    }

    public static void main (String [] args) throws Exception
    {
        new Main().main();
    }

}