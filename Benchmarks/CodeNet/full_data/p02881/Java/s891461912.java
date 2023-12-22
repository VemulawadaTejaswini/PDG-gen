import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;
 
class Main {
    static Scanner sc = new Scanner();
 
    public static void main(final String[] args) throws IOException {
        int n = sc.nextInt();
        int n_sqrt = (int)Math.ceil(Math.sqrt(n));
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < n_sqrt; i++) {
            int temp = n/i;
            if (n%i == 0) {
                ans = temp+i;
            }
        }
        System.out.println(ans-2);
    }
 
    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
 
        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
