import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt(), x3 = scanner.nextInt(), y3 = scanner.nextInt();
        System.out.println(Math.max(Math.max(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))),Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)))/(2+Math.max(Math.max(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))),Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)))/(Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))+Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3))))));
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