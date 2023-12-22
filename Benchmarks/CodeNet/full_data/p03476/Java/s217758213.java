import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final int MAXN = 100000;
    private static boolean[] isPrime = new boolean[MAXN + 1];

    private static void generatePrimes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= MAXN; ++i) {
            if(isPrime[i]) {
                for(int j = 2 * i; j <= MAXN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        generatePrimes();
        int[] cumulativeCount = new int[MAXN + 1];
        for(int i = 1; i <= MAXN; ++i) {
            cumulativeCount[i] = cumulativeCount[i-1];
            if(isPrime[i] && isPrime[(i + 1) / 2]) {
                ++cumulativeCount[i];
            }
        }
        int q = scanner.nextInt();
        StringBuilder ans = new StringBuilder();
        while(q-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int cnt = cumulativeCount[r] - cumulativeCount[l - 1];
            ans.append(cnt + "\n");
        }
        scanner.close();
        System.out.println(ans.toString());
    }
}