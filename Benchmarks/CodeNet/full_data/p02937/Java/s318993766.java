import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        char[] s = scanner.next().toCharArray();
        int n = s.length;
        char[] t = scanner.next().toCharArray();
        int m = t.length;
        List<Integer>[] list = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            list[s[i] - 'a'].add(i);
        }
        int loop = 0;
        int lastIndex = -1;
        for (int i = 0; i < m; i++) {
            List<Integer> indexList = list[t[i] - 'a'];
            if (indexList.size() == 0) {
                System.out.println(-1);
                return;
            }

            int ok = -1, ng = indexList.size();
            while (Math.abs(ok - ng) > 1) {
                int mid = (ok + ng) / 2;

                if (lastIndex >= indexList.get(mid)) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            if (ng >= indexList.size()) {
                lastIndex = indexList.get(0);
                loop++;
            } else {
                lastIndex = indexList.get(ng);
            }
        }
        System.out.println(loop * n + lastIndex + 1);
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