import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];
        boolean posi = false, nega = false, zero = false;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] = Math.abs(b[i] = scanner.nextInt());
            posi |= b[i] > 0;
            nega |= b[i] < 0;
            zero |= b[i] == 0;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (posi && nega) {
            Deque<Integer> posiDeque = new ArrayDeque<>();
            Deque<Integer> negaDeque = new ArrayDeque<>();
            Arrays.sort(b, Comparator.comparingInt(Math::abs));
            for (int i = 1; i < n; i++) {
                if (b[i] == 0) {
                    System.out.println("0 0");
                } else if (b[i] > 0) {
                    posiDeque.add(b[i]);
                } else {
                    negaDeque.add(b[i]);
                }
            }
            while (posiDeque.size() >= 2) {
                int i = posiDeque.poll();
                int j = negaDeque.poll();
                System.out.println(j + " " + i);
                negaDeque.add(j - i);
            }
            while (!negaDeque.isEmpty()) {
                int i = posiDeque.poll();
                int j = negaDeque.poll();
                System.out.println(i + " " + j);
                posiDeque.add(i - j);
            }
        } else {
            Arrays.sort(b, Comparator.comparingInt(Math::abs));
            System.out.println(zero ? sum : sum - a[0] * 2);
            for (int i = 1; i < n - 1; i++) {
                System.out.println(b[i - 1] + " " + b[i]);
                b[i] = b[i - 1] - b[i];
            }
            if (posi) {
                System.out.println(b[n - 1] + " " + b[n - 2]);
            } else {
                System.out.println(b[n - 2] + " " + b[n - 1]);
            }
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