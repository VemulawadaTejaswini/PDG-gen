import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        ArrayList<Task.Update> upd;
        int[] color;
        int req_dis;

        public void solve(int testNumber, InputReader in, OutputWriter out)
        {
            int n = in.readInt();
            int m = in.readInt();
            Graph g = new Graph(n);
            for (int i = 0; i < m; i++)
            {
                g.addEdge(in.readInt() - 1, in.readInt() - 1);
            }
            upd = new ArrayList<Task.Update>();
            color = new int[n];
            Arrays.fill(color, 0);
            int q = in.readInt();
            for (int i = 0; i < q; i++)
            {
                upd.add(new Task.Update(in.readInt() - 1, in.readInt(), in.readInt()));
            }
            for (int i = q - 1; i >= 0; i--)
            {
                req_dis = upd.get(i).dist;
                dfs(upd.get(i).col, 0, upd.get(i).ver, g);
            }
            for (int i = 0; i < n; i++)
            {
                out.printLine(color[i]);
            }
        }

        void dfs(int col, int dis, int u, Graph g)
        {
            if (dis > req_dis)
            {
                return;
            }
            color[u] = col;
            for (int c : g.getAdjacent(u))
            {
                if (color[c] == 0)
                {
                    dfs(col, dis + 1, c, g);
                }
            }
        }

        static class Update
        {
            int ver;
            int dist;
            int col;

            Update(int ver, int dis, int col)
            {
                this.ver = ver;
                this.col = col;
                this.dist = dis;
            }

        }

    }

    static class OutputWriter
    {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream)
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer)
        {
            this.writer = new PrintWriter(writer);
        }

        public void close()
        {
            writer.close();
        }

        public void printLine(int i)
        {
            writer.println(i);
        }

    }

    static class Graph
    {
        int n;
        boolean[] visited;
        List<Integer>[] ar;

        public Graph(int n)
        {
            this.n = n;
            ar = new List[n];
            for (int i = 0; i < n; i++)
            {
                ar[i] = new ArrayList<Integer>();
            }
            visited = new boolean[n];
            Arrays.fill(visited, false);
        }

        public List<Integer> getAdjacent(int ver)
        {
            return ar[ver];
        }

        public void addEdge(int u, int v)
        {
            ar[u].add(v);
            ar[v].add(u);
        }

    }

    static class InputReader
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars == -1)
            {
                throw new InputMismatchException();
            }
            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                } catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt()
        {
            int c = read();
            while (isSpaceChar(c))
            {
                c = read();
            }
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do
            {
                if (c < '0' || c > '9')
                {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
            {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c)
        {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);

        }

    }
}

