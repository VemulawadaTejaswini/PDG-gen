import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int m = in.nextInt();
        char[][] a =  new char[n][m];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.next().toCharArray();
        }
        int[][] l = new int[n][m];
        int[][] r = new int[n][m];
        int[][] u = new int[n][m];
        int[][] d = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] == '.') {
                    l[i][j] = ++count;
                }
                else {
                    count = 0;
                }
            }
        }
        for (int i = a.length - 1; i >=0; i--) {
            int count = 0;
            for (int j = a[0].length - 1; j >=0; j--) {
                if(a[i][j] == '.') {
                    r[i][j] = ++count;
                }
                else {
                    count = 0;
                }
            }
        }
        for (int i = 0; i < a[0].length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j][i] == '.') {
                    u[j][i] = ++count;
                }
                else {
                    count = 0;
                }
            }
        }

        for (int i = a[0].length - 1; i >=0; i--) {
            int count = 0;
            for (int j = a.length - 1; j >=0; j--) {
                if(a[j][i] == '.') {
                    d[j][i] = ++count;
                }
                else {
                    count = 0;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int res = l[i][j] + r[i][j] + d[i][j] + u[i][j] - 3;
                max = Math.max(max,res);
            }
        }
        out.println(max);
        out.flush();
    }

    private static int [] mergeTwoArrays(int [] a, int [] b) {
        int [] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                res[index++] = a[i++];
            }
            else {
                res[index++] = b[j++];
            }
        }
        System.out.println(i + " " + j);
        if(j == b.length - 1) {
            while (i<a.length) {
                res[index++] = a[i++];
            }
        }
        else {
            while (j<b.length) {
                res[index++] = b[j++];
            }
        }
        return res;
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
    public String toString() {
        return i + " " + j;
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