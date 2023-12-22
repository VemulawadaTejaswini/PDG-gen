import java.io.*;
import java.util.*;
 
class Main {
    static Scanner scanner = new Scanner();
 
    public static void main(String[]$) throws IOException {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int sr = scanner.nextInt();
        int sc = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
 
        int l = sr;
        int r = w - sr + 1;
        int u = sc;
        int d = h - sc + 1;
 
        for (int i = n - 1; i >= 0; i--) {
            if (t.charAt(i) == 'L') {
                l--;
            } else if (t.charAt(i) == 'R') {
                r--;
            } else if (t.charAt(i) == 'U') {
                u--;
            } else if (t.charAt(i) == 'D') {
                d--;
            }
            if (l * r * u * d == 0) {
                System.out.println("NO");
                return;
            }
            if (s.charAt(i) == 'L' && r < w) {
                r++;
            } else if (s.charAt(i) == 'R' && l < w) {
                l++;
            } else if (s.charAt(i) == 'U' && d < h) {
                d++;
            } else if (s.charAt(i) == 'D' && u < h) {
                u++;
            }
        }
        System.out.println("YES");
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