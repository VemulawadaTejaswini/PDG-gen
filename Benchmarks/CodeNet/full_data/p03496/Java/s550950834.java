import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int max = 0;
        int maxIndex = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (Math.abs(max) < Math.abs(a[i])) {
                max = a[i];
                maxIndex = i;
            }
        }
        List<Point> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (maxIndex != i) {
                ans.add(new Point(maxIndex + 1, i + 1));
            }
        }
        if (max == 0) {
            System.out.println(0);
            return;
        } else if (max > 0) {
            for (int i = 2; i <= n; i++) {
                ans.add(new Point(i - 1, i));
            }
        } else {
            for (int i = n - 1; i > 0; i--) {
                ans.add(new Point(i, i + 1));
            }
        }
        System.out.println(ans.size());
        for (Point point : ans) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Scanner {
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