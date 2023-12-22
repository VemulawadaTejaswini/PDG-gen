import java.util.Arrays;
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

        long ans = 0;
        // ここをソートしてから、同じものが並ぶ数をカウントしてみるか？
        Arrays.sort(sortedWords);
        int sameWordCount = 0;
        for (int i = 0; i <= N - 2; i++) {
            if(sortedWords[i].equals(sortedWords[i + 1])) {
                sameWordCount++;
                if (i == N - 2) {
                    ans += calcCombination(sameWordCount + 1,2);
                    break;
                }
            }
            else {
                ans += calcCombination(sameWordCount + 1,2);
                sameWordCount = 0;
            }
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