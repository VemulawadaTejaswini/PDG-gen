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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] == '.') {
                    int count = 1;
                    count+=up(a,i,j);
                    count+=down(a,i,j);
                    count+=left(a,i,j);
                    count+=right(a,i,j);
                    max = Math.max(max,count);
                }
            }
        }
        out.println(max);
        out.flush();
    }
    private static int up(char[][] c, int i,int j) {
        int count = 0;
        while (--i>=0 && c[i][j]!='#') {
            count++;
        }
        return count;
    }
    private static int down(char[][] c, int i,int j) {
        int count = 0;
        while (++i<c.length && c[i][j]!='#') {
            count++;
        }
        return count;
    }
    private static int left(char[][] c, int i,int j) {
        int count = 0;
        while (--j>=0 && c[i][j]!='#') {
            count++;
        }
        return count;
    }
    private static int right(char[][] c, int i,int j) {
        int count = 0;
        while (++j<c[i].length && c[i][j]!='#') {
            count++;
        }
        return count;
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
    private static int getMaxNumber(int n) {
        if(n<=9) return 1;
        if(n%10==0) {
            return 10;
        }
        int l = Integer.toString(n).length();
        StringBuilder sb = new StringBuilder();
        while (l-->0) {
            sb.append("1");
        }
        return Integer.parseInt(sb.toString());
    }
    private static boolean isPrime(int n) {
        if(n<2) return false;
        for (int i=2;i*i<=n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    private static boolean check(boolean [][] c, int i, int j) {
        if(i<0 || j < 0 || i>=c.length || j>=c[i].length) return false;
        return c[i][j];
    }
    static boolean checkFreq(int [] a, int [] b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    static int [] freq(String s) {
        int [] f = new int[26];
        for(char c : s.toCharArray()) {
            f[c-'a']++;
        }
        return f;
    }
    static boolean isPalindrome(char [] c) {
        int i = 0;
        int j = c.length - 1;
        while (i<=j) {
            if(c[i]!=c[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    static String revereString(String s) {
        char [] c = s.toCharArray();
        int i = 0;
        int j = c.length - 1;
        while (i<=j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
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