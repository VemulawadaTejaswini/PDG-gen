import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = (double) (scanner.nextInt() + 1) / 2;
        }
        double max = 0;
        for (int i = 0; i < n - k + 1; i++) {
            double sum = 0;
            for (int j = 0; j < k; j++) {
                sum += array[i + j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
