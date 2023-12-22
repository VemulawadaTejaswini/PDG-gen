import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] sortedWords = new String[N];
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            char[] tmp = word.toCharArray();
            Arrays.sort(tmp);
            String sortedWord = String.valueOf(tmp);
            sortedWords[i] = sortedWord;
        }

        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < N; i++) {
            map.put(sortedWords[i], new Integer(0));
        }

        for (String sortedWord : sortedWords) {
            int currentCount = map.get(sortedWord);
            map.put(sortedWord, currentCount + 1);
        }
        long ans = 0;
        for (Integer count : map.values()) {
            ans += calcCombination(count, 2);
        }
        System.out.print(ans);
    }

    long calcCombination(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Arguments must be 0 and over.");
        }
        else if (n == r || r == 0) {
            return 1;
        }
        else if (n < r) {
            return 0;
        }
        else {
            long result = 1;
            for (int i = 1; i <= r; i++) {
                result = result * (n - i + 1) / i;
            }
            return result;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}