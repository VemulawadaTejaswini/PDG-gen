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


        int n = in.nextInt();
        int [] a = new int[n];
        int maxIndex = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            if(a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            q.add(a[i]);
        }
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > secondMax && i!=maxIndex) {
                secondMax = a[i];
                secondMaxIndex = i;
            }
        }


        for (int i = 0; i < a.length; i++) {
            if(a[i] == a[maxIndex]) {
                out.println(a[secondMaxIndex]);
            }
            else {
                out.println(a[maxIndex]);
            }
        }
        out.flush();
    }
    static boolean isPrime(int n) {
        if(n<2) return false;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    static int min(char[][] c) {
        int [] row = new int[c.length];
        int [] col = new int[c[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if(c[i][j] == '*') {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        int sum = c.length + c[0].length;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                int count = sum -  row[i] - col[j];
                if(c[i][j] == '.') count--;
                ans = Math.min(ans,count);
            }
        }

        return ans;
    }
    static String solve(String s,String t, String p) {
        int [] main = freq(t);
        int [] sf = freq(s);
        int [] pf = freq(p);

        for (int i = 0; i < sf.length; i++) {
            if(sf[i] > main[i]) {
                return  "NO";
            }
        }
        for (int i = 0; i < sf.length; i++) {
            sf[i]+=pf[i];
        }
        for (int i = 0; i < sf.length; i++) {
            if(sf[i] < main[i]) {
                return "NO";
            }
        }
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c,index + 1);
            if(index < 0) {
                return "NO";
            }
        }
        return "YES";
    }
    private static int [] freq(String s) {
        int [] f = new int[26];
        for(char c : s.toCharArray()) {
            f[c-'a']++;
        }
        return f;
    }

}

class Point {
    int x;
    int y;
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}

class Lift {

    int level;
    int time;

    public int getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }

    public Lift(int level, int time) {
        this.level = level;
        this.time = time;
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