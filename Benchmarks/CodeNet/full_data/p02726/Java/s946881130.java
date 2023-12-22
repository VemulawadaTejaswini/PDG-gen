import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{


    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        ArrayList<ArrayList<Edge>> al;

        public Graph(int vertices) {
            this.vertices = vertices;
            al = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                al.add(new ArrayList<Edge>());
            }
        }

        public static void addEdgeUndirected(ArrayList<ArrayList<Edge>> al, int source, int destination, int weight) {
            al.get(source).add(new Edge(source, destination, weight));
            al.get(destination).add(new Edge(destination, source, weight));
        }
        public static void shortestpath(ArrayList<ArrayList<Edge>> al, int v, int root,int k,int[] count) {
            boolean[] visited = new boolean[v];
            int[] dist = new int[v];
            dist[root] = 0;
            Queue<Integer> q = new LinkedList<>();
            visited[root] = true;
            q.add(root);
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int i = 0; i < al.get(u).size(); i++) {
                    if (!visited[al.get(u).get(i).destination]) {
                        visited[al.get(u).get(i).destination] = true;
                        q.add(al.get(u).get(i).destination);
                        dist[al.get(u).get(i).destination] = dist[u] + 1;
                        if(dist[al.get(u).get(i).destination]==k) count[k-1]++;
                    }
                }
            }
            }
        }

        public static void main(String[] args) throws IOException {
            Reader r = new Reader();
            int n = r.nextInt();
            int[] count = new int[n];
            Graph g = new Graph(n);
            for (int i = 0; i < n - 1; i++) {
                g.addEdgeUndirected(g.al, i, i + 1, 0);
            }
            int x = r.nextInt() - 1;
            int y = r.nextInt() - 1;
            g.addEdgeUndirected(g.al, x, y, 0);
            for (int k = 1; k < n; k++)
                for (int j = 0; j < n; j++)
                    g.shortestpath(g.al, g.vertices, j, k, count);

            for (int i = 0; i <n-1;i++) System.out.println(count[i]/2);
        }
}

