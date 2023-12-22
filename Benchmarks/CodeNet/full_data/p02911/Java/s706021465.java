import java.io.*;
import java.util.*;



public class Main {

    private static int[][] st;
    private static int [] logs;
    private static Set<List<Integer>> permutations;
    private static int index = 0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int [] a = new int[n];
        Arrays.fill(a,k);
        int [] count = new int[n];
        for (int i = 0; i < q; i++) {
            int ans = in.nextInt();
            count[ans - 1]++;
        }
        for (int i = 0; i < a.length; i++) {
            int correct = count[i];
            a[i] = a[i] - (q-correct);
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0) {
                out.println("Yes");
            }
            else {
                out.println("No");
            }
        }
        out.flush();
    }

    private static void permute(int [] a, int l, int r) {
        if(l == r) {
            List<Integer> list = new ArrayList<>();
            for(int i : a) list.add(i);
            permutations.add(list);
        }
        else {
            for (int i = l; i <=r; i++) {
                swap(a,l,i);
                permute(a,l+1,r);
                swap(a,l,i);
            }
        }
    }
    private static void swap(int [] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

}
class Lamp {
    int start;
    int period;
    int state;
    public int getPeriod() {
        return period;
    }

    public int getStart() {
        return start;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Lamp(int start, int period,int state) {
        this.start = start;
        this.period = period;
        this.state = state;
    }

    @Override
    public String toString() {
        return this.getState() + " ";
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

    public Integer nextInt(){
        return Integer.valueOf(next());
    }
    public Long nextLong() {
        return  Long.valueOf(next());
    }
    public Double nextDouble() {
        return Double.valueOf(next());
    }
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