
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pattern = scanner.next();


        int[][] memo = new int[pattern.length()][13];
        int[] remTable = new int[pattern.length()];

        remTable[remTable.length - 1] = 1;

        for (int i = remTable.length - 2; i >= 0; i--) {
            remTable[i] = (remTable[i + 1] * 10) % 13;
        }

        System.out.println(run(pattern, 0, remTable, 5, memo));
    }

    private static int modValue = (int) (Math.pow(10, 9) + 7);

    private static int run(String pattern, int i, int[] remTable, int rem, int[][] memo) {
        if (i == pattern.length()) {
            return rem == 0 ? 1 : 0;
        }

        if (memo[i][rem] != 0) {
            return Math.max(0, memo[i][rem]);
        }

        int d = Character.getNumericValue(pattern.charAt(i));

        int sum = 0;

        if (d == -1) { // '?' case
            for (int j = 0; j <= 9; j++) {
                int actualRem = (j * remTable[i]) % 13;
                int newRem = rem - actualRem;
                if (newRem < 0) newRem += 13;
                sum += run(pattern, i + 1, remTable, newRem, memo);
                sum = sum % modValue;
            }
        } else {
            int actualRem = (d * remTable[i]) % 13;
            int newRem = rem - actualRem;
            if (newRem < 0) newRem += 13;
            sum += run(pattern, i + 1, remTable, newRem, memo);
            sum = sum % modValue;
        }

        if (sum == 0) {
            memo[i][rem] = -1;
        } else {
            memo[i][rem] = sum;
        }

        return sum;
    }
}
