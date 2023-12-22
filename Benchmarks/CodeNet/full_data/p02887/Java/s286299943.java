import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Main {
    static Scanner sc = new Scanner();
 
    public static void main(final String[] args) throws IOException {
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        char temp = c[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (c[i] != temp) {
                temp = c[i];
                ans++;
            }
        }
        System.out.println(ans);
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
