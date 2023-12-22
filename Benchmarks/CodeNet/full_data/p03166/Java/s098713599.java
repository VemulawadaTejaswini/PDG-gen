import java.util.*;
import java.lang.*;
import java.io.*;
//import java.util.stream.Collectors;
public class Main
{
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
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

        public double nextDouble() throws IOException {
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

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

     public static Reader sc = new Reader();
//    public static Scanner sc = new Scanner(System.in);
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//    public static OutputStream out2 = new BufferedOutputStream (System.out);
    public static int n, m, i, j, k, u, v, t, mod = (int)1e9+7;
    public static int[] dist = new int[200005];
    public static HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
    public static class Answer
    {
        int answer;
        Answer()
        {
            this.answer = 0;
        }
    }
    public static Answer answer = new Answer();
    public static void main(String[] args) throws IOException
    {
        n = sc.nextInt();
        m = sc.nextInt();
        for(i = 1; i <= n; i++)
            graph.put(i, new HashSet<>());
        for(i = 0; i < m; i++)
        {
            u = sc.nextInt();
            v = sc.nextInt();
            graph.get(u).add(v);
        }
        for(i = 1; i <= n; i++)
            dfs(i);
        out.write(answer.answer+"");
        out.flush();
    }
    public static int dfs(int source)
    {
        if(graph.get(source).size() == 0)
            return dist[source] = 0;
        if(dist[source] != 0)
            return dist[source];
        for(int child: graph.get(source))
            dist[source] = Math.max(dist[source], dfs(child)+1);
        answer.answer = Math.max(answer.answer, dist[source]);
        return dist[source];
    }
}
