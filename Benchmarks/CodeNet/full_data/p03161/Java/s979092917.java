import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BigInteger[] dp = new BigInteger[10000];

    static BigInteger fib(int n) {
        n -= 1;
        if (n <= 1) return BigInteger.ONE;
        if (dp[n] != null) return dp[n];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;
        dp[n] = dp[n-1].add(dp[n-2]);
        return dp[n];
    }
    static long solve(int n) {
        if(n<=2) return n*2;
        long [] dp = new long[n];
        dp[0] = 2;
        dp[1] = 4;
        dp[2] = 7;
        int numberOfWhite = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i-1]-numberOfWhite)*2 + 1;
            numberOfWhite*=2;
        }
        return dp[n-1];
    }
    private static int convert(int first, int second) {
        int k = 1;
        int equation = second-first+k*26;
        while(equation<97) {
            k++;
            equation = second-first+k*26;
        }
        return equation;
    }
    private static boolean check(int n) {
        return n>=97 && n<=122;
    }
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);

        int n = in.nextInt();
        int k = in.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i]=in.nextInt();
        }
        int [] dp = new int[n];
        dp[0]=0;
        Arrays.fill(dp,1,dp.length,Integer.MAX_VALUE);
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<=i+k;j++) {
                if(j<n) {
                    dp[j] = dp[i]+Math.abs(a[i]-a[j]);
                }
            }
        }
        System.out.println(dp[n-1]);
        out.flush();
    }
    static int currentDrawBack(int a,int b,int c, int d) {
        int max = Math.max(a,b);
        int min = Math.min(c,d);
        return min-max+1;
    }
    static int lowerBound1(Integer [] a,int target) {
        int lo = 0;
        int hi = a.length - 1;
        while(lo<=hi) {
            int med = hi-(hi-lo)/2;
            if(target<=a[med]) hi = med - 1;
            else lo = med + 1;
        }
        return lo;
    }
    static int lowerBound(int [] a,int target) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo<=hi) {
            int med = hi-(hi-lo)/2;
            if(target<=a[med]) {
                hi = med - 1;
            }
            else {
                lo = med + 1;
            }
        }
        return lo;
    }

    private static void reverse(char [] c, int k, int index) {
        for(int i=index;i<(2*index+k)/2;i++) {
            System.out.println(i + " " + (k-index - 1));
            char temp = c[i];
            c[i] = c[k-i-1];
            c[k-i-1] = temp;
        }

    }
    static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    private static String whoWin(int [] a) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(int n:a) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()) {
            if(m.getValue()%2==1) return "Conan";
        }
        return "Agasa";
    }


    private static int [] prefixSum(int [] a) {
        int [] prefix = new int[a.length+1];
        for(int i=1;i < prefix.length;i++) {
            prefix[i] = prefix[i-1] + a[i-1];
        }
        return prefix;
    }
    private static int [] charFrequency(String a) {
        int [] freq = new int[26];
        char [] cc = a.toCharArray();
        for(char c : cc) {
            freq[c-'a']++;
        }
        return freq;
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


