import java.io.*;
import java.util.*;


public class Main {

    private static List<List<Integer>> subsets;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int [] b = a.clone();
        Arrays.sort(b);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]) count++;
        }
        if(count<=2) out.println("YES");
        else out.println("NO");
        out.flush();
    }
    static int toBinary(int n) {
        String  s = Integer.toBinaryString(n);
        return Integer.parseInt(s);
    }
    static int numberOfDigits(int n) {
        int count = 0;
        while (n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    static int gcd(int a,int b) {
        return b == 0 ? a : gcd(b,a%b);
    }
    static char [] convert(char [] c) {
        for (int i = 0; i < c.length; i++) {
            char current = c[i];
            if (current == '9') {
                c[i] = '0';
            }
            else {
                c[i] = ++c[i];
            }
        }
        return c;
    }
    static char [] shift(char [] c) {
        char temp = c[c.length - 1];
        for (int i = 0; i < c.length;i++) {
            char current = c[i];
            c[i] = temp;
            temp = current;
        }
        c[0] = temp;
        return c;
    }
    static void subsets(int [] a, int index, List<Integer> list) {
        subsets.add(new ArrayList<>(list));
        for (int i = index; i < a.length; i++) {
            list.add(a[i]);
            subsets(a,i+1,list);
            list.remove(list.size() - 1);
        }
    }
    static long sum(long n) {
        return n*(n+1)/2;
    }

    static int lcm(int a,int b,int gcd) {
        return a*b/gcd;
    }

}
class Point {
    int x;
    int y;
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
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

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