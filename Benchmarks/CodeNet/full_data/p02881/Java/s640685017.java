import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class Main {

    private static Set<List<Integer>> permutations;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        long n = in.nextLong();
        long min = Long.MAX_VALUE;
        for(long i = 1;i*i<=n;i++) {
            if(n%i==0) {
                long j = n/i;
                min = Math.min(min,i+j-2);
            }
        }
        out.println(min);
        out.flush();
    }
    public static String decodeString(String s) {
        Stack<String> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char [] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == '[') {
                int temp = i + 1;
                i++;
                while (i < c.length && c[i]!=']' && c[i]!='[') {
                    i++;
                }
                str.push(s.substring(temp,i));
                i--;
            }
            else if(c[i] == '{')
            {
                int temp = i + 1;
                while (i< c.length && c[i]!='}') {
                    i++;
                }
                String number = s.substring(temp,i);
                int count = Integer.parseInt(number);
                StringBuilder ss = new StringBuilder();
                String added = str.pop();
                while (count-->0) {
                    ss.append(added);
                }
                if(!str.isEmpty()) {
                    String pop = str.pop();
                    str.push(pop+ss.toString());
                }
                else {
                    sb.append(ss);
                }
            }
            else if(Character.isLetter(c[i])) {
                sb.append(c[i]);
            }
        }
        return sb.toString();
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