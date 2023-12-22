import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            sum += values[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int firstPileSum = 0;
        for (int i = values.length - 1; i > 0; i--) {
            firstPileSum += values[i];
            int remainSum = sum - firstPileSum;
            int candidate = Math.abs(firstPileSum - remainSum);
            if (candidate < minDiff) {
                minDiff = candidate;
            }
        }

        System.out.println(minDiff);
    }
}
