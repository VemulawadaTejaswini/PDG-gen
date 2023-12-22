import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);


        int l = in.nextInt();
        int r = in.nextInt();
        long min = Long.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i = l; i <=r; i++) {
            set.add(i%2019);
            if(set.size() == 2019) break;
        }
        int [] a = new int[set.size()];
        int index = 0;
        for(int i : set) {
            a[index++] = i;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                min = Math.min(min,(a[i]*a[j])%2019);
            }
        }
        out.println(min);

       /* min = Integer.MAX_VALUE;
        for (long i = l; i <=r; i++) {
            for (long j = i+1; j <=r; j++) {
                min = Math.min(min,(i*j)%2019);
            }
        }
        out.println(min);*/
        out.flush();
    }
    static double distance(int [] a, int [] b) {
        double d = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = (a[i]-b[i])*(a[i]-b[i]);
            d+=temp;
        }
        return Math.sqrt(d);
    }
    static boolean isInteger(double d) {
        return d == (int)d;
    }
    static int f(LinkedList<Integer> q) {
        int size = q.size();
        int count = 0;
        size/=2;
        while (size-->0) {
            int first = q.pollFirst();
            int second = q.pollFirst();
            if(first+second>=10) count++;
            int newValue = (first+second)%10;
            q.addLast(newValue);
        }
        return count;
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