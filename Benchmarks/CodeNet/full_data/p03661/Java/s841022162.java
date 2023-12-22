import java.util.*;
import java.io.*;
/**
 *  @author citizen11
 *  AtCoder Regular Contest 78
 *  Task C - Splitting Pile
 */
public class Main {
    public static void main(String[] args) {
        Reader.init(System.in);
        try {
            int n = Reader.nextInt();
            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                A.add(Reader.nextInt());
            }
            System.out.println(solve(n, A));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static int solve(int n, List<Integer> A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        int min = Math.abs(2 * A.get(0) - sum);
        int runningSum = A.get(0);
        for (int i = 1; i < A.size()-1; i++) {
            runningSum += A.get(i);
            min = Math.min(min, Math.abs(2*runningSum - sum));
        }
        return min;
    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                   reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
