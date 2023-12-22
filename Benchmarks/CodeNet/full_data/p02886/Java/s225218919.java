import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class Main {

    private static int[][] st;
    private static int [] logs;
    private static Set<List<Integer>> permutations;
    private static int index = 0;
    private static int max = 0;
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);


        int n = in.nextInt();
        int [] a = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                sum+=a[i]*a[j];
            }
        }
        out.println(sum);
        out.flush();
    }
    private static void reverse(char [] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    private static void shuffle(int [] a) {
        for (int i = 0; i < a.length; i++) {
            int index = (int)(Math.random()*(i+1));
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    private static String reverse(char [] c) {
        int i = 0;
        int j = c.length - 1;
        while (i <= j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }
    private static boolean isPalindrome (StringBuilder sb) {
        int i = 0;
        int j = sb.length() - 1;
        while (i <= j) {
            if(sb.charAt(i++) != sb.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private static void outputQueue(Map<String,LinkedList<String>> map, String faculty, InputReader.OutputWriter out) {
        out.println(faculty+":");
        LinkedList<String> q = map.get(faculty);
        while (!q.isEmpty()) {
            out.println(q.pollFirst());
        }
        out.println();
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