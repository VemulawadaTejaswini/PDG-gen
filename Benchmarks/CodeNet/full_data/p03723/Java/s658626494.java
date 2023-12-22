import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Vector<int[]> vector = new Vector<>();

        int ans = 0;
        while (a%2==0 && b%2==0 && c%2==0) {
            for (int[] i : vector) {
                if (a == i[0] && b == i[1] && c == i[2]) {
                    System.out.println(-1);
                    return;
                }
            }
            vector.add(new int[]{a, b, c});

            int x = b/2 + c/2;
            int y = a/2 + c/2;
            int z = a/2 + b/2;
            a = x; b = y; c = z;
            ans++;
        }

        System.out.println(ans);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}