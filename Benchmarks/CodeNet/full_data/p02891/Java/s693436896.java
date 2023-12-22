// AGC039_A 解説を見て書いた
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long ans = 0;

        boolean isSame = true;
        for (int i = 1; i < s.length; i++) {
            if (s[0] != s[i]) {
                isSame = false;
                break;
            }
        }

        if (isSame) {  // 全て同じ文字だった場合
            ans = s.length / 2 * k;
        } else {
            List<Integer> cntList = new ArrayList<>();

            int cnt = 1;
            for (int i = 1; i < s.length; i++) {
                if (s[i-1] != s[i]) {
                    cntList.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            cntList.add(cnt);

            int lastIndex = cntList.size()-1;
            int first = cntList.get(0);
            int last = cntList.get(lastIndex);

            for (int i = 1; i < lastIndex; i++) {
                ans += cntList.get(i) / 2 * k;
            }

            if (s[0] == s[s.length-1]) {
                ans += (first + last) / 2 * (k-1);
                ans += last / 2;
            } else {
                ans += first / 2 * k;
                ans += last / 2 * k;
            }
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