/**
 * Created by Karan Jobanputra on 01-04-2017.
 */

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

import static java.lang.Math.*;

public class Main {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static class Node implements Comparable<Node> {
        int v;
        int w;

        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }

        public int compareTo(Node node) {
            if (w == node.w)
                return Integer.compare(v, node.v);

            return (-1) * Integer.compare(w, node.w);
        }
    }

    public static void main(String args[]) throws Exception {
        InputReader sc = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> edge[] = new ArrayList[n+1];
        int color[] = new int[n+1];
        int dist[] = new int[n+1];
        Arrays.fill(color,0);
        Arrays.fill(dist,0);
        for(int i=0;i<edge.length;i++)
        {
            edge[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            edge[u].add(v);
            edge[v].add(u);
        }
        boolean visited[] = new boolean[n+1];
        int q = sc.nextInt();
        while(q-->0)
        {
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            Arrays.fill(visited,false);
            Arrays.fill(dist,0);
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(v);
            dist[v] = 0;
            visited[v] = true;
            while(!queue.isEmpty())
            {
                v = queue.poll();
                if(dist[v]<=d)
                {
                    color[v] = c;
                }
                else
                {
                    if(dist[v]>d)
                    {
                        break;
                    }
                }
                for(int i=0;i<edge[v].size();i++)
                {
                    if(!visited[edge[v].get(i)])
                    {
                        queue.add(edge[v].get(i));
                        dist[edge[v].get(i)] = dist[v]+1;
                        visited[edge[v].get(i)] = true;
                    }
                }
            }

        }
        for(int i=1;i<color.length;i++)
        {
            pw.println(color[i]);
        }
        pw.close();
    }
}