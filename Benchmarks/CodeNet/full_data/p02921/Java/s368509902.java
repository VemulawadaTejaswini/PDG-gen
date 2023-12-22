import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = Integer.MAX_VALUE;
    private static final int MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        String s = in.next();
        String t = in.next();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if((s.charAt(i) == t.charAt(i))) count++;
        }
        out.println(count);
        out.flush();
    }

    private static boolean can(int [] a, int min, long s) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min) return false;
            sum+=a[i]-min;
        }
        return sum>=s;
    }
    private static int binarySearch(int [] a, int min) {
        int lo = 0;
        int hi = a.length - 1;
        while(lo<=hi) {
            int med = lo+(hi-lo)/2;
            if(min > a[med]) {
                lo = med + 1;
            }
            else {
                hi = med - 1;
            }
        }
        return lo;
    }
    private static int [] freq(char [] c) {
        int [] f = new int[26];
        for(char cc : c) {
            f[cc-'a']++;
        }
        return f;
    }
    private static void shuffle(int [] a) {
        for (int i = 0; i < a.length; i++) {
            int index = (int)(Math.random()*(i+1));
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
    private static int lowerBound(int [] a, int target) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo<=hi) {
            int med = lo + (hi-lo)/2;
            if(target >= a[med]) {
                lo = med + 1;
            }
            else {
                hi = med - 1;
            }
        }
        return lo;
    }
    static int numberOfSubsequences(String a, String b) {
        int [] dp = new int[b.length()+1];
        dp[0] = 1;
        for (int i = 0; i < a.length(); i++) {
            for (int j = b.length() - 1; j >=0;j--) {
                if(a.charAt(i) == b.charAt(j)) {
                    dp[j+1]+=dp[j];
                }
            }
        }
        return dp[dp.length - 1];
    }
    static long count(String a, String b)
    {
        int m = a.length();
        int n = b.length();

        // Create a table to store
        // results of sub-problems
        long lookup[][] = new long[m + 1][n + 1];

        // If first string is empty
        for (int i = 0; i <= n; ++i)
            lookup[0][i] = 0;

        // If second string is empty
        for (int i = 0; i <= m; ++i)
            lookup[i][0] = 1;

        // Fill lookup[][] in
        // bottom up manner
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // If last characters are
                // same, we have two options -
                // 1. consider last characters
                //    of both strings in solution
                // 2. ignore last character
                //    of first string
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    lookup[i][j] = lookup[i - 1][j - 1] +
                            lookup[i - 1][j];

                else
                    // If last character are
                    // different, ignore last
                    // character of first string
                    lookup[i][j] = lookup[i - 1][j];
            }
        }

        return lookup[m][n];
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
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