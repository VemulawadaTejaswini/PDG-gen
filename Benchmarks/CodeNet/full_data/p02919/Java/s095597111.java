import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt() - 1;
            q[p[i]] = i;
        }
        int[][] a = new int[n][4];
        List<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int j = lowerBound(list, q[i]);
            a[i][0] = 2 <= j ? list.get(j - 2) + 1 : 0;
            a[i][1] = 1 <= j ? list.get(j - 1) + 1 : 0;
            a[i][2] = j <= list.size() - 1 ? list.get(j) : n;
            a[i][3] = j <= list.size() - 2 ? list.get(j + 1) : n;
            list.add(j, q[i]);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (a[i][1] - a[i][0]) * (a[i][2] - q[i]) * (i + 1);
            ans += (q[i] - a[i][1] + 1) * (a[i][3] - a[i][2]) * (i + 1);
        }
        System.out.println(ans);
    }

    static <T extends Comparable<T>> int lowerBound(List<T> list, T value) {
        int left = -1;
        int right = list.size();
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (list.get(mid).compareTo(value) < 0) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
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