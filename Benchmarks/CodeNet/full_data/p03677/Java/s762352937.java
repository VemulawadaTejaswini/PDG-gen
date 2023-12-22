import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new IOException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
    }
}

public class Main {


    public static void main(String[] args) throws IOException {

        FastScanner fastScanner = new FastScanner();
        int N = fastScanner.nextInt();
        int M = fastScanner.nextInt();

        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = fastScanner.nextInt();
        }

        long[] costs = new long[M + 1];
        long[] cnts = new long[M + 1];
        long costSum = 0;

        for(int i = 1; i < N; i++){
            if(a[i - 1] < a[i]){
                long v = a[i] - a[i - 1];
                costs[a[i]] += v;
                cnts[a[i - 1]] -= 1;
                cnts[a[i]] += 1;
                costSum += v;
            }else if(a[i - 1] > a[i]){
                long v = (M - a[i - 1]) + a[i];
                costs[a[i]] += v;
                cnts[a[i]] += 1;
                costSum += v;
            }
        }

        long answer = costSum;

        long cntSum = 0;
        long cntAcc = 0;
        long currCostSum = 0;

        for(int i = M; i >= 1; i--){
            cntSum += cnts[i];
            cntAcc += cntSum;
            currCostSum += costs[i];
            long v = costSum + cntAcc - currCostSum;

            System.out.printf("%d %d\n", i, v);
            answer = Math.min(answer, v);
        }

        System.out.print(answer);
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public void close() {
        try {
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}