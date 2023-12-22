import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextDouble();
        }
        System.out.println(Main.getHeadsSuperior(nums, n));
    }

    protected static double getHeadsSuperior(double[] nums, int n) {
        double[][] probabilities = new double[n + 1][n + 1];
        probabilities[0][0] = 0;
        for (int i = 0; i < probabilities.length; i++) {
            for (int j = 0; j < probabilities.length; j++) {
                if (i == 0) {
                    probabilities[i][j] = j == 0 ? 1 : 0;
                    continue;
                }
                probabilities[i][j] = 0;
                probabilities[i][j] += probabilities[i - 1][j] * (1 - nums[i - 1]);
                if (j > 0) {
                    probabilities[i][j] += probabilities[i - 1][j - 1] * nums[i - 1];
                }
            }
        }
        double result = 0.0;
        for (int i = n / 2 + 1; i <= n; i++) {
            result += probabilities[n][i];
        }
        return result;
    }
}
