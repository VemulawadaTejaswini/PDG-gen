import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class Main {

    private static Set<List<Integer>> permutations;
    private static final double LOAD_FACTOR = 0.75;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

       int r = in.nextInt();
       String s = in.next();
       String ss = s.substring(0,r/2);
       String sss = s.substring(r/2);
       out.println(ss.equals(sss) ? "Yes" : "No");




        out.flush();
    }

    private static void dfs(String s, int index) {
        if(index == s.length()) {
            ans++;
            return;
        }
        int one = (s.charAt(index) - '0');
        if(validate(one)) {
            dfs(s,index+1);
        }
        if(index+1<s.length()) {
            String ss = s.substring(index,index + 2);
            int two = Integer.parseInt(ss);
            if(validate(two)) {
                dfs(s,index+2);
            }
        }
    }
    private static boolean validate(int n) {
        return n>=1 && n<=26;
    }
    private static long solve(long n) {
        if(isPrime(n)) {
            return n;
        }
        else {
            int count = 0;
            List<Long> list = new ArrayList<>();
            for (long i = 2; i*i <=n; i++) {
                if(n%i==0) {
                    count++;
                    list.add(i);
                    if(i*i!=n) {
                        list.add(n/i);
                        count++;
                    }
                }
            }

            if (count == 1) {
                 return (long)Math.sqrt(n);
            }
            else {
                return 1;
            }
        }
    }
    private static boolean isPrime(long n) {
        if(n < 2) return false;
        for (long i = 2; i*i<=n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    private static boolean can(String s, String t) {
        int num = 0;
        char a = ' ';
        char b = ' ';
        char c = ' ';
        char d = ' ';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)) {
                if(a == ' ') {
                    a = s.charAt(i);
                    b = t.charAt(i);
                }
                else {
                    c = s.charAt(i);
                    d = t.charAt(i);
                }
                num++;
            }
            if(num > 2) return false;
        }

        return num == 0 ||  a == c && b == d;
    }
    private static boolean [] erath() {
        boolean[] isPrime = new boolean[200_000 + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        int n = isPrime.length - 1;
        for (int i = 2; i*i<=n; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j <=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }



    public static long gcd(long a, long b) {
       while (b > 0) {
           long temp = a;
           a = b;
           b = temp%b;
       }
       return a;
    }


    private static int factorization(long n) {
        Set<Long> set = new HashSet<>();
        for(long i = 2; i * i <=n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if(n > 1) set.add(n);
        return set.size();
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