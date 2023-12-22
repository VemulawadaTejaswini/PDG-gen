import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    boolean flag;
    ArrayList<Integer> ans;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        int m = ipar();
        Vertex[] vertices = new Vertex[n];
        for (int i = 0; i < n; i++)
        {
            vertices[i] = new Vertex(i);
        }
        for (int i = 0; i < m; i++)
        {
            ntok();
            int a = ipar()-1;
            int b = ipar()-1;
            vertices[a].add(vertices[b]);
        }
        ans = new ArrayList<>();
        for (int i = 0; i < n && !flag; i++)
        {
            if (!vertices[i].visit)
            {
                dfs(vertices[i], new ArrayList<>());
            }
        }
        if (flag)
        {
            out.println(ans.size());
            for (int x : ans)
            {
                out.println(x+1);
            }
        }
        else
        {
            out.println(-1);
        }

        out.flush();
        in.close();
    }

    public void dfs(Vertex curr, ArrayList<Vertex> path)
    {
        if (curr.visit)
        {
            if (!curr.finish)
            {
                ans.add(curr.i);
                for (int i = path.size()-1; i >= 0; i--)
                {
                    if (path.get(i).i == curr.i)
                    {
                        break;
                    }
                    ans.add(path.get(i).i);
                }
                flag = true;
            }
            return;
        }
        if (flag)
        {
            return;
        }
        curr.visit = true;
        path.add(curr);
        for (Vertex v : curr.neighbors)
        {
            dfs(v, path);
        }
        path.remove(path.size()-1);
        curr.finish = true;
    }

    private class Vertex
    {
        int i;
        ArrayList<Vertex> neighbors;
        boolean visit, finish;

        public Vertex(int i)
        {
            this.i = i;
            neighbors = new ArrayList<>();
        }

        public void add(Vertex other)
        {
            neighbors.add(other);
        }
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public int[] iapar(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        return arr;
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public long[] lapar(int n)
    {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = lpar();
        }
        return arr;
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
