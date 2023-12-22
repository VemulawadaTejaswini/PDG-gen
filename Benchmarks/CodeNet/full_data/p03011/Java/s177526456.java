import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = Math.min(Math.min(a+b,b+c),c+a);
        out.println(min);
        out.flush();
    }
    private static int bfs(char[][] c, int i, int j,int length,boolean[][] visited) {
        LinkedList<Point> q = new LinkedList<>();
        q.add(new Point(i,j));
        int distance = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                Point current = q.pollFirst();
                visited[current.getI()][current.getJ()] = true;
                int up = current.getI() - 1;
                if (up >=0) {
                    if(!visited[up][current.getJ()]) {
                        if(c[up][current.getJ()] == 'Y') return distance + 1;
                        else q.add(new Point(up,current.getJ()));
                    }
                }
                int down = current.getI() + 1;
                if (down<c.length) {
                    if(!visited[down][current.getJ()]) {
                        if (c[down][current.getJ()] == 'Y') return distance + 1;
                        else q.add(new Point(down, current.getJ()));
                    }
                }
                int left = current.getJ() - 1;
                if (left>=0) {
                    if(!visited[current.getI()][left]) {
                        if (c[current.getI()][left] == 'Y') return distance + 1;
                        else q.add(new Point(current.getI(), left));
                    }
                }
                int right = current.getJ() + 1;
                if(right<c[i].length) {
                    if(!visited[current.getI()][right]) {
                        if (c[current.getI()][right] == 'Y') return distance + 1;
                        else q.add(new Point(current.getI(), right));
                    }
                }
            }
            distance++;
        }
        return Integer.MAX_VALUE;
    }


}
class Point {
    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    public Point(int i, int j) {
        this.i = i;
        this.j = j;
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