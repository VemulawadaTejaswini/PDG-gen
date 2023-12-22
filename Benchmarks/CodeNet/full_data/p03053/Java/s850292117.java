import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {
        public static void main(String[] args) throws IOException {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

            int n = in.nextInt();
            int m = in.nextInt();
            String [] a = new String[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = in.next();
            }
            char[][] c = new char[n][m];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i].toCharArray();
            }
            LinkedList<Point> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(c[i][j] == '#') q.addFirst(new Point(i,j));
                }
            }
            int count = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    Point p = q.poll();
                    int x = p.getX();
                    int y = p.getY();
                    if(check(x+1,y,n,m) && c[x+1][y]=='.') {
                        c[x+1][y] = '#';
                        q.addLast(new Point(x+1,y));
                        flag = true;
                    }
                    if(check(x-1,y,n,m) && c[x-1][y]=='.') {
                        c[x-1][y] = '#';
                        q.addLast(new Point(x-1,y));
                        flag = true;
                    }
                    if(check(x,y + 1,n,m) && c[x][y+1]=='.') {
                        c[x][y+1] = '#';
                        q.addLast(new Point(x,y+1));
                        flag = true;
                    }
                    if(check(x,y-1,n,m) && c[x][y-1]=='.') {
                        c[x][y-1] = '#';
                        q.addLast(new Point(x,y-1));
                        flag = true;
                    }
                }
                if(flag) count++;
            }
            out.println(count);
            out.flush();
        }
        static boolean check(int x,int y,int n ,int m) {
            return x>=0 && y>=0 && x<n && y<m;
        }
}
    class InputReader extends BufferedReader {
        StringTokenizer tokenizer;

        public InputReader(InputStream inputStream) {
            super(new InputStreamReader(inputStream), 32768);
        }

        public InputReader(String filename) {
            super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(readLine());
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            return tokenizer.nextToken();
        }

        public Integer nextInt() {
            return Integer.valueOf(next());
        }
        public Long nextLong() {return  Long.valueOf(next());}

        static class OutputWriter extends PrintWriter {
            public OutputWriter(OutputStream outputStream) {
                super(outputStream);
            }

            public OutputWriter(Writer writer) {
                super(writer);
            }

            public OutputWriter(String filename) throws FileNotFoundException {
                super(filename);
            }

            public void close() {
                super.close();
            }
        }
    }

    class Point {
        private int x;
        private int y;
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }


