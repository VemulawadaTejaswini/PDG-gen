import java.util.Scanner;

/**
 * TITLE : Bouquet
 * URL : https://atcoder.jp/contests/abc156/tasks/abc156_d
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i != a && i != b) {
                answer += calcNumOfCombination(n, i);
            }
        }
        System.out.println(answer % 1000000007);
        sc.close();
    }

    private static long calcNumOfCombination(int n, int r){
        r = Math.min(r, n - r);
        if (r == 1) {
            return n;
        }

        long sum = 1;
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - i + 1) / i;
        }
        return sum;
    }
}