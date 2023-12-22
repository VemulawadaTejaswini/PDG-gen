import java.io.*;
import java.util.*;


public class Main {

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
        int [] freq1 = new int[100_006];
        for (int i = 0; i < a.length; i+=2) {
            freq1[a[i]]++;
        }
        int [] freq2 = new int[100_006];
        for (int i = 1; i < a.length; i+=2) {
            freq2[a[i]]++;
        }
        int max = Integer.MIN_VALUE;
        int maxElement = -1;
        for (int i = 0; i < freq1.length; i++) {
            if(freq1[i] > max) {
                max = freq1[i];
                maxElement = i;
            }
        }
        int max2 = Integer.MIN_VALUE;
        int maxElement2 = -1;
        for (int i = 0; i < freq2.length; i++) {
            if(freq2[i] > max2) {
                max2 = freq2[i];
                maxElement2 = i;
            }
        }
        int ans = 0;
        if(maxElement!=maxElement2) {
            ans = n - (max + max2);
        }
        else {
            int maxElement3 = -1;
            int max3 = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if(freq2[i] > max3 && freq2[i]!=max2) {
                    max3 = freq2[i];
                    maxElement3 = i;
                }
            }
            if(maxElement3 == maxElement2) {
                ans = n/2;
            }
            else {
                ans = n - (max + max3);
            }
        }
        out.println(ans);
        out.flush();
    }
    static int gcd (int a,int b) {
        return b == 0 ? a : gcd(b,a%b);
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
    private int left;
    private int right;

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
    public Point(int left,int right) {
        this.left = left;
        this.right = right;
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