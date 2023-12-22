import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        String s = scanner.next();
        int n = s.length();
        int[] ans = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) == 'R') == (list.size() % 2 == 0)) {
                list.add(1);
            } else {
                list.set(list.size() - 1, list.get(list.size() - 1) + 1);
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            if (i % 2 == 0) {
                sum += list.get(i);
                ans[sum] += list.get(i) / 2;
                ans[sum - 1] += list.get(i) - list.get(i) / 2;
            } else {
                ans[sum] += list.get(i) - list.get(i) / 2;
                ans[sum - 1] += list.get(i) / 2;
                sum += list.get(i);
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}